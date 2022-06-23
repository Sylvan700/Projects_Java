package be.technifutur.thread;

public class Test3
{

    public static void main(String[] args)
    {

        LinePrinter lp1 = new LinePrinter('-', 20, 50);
        LinePrinter lp2 = new LinePrinter('+', 20, 50);

        new Thread(() -> lp1.print()).start();
        new Thread(() -> lp2.print()).start();

        System.out.println("finis?");

    }

    private static Runnable createRunnable(LinePrinter lp)
    {

        return () -> lp.print();

    }

}
