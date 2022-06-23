package be.technifutur.thread;

public class Consummer
{

    private Oven oven;


    public Consummer(Oven oven) {
        this.oven = oven;
    }

    public void removeBread()
    {

        Breads b = oven.remove();

        for (int i = 0; i < 15 && b != null; i++)
        {
            System.out.println("Bread " +i + " removed");
            b = oven.remove();
        }
        System.out.println("No more bread");

    }
}
