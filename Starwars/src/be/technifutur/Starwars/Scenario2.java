package be.technifutur.Starwars;

public class Scenario2
{

    public static void main(String[] args)
    {

        VaisseauSecurise v1 = new VaisseauSecurise("Faucon");
        VaisseauSecurise v2 = new VaisseauSecurise("XWing");

        System.out.println(" Nombre de vaisseau actuellement en vol: " + VaisseauSecurise.getNumberFlying());
        v1.shoot();
        v1.launch();
        v2.launch();
        v1.launch();
        System.out.println("Nombre de vaisseau actuellement en vol: " + VaisseauSecurise.getNumberFlying());
        v1.shoot();
        v1.reload(5);
        System.out.print(v1.getName() + " ammo : ");
        System.out.println(v1.getBullet());
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        v1.shoot();
        System.out.print(v1.getName() + " ammo : ");
        System.out.println(v1.getBullet());
        v1.reload(3);
        v1.shoot();
        v1.landing();
        System.out.println("Nombre de vaisseau actuellement en vol: " + VaisseauSecurise.getNumberFlying());
        v2.landing();
        v2.landing();
        System.out.println("Nombre de vaisseau actuellement en vol: " + VaisseauSecurise.getNumberFlying());
    }

}
