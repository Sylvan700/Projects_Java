package be.technifutur.Starwars;

public class VaisseauEmpire extends VaisseauAncetre
{

    public VaisseauEmpire(String aName)
    {
        super(aName);
    }

    @Override
    public String getTeam()
    {
        String team = "Empire";

        return team;
    }

    public void messageDarthVador(String message)
    {

        System.out.println("KKRCCHH... KRRCHHH...");

    }

}
