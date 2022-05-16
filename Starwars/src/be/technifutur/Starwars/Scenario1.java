package be.technifutur.Starwars;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Scenario1
{

    public static void main (String[] args)
    {
        System.out.println(" Il y a fort, fort longtemps, dans une galaxie très lointaine... ");
        Vaisseau v1 = null;
        Vaisseau v2 = new Vaisseau();
        Vaisseau v3 = v2;
        int i;

        v1 = new Vaisseau();    // 3 variables pour 2 instances de Vaisseau. v1 et v2 sont initialisé avec new mais v3 n'est pas initialisé.
        System.out.println(v1.name);
        System.out.println(v1.bullet); // Affichage de la valeur par défaut (0), si variable non initialisée
        // System.out.println(i); Ne marche pas car il s'agit d'une variable locale, elle n'est pas intialisée par défaut.
        v1.name = "Millenium";
        v2.name = "Xwing";

        System.out.println(v1.name);
        System.out.println(v2.name);
        System.out.println(v3.name);

        v3.name = "Vwing"; // v3 n'étant pas instancié, il s'agit de l'adresse de v2, c'est v2 qui est changé.

        System.out.println(v1.name);
        System.out.println(v2.name);
        System.out.println(v3.name);

        System.out.println("---------------------------BATTLEFIELD---------------------------------------------------");
        v1.bullet = 2;
        v1.shoot();
        v2.shoot();

        System.out.print(v1.name + " ammo : ");
        System.out.println(v1.bullet);
        System.out.print(v2.name + " ammo : ");
        System.out.println(v2.bullet);

    }

}