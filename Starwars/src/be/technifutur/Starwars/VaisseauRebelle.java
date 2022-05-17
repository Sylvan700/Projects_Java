package be.technifutur.Starwars;

public class VaisseauRebelle extends VaisseauAncetre
{

    public VaisseauRebelle(String aName)
    {
        super(aName);
    }

    @Override
    public String getTeam()
    {
        String team = "Rebelle";

        return team;
    }

    public void messageR2D2(String message)
    {

        System.out.println("BIBOUP BIB");

    }

}
