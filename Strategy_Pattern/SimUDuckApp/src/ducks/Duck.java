package SimUDuckApp.src.ducks;

import SimUDuckApp.src.capabilities.fly.FlyCapability;
import SimUDuckApp.src.capabilities.quak.QuakCapability;
import SimUDuckApp.src.capabilities.swim.SwimCapability;

/**
 * Übersicht über die Fähigkeiten der Enten:
 *
 * 1. Stockeente (Stockente):
 *    - Schwimmen: Ja, als echte Wildente kann die Stockente hervorragend schwimmen.
 *    - Quaken: Ja, sie kann typische Entenlaute von sich geben.
 *    - Fliegen: Ja, die Stockente ist eine flugfähige Ente.
 *
 * 2. SchnatterEnte:
 *    - Schwimmen: Ja, als echte Entenart kann die Schnatterente schwimmen.
 *    - Quaken: Ja, sie quakt, wie es der Name andeutet.
 *    - Fliegen: Ja, wie viele Enten kann auch die Schnatterente fliegen.
 *
 * 3. DecoEnte (Dekorationsente):
 *    - Schwimmen: Nein, eine Dekorationsente ist meist aus festen Materialien und daher nicht zum Schwimmen geeignet.
 *    - Quaken: Nein, da es sich nur um eine dekorative Figur handelt.
 *    - Fliegen: Nein, sie ist nicht lebendig und kann daher nicht fliegen.
 *
 * 4. PfeifenteEnte (Pfeifente):
 *    - Schwimmen: Ja, sie ist eine echte Entenart und kann schwimmen.
 *    - Quaken: Nein, Pfeifenten pfeifen eher, statt zu quaken.
 *    - Fliegen: Ja, wie andere Enten ist die Pfeifente flugfähig.
 *
 * 5. QuietscheEnte:
 *    - Schwimmen: Ja, da es sich um ein Gummispielzeug handelt, schwimmt sie im Wasser, aber nicht wie echte Enten.
 *    - Quaken: Nein, sie quietscht nur, wenn man sie drückt.
 *    - Fliegen: Nein, sie ist ein Spielzeug und kann daher nicht fliegen.
 *
 **/

public abstract class Duck
{
    private SwimCapability swimCapability;
    private FlyCapability flyCapability;
    private QuakCapability quakCapability;

    public Duck(SwimCapability swimCapability, FlyCapability flyCapability, QuakCapability quakCapability)
    {
        this.swimCapability = swimCapability;
        this.flyCapability = flyCapability;
        this.quakCapability = quakCapability;
    }

    public abstract void display();

    public void swim()
    {
        this.swimCapability.swim();
    }

    public void fly()
    {
        this.flyCapability.fly();
    }

    public void quak()
    {
        this.quakCapability.qack();
    }


    public QuakCapability getQuakCapability()
    {
        return quakCapability;
    }

    public void setQuakCapability(QuakCapability quakCapability)
    {
        this.quakCapability = quakCapability;
    }

    public FlyCapability getFlyCapability()
    {
        return flyCapability;
    }

    public void setFlyCapability(FlyCapability flyCapability)
    {
        this.flyCapability = flyCapability;
    }

    public SwimCapability getSwimCapability()
    {
        return swimCapability;
    }

    public void setSwimCapability(SwimCapability swimCapability)
    {
        this.swimCapability = swimCapability;
    }
}

