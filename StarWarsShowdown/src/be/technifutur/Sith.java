package be.technifutur;

public class Sith extends Empire implements Force
{
    public Sith(String aName) { super(aName); }

    public void fight()
    {



    }

    @Override
    public boolean useForce()
    {
        boolean hasF = true;
        return hasF;
    }
}
