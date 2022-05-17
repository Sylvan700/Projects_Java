package be.technifutur.Starwars;

public class DeathStar
{

    public void attractVessel(VaisseauAncetre v)
    {

        System.out.println("L'étoile de la mort attire le vaisseau " + v.getName() + " !");
        v.landing();
        System.out.println(v.getTeam());
        v.launch();

    }

}
