package be.technifutur.Starwars;

public class Scenario3
{

    public static void main (String[] args)
    {
        // VaisseauAncetre va = new VaisseauAncetre("Faucon_Millenium"); Etant abstrait, VaisseauAncetre ne peu pas être initialisé.
        VaisseauEmpire ve = new VaisseauEmpire("Destroyer");
        VaisseauRebelle vr = new VaisseauRebelle("X-Wing");
        DeathStar ds = new DeathStar();

        ve.launch();
        System.out.println(VaisseauAncetre.getNumberFlying());
        ve.landing();
        VaisseauAncetre va2 = ve; // Ancètre reçois l'adresse du descendant, mais le desccendant ne peu pas recevoir l'adresse de l'ancètre.
        // VaisseauEmpire ve2 = va;

        vr.messageR2D2("Fuyez, l'empire arrive!");
        ve.messageDarthVador("Exécutez l'ordre 66.");

        System.out.println(vr.getName() + " est " + vr.getTeam());
        System.out.println(va2.getName() + " est " + va2.getTeam());

        ds.attractVessel(va2);

    }

}
