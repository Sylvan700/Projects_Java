package be.technifutur.thread;

public class Test5
{

    public static void main(String[] args) throws InterruptedException
    {

        LinePrinterSynchronize lp1 = new LinePrinterSynchronize('-', 20, 50);
        LinePrinterSynchronize lp2 = new LinePrinterSynchronize('+', 20, 50);

        // Encapsulation de l'action dans un runnable
        Runnable action1 = createRunnable(lp1);
        Runnable action2 = createRunnable(lp2);

        // création des threads qui vont exécuter l'action
        Thread thread1 = new Thread(action1);
        Thread thread2 = new Thread(action2);

        // démarrage des threads
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("finis?");

    }

    private static Runnable createRunnable(LinePrinterSynchronize lp)
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
