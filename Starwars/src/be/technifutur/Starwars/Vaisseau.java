package be.technifutur.Starwars;

public class Vaisseau
{

    public String name ;
    public int bullet ;

    public void shoot()
    {

        if(this.bullet>0)
        {

            System.out.print(name + " : ");
            System.out.println("ZIIINNNK");

            bullet--; // Sans mettre le "this" le compilateur vas trouver automatiquement la valeur nécessaire. A savoir que si une variable locale du même nom existe, elle a priorité.

        }
        else
        {

            System.out.print(name + " : ");
            System.out.println(" -No ammo-");

        }

    }

}
