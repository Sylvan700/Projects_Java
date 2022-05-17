package be.technifutur.Starwars;

public abstract class VaisseauAncetre
{
    // Equivalent de VaisseauSecurise mais sert d'exemple pour l'héritage.
    private String name = "Unnamed_Vessels" ;
    private int bullet ;
    private static int nbVesselsFly = 0; // La méthode et l'int sont en static pour limiter leur utilisation a leur classe de base.
    private boolean isFlying = false;

    public VaisseauAncetre(String aName) // Demande dans ses paramètres un nom a la création de l'objet.
    {
        if (aName != null && aName.trim().length() > 0) // trim() vérifie la suppression d'espace a gauche et a droite du String.
            name = aName;

    }

    public abstract String getTeam();

    public void shoot()
    {

        if(this.bullet>0 && isFlying)
        {

            System.out.print(name + " : ");
            System.out.println("ZIIINNNK");

            bullet--;
        }
        else if(!isFlying)
        {

            System.out.println(this.name + " ne peux pas tirer tant qu'il est au sol");

        }
        else
        {

            System.out.print(name + " : ");
            System.out.println(" -No ammo-");

        }

    }

    public boolean reload( int bullet)
    {
        boolean canreload = false;

        if(bullet>0) // priorité a la variable locale, utiliser un "this" utiliserait le bullet de l'objet indiqué.
        {
            this.bullet = this.bullet + bullet;
            System.out.printf(this.name + " Recharge %s missile(s)%n", bullet);

            canreload = true;
        }
        else
        {

            System.out.println(" Can't reload ammo.");

        }

        return  canreload;

    }

    public boolean removeBullet( int bullet)
    {

        boolean remove = false;

        if(this.bullet >= bullet && bullet > 0)
        {

            this.bullet = this.bullet - bullet;
            remove = true;

        }

        return remove;

    }

    public void launch()
    {

        if(!isFlying)
        {

            System.out.println(this.name + " décolle!");

            isFlying = true;

            nbVesselsFly++;

        }
        else
        {

            System.out.println(this.name + " est déjà en vol!");

        }

    }

    public void landing()
    {

        if(isFlying)
        {

            System.out.println(this.name + " Atteris!");

            isFlying = false;

            nbVesselsFly--;

        }
        else
        {

            System.out.println(this.name + " est déjà au sol!");

        }

    }

    public static int getNumberFlying()
    {

        return nbVesselsFly;

    }

    public int getBullet()
    {
        return this.bullet;
    }

    public String getName()
    {
        return this.name;
    }

}
