package be.technifutur.thread;

public class Test1
{

    public static void main(String[] args)
    {

        LinePrinter lp1 = new LinePrinter('-', 20, 50);
        LinePrinter lp2 = new LinePrinter('+', 20, 50);

        lp1.print();
        lp2.print();

    }

}
