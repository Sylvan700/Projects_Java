package be.technifutur.sudoku.model;

public class OutOfSudokuException extends SudokuException
{

    private  int line;
    private  int column;
    private String savedMessage;

    public OutOfSudokuException(int line, int column, String le_message)
    {

        this.column = column;
        this.line = line;
        this.savedMessage = le_message;

    }

    public OutOfSudokuException()
    {
    }

    public int getLine()
    {

        return line;
    }

    public int getColumn()
    {

        return column;
    }

    public String getMessage()
    {
        return savedMessage;
    }
}
