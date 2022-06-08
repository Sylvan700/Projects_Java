package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList
{

    public static void main(String[] args)
    {

        List<Personne> col = new ArrayList<>(Arrays.asList(Personne.dataTest()));

        System.out.println(col.size());

        Personne personneVar = Personne.dataTest()[2];
        System.out.println(col.contains(personneVar));
        System.out.println(col.remove(personneVar));
        System.out.println(col.remove(personneVar));
        System.out.println(col.contains(personneVar));
        col.add(personneVar);

        ArrayList<Object> autres = new ArrayList<>();
        autres.add(0,Personne.dataTest()[1]);
        autres.add(0,Personne.dataTest()[4]);
        autres.add(0,Personne.dataTest()[6]);
        autres.add(0,Personne.dataTest()[7]);


        System.out.println(autres);
        col.removeAll(autres);

        for(Personne p : col)
        {
            System.out.println(p);
        }

    }

}
