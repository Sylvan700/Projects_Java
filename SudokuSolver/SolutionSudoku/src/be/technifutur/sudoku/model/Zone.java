package be.technifutur.sudoku.model;

public class Zone
{

    private final String id;
    private int data;
    public Zone(String id)
    {
        this.id = id;
        this.data = 0;
    }

    public String getId()
    {
        return this.id;
    }

    public int getValue()
    {
        return data;
    }

    public boolean add(int value)
    {
        int old = data;
        //              mask
        data |= 1 << (value-1);
        return old != data;
    }

    public boolean contains(int value)
    {
        //                      mask
        return (data & (1 << (value-1))) != 0;
    }

    public boolean remove(int value)
    {
        int old = data;
        //                 mask
        data &= ~(1 << (value-1));
        return old != data;
    }
}
