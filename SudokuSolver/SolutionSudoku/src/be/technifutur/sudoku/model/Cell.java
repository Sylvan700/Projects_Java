package be.technifutur.sudoku.model;

import java.util.HashSet;
import java.util.Set;

import static be.technifutur.sudoku.controler.SudokuModel.EMPTY_VALUE;

public class Cell
{

    private char value = EMPTY_VALUE;
    private boolean lock = false;
    private Set<Zone> zoneSet = new HashSet<>();
    public void addZone(Zone zO)
    {

        this.zoneSet.add(zO);

    }

    public boolean isEmpty()
    {
        return value == EMPTY_VALUE;
    }

    public boolean isLock()
    {
        return this.lock;
    }

    public char getValue()
    {
        return value;
    }

    public void lock()
    {
        lock = true;
    }

    public void setValue(char value2) throws CellLockException, DoublonException
    {

        if(this.value != value2)
        {
            if(this.lock)
            {
                throw new CellLockException();
            }
            if(value2 != EMPTY_VALUE)
            {
                int val = Character.digit(value2, 10);
                for(Zone z : zoneSet)
                {
                    if(z.contains(val))
                    {
                        throw new DoublonException(z.getId(), value2);
                    }
                }
            }
            if(this.value != EMPTY_VALUE)
            {
                int val = Character.digit(this.value, 10);
                for(Zone z : zoneSet)
                {
                    z.remove(val);
                }
            }
            if(value2 != EMPTY_VALUE)
            {
                int val = Character.digit(value2,10);
                for(Zone z : zoneSet)
                {
                      z.add(val);
                }
            }

            this.value = value2;

        }

    }

    public char removeValue() throws CellLockException
    {

        char old = this.value;
        if(this.value != EMPTY_VALUE)
        {

            if(this.lock)
            {
                throw new CellLockException();
            }
            if(this.value != EMPTY_VALUE)
            {
                int val = Character.digit(this.value,10);
                for(Zone a : zoneSet)
                {
                    a.remove(val);
                }
            }

            this.value = EMPTY_VALUE;
        }

        return old;

    }
}
