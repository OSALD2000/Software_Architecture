## SimUDuckApp

---
    Entwickeln ein Programm die folgendes kann:
    Beliebig viele Entenarten und Enten können in einem Simulationsspiel
    beim quaken <code>quak()</code> und beim schwimmen <code>swim()</code>
    beobachtet werden.
---

---

## Erste Idee 
    
    wäre einen Basisclass Duck zu erstellen, von dem dann die 
    verschiedenen Entenarten abgeleitet werden.

    also Duck <---------- Stockente
              <---------- SchnatterEnte
              <---------- Pfeifente

    Duck hat die zwei gemeinsame Methoden  quak() und swim(), die im 
    Basisclass implementiert und von allen Subclasses genutzt werden.
    und ein abstrakte Methode display(), die von Subclasses implemntiert 
    werden muss, da jeder Ente schaut anders aus !!. 

    Problem:
    wenn wir neue Feature für unsere Anwendung machen wollen, z.B fly()
    ist dann ein Problem, da nicht alle Ente fliegen können!!

    also und für die einzelen Ente ist es dann eine Redudante Code!!

    also Lösung ist in Basisclass zu implementieren und dann leer overriden 
    im Subclasses, die nicht fliegen können ==> NICHT SCHÖN!!!

    Das Problem läuft weiter so z.B. auch beim neuen Classen zu unsere Hiracie
    erstellen wie QuietscheEntchen.
---

## Zwischenergebnis:
    
    Vererbung führt in diesem Fall wohl nicht zur Lösung
        
        - Die Default-Implemntierungen passen einfach nicht
        - wenn sie mehr als nur "leer" sein sollen, steht identischer
          Code in mehreren Sub-Enten-Klassen
            . Grundidee der OOP wirdf karikiert
            . Im Wartungsfall die Hölle

---

---

## Lösung 

    Interfaces "Einsetzen der Stratgy Pattern"

    andere Art der Strukturierung zwishcen Gemeinsamkeiten und Unterscheiden

    ==> Nicht mehr <b> is-a </b> sondern <b>has-a</b> Beziehung

---
