package be.technifutur.Starwars;

public class Scenario3
{

    public static void main (String[] args)
    {
    VaisseauAncetre va = new VaisseauAncetre("Faucon_Millenium");
    VaisseauEmpire ve = new VaisseauEmpire("Destroyer");
    VaisseauRebelle vr = new VaisseauRebelle("X-Wing");

    ve.launch();
        System.out.println(VaisseauAncetre.getNumberFlying());
    ve.landing();
    VaisseauAncetre va2 = ve; // Ancètre reçois l'adresse du descendant, mais le desccendant ne peu pas recevoir l'adresse de l'ancètre.
    // VaisseauEmpire ve2 = va;
    }

}
