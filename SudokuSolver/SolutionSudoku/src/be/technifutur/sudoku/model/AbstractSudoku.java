package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public abstract class AbstractSudoku implements SudokuModel
{
    // private char[][] tab = new char[getLineSize()][getColumnSize()];
    private final Cell[][] grid;
    private static int sizeL;
    private static int sizeC;

    public AbstractSudoku(int line, int column, Cell[][] grid1)
    {

        this.sizeC = column;
        this.sizeL = line;
        this.grid = grid1;

    }

    public int getLineSize()
    {
        return sizeL;
    }

    public int getColumnSize()
    {
        return sizeC;
    }

    public final boolean isEmpty(int line,int column)
    {

        // return tab[line][column] == EMPTY_VALUE;
        return this.getValue(line,column) == EMPTY_VALUE;

    }

    public boolean isValidValue(char c)
    {
        return false;
    }

    public final void setValue(int i, int i1, char c) throws SudokuException
    {

        if(i <sizeL && i1 <sizeC && i > -1 && i1 > -1)
        {
            if(isValidValue(c))
            {

                // tab[i][i1] = c;
                if(c == EMPTY_VALUE)
                {
                    grid[i][i1].removeValue();
                }
                else
                {
                    grid[i][i1].setValue(c);
                }

            }
            else
            {
                throw new InvalidValueSudokuException(c, "is no good");
            }
        }
        else
        {
            throw new OutOfSudokuException(i, i1, " no, no");
        }

    }

    public final char getValue(int i, int i1)
    {

        if(grid[i][i1].getValue() == EMPTY_VALUE)
        {
            return EMPTY_VALUE;
        }
        else
        {
            // return tab[i][i1];
            return grid[i][i1].getValue();
        }

    }

    public void lock()
    {

        for(Cell[] line : grid)
        {
            for(Cell c : line)
            {
                if(!c.isEmpty())
                {
                    c.lock();
                }
            }
        }

    }

}
