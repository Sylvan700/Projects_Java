package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestIterator
{

    public static void main(String[] args)
    {
        //Iterable<Personne> personnes = Arrays.asList(Personne.dataTest());
        Iterable <Personne> personnes = new ArrayList <> (Arrays.asList(Personne.dataTest()));
        Iterator <Personne> iterator = personnes.iterator();

        while (iterator.hasNext())
        {
            Personne p = iterator.next();
            System.out.println(p.getName());
        }

        iterator = personnes.iterator();

        while (iterator.hasNext())
        {
            Personne p = iterator.next();
            if(p.getName().endsWith("d"))
                iterator.remove();
        }
        for (Personne p : personnes)
        {
            System.out.println(p.getPrenom());
        }
    }

}
