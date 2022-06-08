package be.technifutur.collection;

import be.technifutur.data.Personne;

import java.util.Comparator;

public class AgeComparator implements Comparator<Personne>
{

    @Override
    public int compare(Personne o1, Personne o2)
    {
        return o1.getAge() - o2.getAge();

    }

}
