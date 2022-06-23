package be.technifutur.thread;

public class Test2
{

    public static void main(String[] args) throws InterruptedException
    {

        LinePrinter lp1 = new LinePrinter('-', 20, 50);
        LinePrinter lp2 = new LinePrinter('+', 20, 50);

        // Encapsulation de l'action dans un runnable
        Runnable action1 = createRunnable(lp1);
        Runnable action2 = createRunnable(lp2);

        // création des threads qui vont exécuter l'action
        Thread thread1 = new Thread(action1);
        Thread thread2 = new Thread(action2);

        // démarrage des threads
        thread1.start();
        thread2.start();

        System.out.println("finis?");

    }

    private static Runnable createRunnable(LinePrinter lp)
    {

        return new Runnable()
        {

            @Override
            public void run()
            {

                lp.print();

            }

        };

    }

}
