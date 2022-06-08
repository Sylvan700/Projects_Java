package be.technifutur.enumTest;

import java.util.Optional;
import java.util.Scanner;

public class DecouverteEnum
{

    public static void main(String[] args)
    {
        JourSemaine j = null;
        JourSemaine i = null;
        j = JourSemaine.MERCREDI;
        i = j;
        if(i == j)
        {

            System.out.println(i); // appelle la méthode "toString" de l'objet automatiquement.

        }
        System.out.println(j.compareTo(JourSemaine.JEUDI)); // Compare en fonction de l'ordre dans lequels ils ont été inscrit.
        System.out.println(j.compareTo(JourSemaine.LUNDI));

        JourSemaine[] values = JourSemaine.values();
        for(JourSemaine s: values)
        {
            System.out.println(s+ " , "+ s.ordinal());
        }

        i = JourSemaine.LUNDI.valueOf("LUNDI");
        System.out.println(i.ordinal()); // affiche la position de la valeur dans le "tableau"
        System.out.print("Entrez un jour de la semaine");
        String input = new Scanner(System.in).nextLine();
        try
        {
            i = JourSemaine.valueOf(input);
            System.out.println(i.ordinal());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("No, no, no :)");
        }

        /* Un optional est un objet qui contiens une valeur, présente ou pas.
        Optional<Enum.EnumDesc<JourSemaine>> jourSemaineEnumDesc = i.describeConstable(); */

        System.out.println(i.isOuvrable());
    }

}
