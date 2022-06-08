package be.technifutur.sudoku.model;

public class CellLockException extends SudokuException
{
    public CellLockException(String s)
    {
        super(s);
    }

    public CellLockException()
    {
    }
}
