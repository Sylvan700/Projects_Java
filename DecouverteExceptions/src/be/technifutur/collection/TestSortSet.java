package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

public class TestSortSet
{

    public static void main(String[] args)
    {

        SortedSet<Personne> col = new TreeSet<>(Arrays.asList(Personne.dataTest()));

        System.out.println(col.size());

        Personne personneVar = Personne.dataTest()[2];
        System.out.println(col.contains(personneVar));
        System.out.println(col.remove(personneVar));
        System.out.println(col.remove(personneVar));
        System.out.println(col.contains(personneVar));
        col.add(personneVar);

        ArrayList<Object> autres = new ArrayList<>();
        autres.add(Personne.dataTest()[1]);
        autres.add(Personne.dataTest()[4]);
        autres.add(Personne.dataTest()[6]);
        autres.add(Personne.dataTest()[7]);

        for(Personne p : col)
        {
            System.out.println(p);
        }

    }

}
