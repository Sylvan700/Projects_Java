package be.technifutur.Starwars;

public class DeathStar
{

    public void attractVessel(VaisseauAncetre v)
    {

        if(v instanceof VaisseauRebelle) // Teste si l'objet est de type "VaisseauRebelle".
        {
            attractVessel((VaisseauRebelle) v); // Si le type est bien de VaisseauRebelle, réalise la méthode en assurant qu'il s'agit bien d'un VaisseauRebelle.
        }
        else if (v instanceof  VaisseauEmpire)
        {

            attractVessel((VaisseauEmpire) v);

        }
        else
        {
            System.out.println("L'étoile de la mort attire le vaisseau " + v.getName() + " !");
            v.landing();
            System.out.println(v.getTeam());
            System.out.println("bruh");

        }

    }

    public void attractVessel(VaisseauEmpire v)
    {

        System.out.println("L'étoile de la mort attire le vaisseau " + v.getName() + " !");
        v.landing();
        System.out.println(v.getTeam());
        System.out.println("Malding Vador");

    }

    public void attractVessel(VaisseauRebelle v)
    {

        System.out.println("L'étoile de la mort attire le vaisseau " + v.getName() + " !");
        v.landing();
        System.out.println(v.getTeam());
        System.out.println("A l'aide, notre vaisseau se fait attirer par l'empire!");

    }

}
