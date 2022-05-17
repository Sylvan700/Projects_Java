package be.technifutur;

public class Empire extends Character
{

    public Empire(String aName) { super(aName); }

    @Override
    public String showTeam()
    {
        String team = "Empire";
        return team;
    }

    @Override
    public void fight()
    {
    }
}
