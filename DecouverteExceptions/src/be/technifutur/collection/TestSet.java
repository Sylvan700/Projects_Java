package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet
{

    public static void main(String... args)
    {

        Set<Personne> col = new HashSet<>(Arrays.asList(Personne.dataTest()));
        Set<Character> test  = new HashSet<>(Arrays.asList('1','2'));
        Set<Character> test2  = new HashSet<>(Arrays.asList(new Character[]{'1','2'}));

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

        col.removeAll(autres);

        for(Personne p : col)
        {
            System.out.println(p);
        }

    }

}
