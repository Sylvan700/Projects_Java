package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SamouraiSudokuModel implements SudokuModel
{
    private static final int sizeL = 21;
    private static final int sizeC = 21;
    private final char[][] tab = new char[sizeL][sizeC];

    public SamouraiSudokuModel()
    {
        for( int y  = 0 ; y < 3 ; y = y +1)
        {
            for( int x  = 0 ; x < 6 ; x = x +1)
            {

                tab[20 - x][9 + y] = '/';
                tab[9 + y][20 - x] = '/';
                tab[9 + y][x] = '/';
                tab[x][9 + y] = '/';
            }

        }

    }

    public boolean isValidValue(char c)
    {
        return false;
    }

    public int getLineSize()
    {
        return sizeL;
    }

    public int getColumnSize()
    {
        return sizeC;
    }

    public boolean isEmpty(int line,int column)
    {
        if((tab[line][column] == EMPTY_VALUE) | (tab[line][column] == '/'))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public void setValue(int line, int column, char c) throws OutOfSudokuException {
        if(line <sizeL && column <sizeC && line > -1 && column > -1)
        {

            tab[line][column] = c;

        }
        else
        {
            throw new OutOfSudokuException();
        }
    }

    public char getValue(int line, int column) throws OutOfSudokuException
    {
        if(line <sizeL && column <sizeC && line > -1 && column > -1)
        {
            if(tab[line][column] != EMPTY_VALUE)
            {
                return tab[line][column];
            }
            else
            {
                return EMPTY_VALUE;
            }
        }
        else
        {
            throw new OutOfSudokuException();
        }


    }

}
