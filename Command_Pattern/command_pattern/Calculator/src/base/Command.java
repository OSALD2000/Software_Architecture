package command_pattern.Calculator.src.base;


public interface  Command
{
    double execute(double currentValue);
    double undo(double currentValue);
}
