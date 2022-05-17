package be.technifutur;

public class Jedi extends Rebel implements Force
{

    public Jedi(String aName) { super(aName); }

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
