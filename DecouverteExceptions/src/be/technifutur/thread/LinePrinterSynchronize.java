package be.technifutur.thread;

public class LinePrinterSynchronize
{

    private char cara;
    private int nbLine;
    private int lineSize;

    public LinePrinterSynchronize(char cara, int nbLine, int lineSize) {
        this.cara = cara;
        this.nbLine = nbLine;
        this.lineSize = lineSize;
    }

    public void print()
    {

        for (int i = 0; i < nbLine; i++)
        {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            synchronized (System.out)
            {
                printLine();
                System.out.println();
            }
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
