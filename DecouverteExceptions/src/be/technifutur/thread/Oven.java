package be.technifutur.thread;

import java.util.ArrayList;
import java.util.List;

public class Oven
{

    private List<Breads> listBreads = new ArrayList<>();
    private boolean close = false;

    public synchronized void Closed()
    {
        close = true;
        this.notifyAll();
    }

    public synchronized boolean add(Breads b)
    {
        boolean add = false;
        while (listBreads.size() >= 3 && !close)
        {

            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
       if (listBreads.size() < 3)
       {

           add = listBreads.add(b);
           this.notifyAll();
           //System.out.println("Added Bread");

       }
        return add;
    }

    public synchronized Breads remove()
    {
        Breads breads = null;
        while (listBreads.size() == 0 && !close)
        {

            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        if (listBreads.size() > 0)
        {

            breads = listBreads.remove(0);
            breads.setCooked(true);
            this.notifyAll();
            //System.out.println("Removed bread");

        }
        return breads;
    }
}
