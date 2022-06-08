package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.*;

public class TestMap
{

    public static void main(String[] args)
    {
        // Création d'une "map"(triée) avec comme clé un objet équivalent a un integer, et comme valeur une liste(Set) de l'objet Personne.
        Map<Integer , Set<Personne>> dizaineMap = new TreeMap<>();
        // Création d'une liste de tableau de personnes.
        List<Personne> personneList = Arrays.asList(Personne.dataTest());

        // Boucle sur chaque personnes de la liste
        for(Personne p : personneList)
        {
            // Division entière pour obtenir uniquement la dizaine du nombre( 74 deviens 70, 37 deviens 30)
            int age = p.getAge() /10 *10;

            Set<Personne> personneSet = dizaineMap.get(age);
            if(personneSet == null)
            {

                personneSet = new HashSet<>();
                dizaineMap.put(age, personneSet);

            }

            personneSet.add(p);

        }

        for(int a : dizaineMap.keySet())
        {
            System.out.println("age : "+ a);
            for(Personne p : dizaineMap.get(a))
            {
                System.out.println(p);
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for(Set<Personne> set : dizaineMap.values())
        {
            for(Personne p : set)
            {
                System.out.println(p);
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for(Map.Entry<Integer, Set<Personne>> entry : dizaineMap.entrySet())
        {
            System.out.println("age : "+ entry.getKey());
            for(Personne p : entry.getValue())
            {
                System.out.println(p);
            }
        }

    }

}
