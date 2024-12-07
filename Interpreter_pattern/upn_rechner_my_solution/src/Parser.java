package upn_rechner_my_solution.src;

import upn_rechner_my_solution.src.expressions.*;

import java.util.ArrayList;

public class Parser
{
    private final char op1 = '+';
    private final char op2 = '-';
    private final char op3 = '*';
    private final char op4 = '/';

//    public String calculate(String calculation)
//    {
//        char lastOperator = '0';
//        boolean firstOperator = true;
//
//        char curryOperator = '0';
//        boolean isCurryOperator = false;
//
//
//        StringBuilder number = new StringBuilder();
//        StringBuilder upnCalculation= new StringBuilder();
//
//        for(int i = calculation.length()-1; i >= -1; i--)
//        {
//            if (i == -1)
//            {
//                upnCalculation.append(' ').append(number).append(' ').append(lastOperator);
//                continue;
//            }
//            char c = calculation.charAt(i);
//            if (isOperator(c))
//            {
//                upnCalculation.append(" ").append(number).append(" ");
//                if (lastOperator != '0')
//                {
//                    if (lastOperator != c)
//                    {
//                        if (!firstOperator)
//                        {
//                            upnCalculation.append(" ").append(lastOperator);
//                            if (isCurryOperator)
//                            {
//                                isCurryOperator = false;
//                                upnCalculation.append(' ').append(curryOperator);
//                            }
//                        }else
//                        {
//                            if (!isCurryOperator)
//                            {
//                                isCurryOperator = true;
//                                curryOperator = lastOperator;
//                            }else
//                            {
//                                if (curryOperator == this.op3 || curryOperator == this.op4)
//                                {
//                                    upnCalculation.append(' ').append(curryOperator);
//                                }
//
//                                upnCalculation.append(' ').append(lastOperator).append(curryOperator);
//                                isCurryOperator = false;
//                            }
//                        }
//                        firstOperator = true;
//                    }else
//                    {
//                        firstOperator = false;
//                    }
//                }
//                lastOperator = c;
//                number = new StringBuilder();
//            }else
//            {
//                if (c != ' ') number.insert(0, c);
//            }
//        }
//
//        return upnCalculation.toString();
//    }

    public Expression parse(String calculation)
    {
        String calculation_trim = calculation.trim();
        ArrayList<Expression> expressions = new ArrayList<>();

        ArrayList<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (char c : calculation_trim.toCharArray())
        {
            if (Character.isDigit(c))
            {
                number.append(c);
            }
            if (c == op1 || c == op2 || c == op3 || c == op4)
            {
                if (!number.isEmpty())
                {
                    tokens.add(number.toString());
                    number = new StringBuilder();
                }
                tokens.add(c + "");
            }
        }
        tokens.add(number.toString());

        _parse(expressions, '0', tokens, 0);

        return  expressions.getFirst();
    }

    private void _parse(ArrayList<Expression> stack, char zwischenSpeicher, ArrayList<String> tokens, int idx)
    {
        if (idx == tokens.size())
        {
            return;
        }
        else if (zwischenSpeicher == '0')
        {
            switch (tokens.get(idx)) {
                case "+" -> _parse(stack, op1, tokens, idx + 1);
                case "*" -> _parse(stack, op3, tokens, idx + 1);
                case "-" -> _parse(stack, op2, tokens, idx + 1);
                case "/" -> _parse(stack, op4, tokens, idx + 1);
                default -> {
                    stack.add(new NumberExpression(Integer.parseInt(tokens.get(idx))));
                    _parse(stack, '0', tokens, idx + 1);
                }
            }
        }
        else if (zwischenSpeicher == '*')
        {
            Expression first_operand = stack.removeLast();
            NumberExpression second_operand = new NumberExpression(Integer.parseInt(tokens.get(idx)));
            stack.addLast(new MultiplicationExpression(first_operand, second_operand));
            _parse(stack, '0', tokens, idx + 1);
        }
        else if (zwischenSpeicher == '/')
        {
            Expression first_operand = stack.removeLast();
            NumberExpression second_operand = new NumberExpression(Integer.parseInt(tokens.get(idx)));
            stack.add(new DivisionExpression(first_operand, second_operand));
            _parse(stack, '0', tokens, idx + 1);
        }
        else if (zwischenSpeicher == '+')
        {
            _parse(stack, '0', tokens, idx);
            Expression first_operand = stack.removeLast();
            Expression second_operand = stack.removeLast();
            stack.addLast(new AddExpression(first_operand, second_operand));
        }
        else if (zwischenSpeicher == '-')
        {
            _parse(stack, '0', tokens, idx);
            Expression second_operand = stack.removeLast();
            Expression first_operand = stack.removeLast();
            stack.add(new SubtractionExpression(first_operand ,second_operand));
        }
    }
}
