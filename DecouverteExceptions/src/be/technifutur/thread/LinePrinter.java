package be.technifutur.thread;

public class LinePrinter
{

    private char cara;
    private int nbLine;
    private int lineSize;

    public LinePrinter(char cara, int nbLine, int lineSize) {
        this.cara = cara;
        this.nbLine = nbLine;
        this.lineSize = lineSize;
    }

    public void print()
    {

        for (int i = 0; i < nbLine; i++)
        {

           printLine();
            System.out.println();

        }

    }

    private void printLine()
    {

        for (int i = 0; i < lineSize; i++)
        {
            System.out.println(cara);
        }

    }

}
