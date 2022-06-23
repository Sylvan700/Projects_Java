package be.technifutur.thread;

public class Producer implements Runnable
{

    private Oven oven;

    public Producer(Oven oven) {
        this.oven = oven;
    }

    public void run()
    {

        boolean added = true;

        for (int i = 0; i < 15 && added; i++)
        {
            System.out.println("Bread " +i + " added");
            added = oven.add(new Breads());


        }

        System.out.println("No more space");

    }

}
