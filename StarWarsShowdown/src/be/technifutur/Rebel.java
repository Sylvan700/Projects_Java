package be.technifutur;

public class Rebel extends Character
{
    public Rebel(String aName)
    {
        super(aName);
    }

    @Override
    public String showTeam()
    {
        String team = "Rebel";

        return team;
    }

    @Override
    public void fight()
    {
    }

}
