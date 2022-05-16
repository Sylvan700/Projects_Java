package be.technifutur;

public class FonctionsListe
{
    public static int get(Liste l , int pos)
    {
        if(pos > 0)
        {
            for(int i = 1 ; i<pos ; i = i+1)
            {
                l = l.suivant;
            }
        }
        return l.valeur;
    }

    public static int size(Liste l)
    {
        int taille = 1;
        while(l.suivant != null)
        {
          l = l.suivant;
          taille = taille + 1;
        }

        return taille;
    }

    public static void set(Liste l , int pos , int valeur)
    {

        for(int i = 1 ; i < pos ; i = i + 1)
        {
            l = l.suivant;
        }
        l.valeur = valeur;
    }

    public static Liste add(Liste l, int valeur)
    {
        Liste newl;
        Liste templ = l;

        newl = new Liste(); // création d'une nouvelle liste
        newl.valeur = valeur; // setup de la valeur de la liste
        newl.suivant = null; // setup de l'emplacement suivant, qui est vide

        if(l != null) // Si la liste n'est pas vide...
        {
            while(templ.suivant != null) // tant que l'emplacement de la liste suivant n'est pas vide, continue
            {
                templ = templ.suivant; // la liste avance d'un emplacement
            }
            newl.suivant = templ.suivant; // Quand on atteind la fin de la liste, indique que l'adresse de l'élément suivant notre nouvel élément est null.
            templ.suivant = newl; // le nouvel élément est placé juste a coté de la fin de la liste.
        }
        else // Si la liste est vide
        {
            l = newl;
        }

        return l;
    }

    public static Liste addWithPos(Liste l, int valeur, int pos)
    {
        Liste newl;
        Liste templ = l;

        newl = new Liste(); // création d'une nouvelle liste
        newl.valeur = valeur; // setup de la valeur de la liste
        newl.suivant = null; // setup de l'emplacement suivant, qui est vide

        if(pos > 0) // Si la position correspond a un emplacement de la liste supérieur a zéro...
        {
            for(int i = 1 ; i < pos - 1 ; i = i + 1)
            {
                templ = templ.suivant; // Avance d'emplacement un par un dans une liste temporaire jusq'a atteindre l'emplacement juste avant la position.
            }
            newl.suivant = templ.suivant; // l'adresse de la position est utilisée pour indiquer l'emplacement suivant le nouvel élélement de la liste
            templ.suivant = newl; // En se basant sur l'adresse de l'élément précédent, l'emplacement du nouvel élément est indiqué
        }
        else // Si la liste est vide
        {
            newl.suivant = l; // l'emplacement a coté du nouvel élément est null
            l = newl; // le nouvel élément est placé a l'adresse a coté du null
        }

        return l;
    }

    public static void afficher(Liste l)
    {
        int pos = 1;

        System.out.print("Position : " + pos + " | ");
        System.out.println("Valeur : " + l.valeur);

        while(l.suivant != null)
        {
            pos = pos + 1;
            l = l.suivant;
            System.out.print("Position : " + pos + " | ");
            System.out.println("Valeur : " + l.valeur);
        }
    }
}
