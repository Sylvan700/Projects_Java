package be.technifutur.constructeur;

public class ConstructeurTest
{

    public static void main(String[] args)
    {
        AnC a = new DesC();
        System.out.println(a.getI());
    }

}

class AnC
{
   private int i;
   private int j = 5;
    {           // Bloc d'initialisation, instantiation de la classe, ce code se lance
        System.out.println("Code d'initialisation");
        System.out.println("i = "+i);
        i = 10;
        System.out.println("i = "+i);
    }

    public AnC()
    {
        /* Ce "this" n'est pas une adresse d'objet mais une fonction, cette fonction en particulier ne peu être utilisé
        que sur la première ligne, comm un "super". Constructeur de même héritage, "this" est utilisé,
        dans les autres cas il s'agira de super. */
        this(6);
        i = 0;
        System.out.println("Code du constructeur Ancêtre sans paramètres");
        System.out.println("i = "+i);
    }

    public AnC(int param)
    {
        // super(); Est écrit par défaut si non-écrit.
        this.i = param % 4;
        System.out.println("Code du constructeur Ancêtre");
        System.out.println("i = "+i);
    }

    public int getI()
    {
        return i;
    }
}

class DesC extends AnC
{
   /* Ce qui est fait automatiquement par Java.
   public DesC()
   {
       super();
   } */

}