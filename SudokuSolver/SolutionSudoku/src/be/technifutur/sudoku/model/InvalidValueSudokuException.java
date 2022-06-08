package be.technifutur.sudoku.model;

public class InvalidValueSudokuException extends SudokuException
{

    private char savedChar;
    private String savedMessage;
    public InvalidValueSudokuException(char value, String le_message)
    {
        this.savedChar = value;
        this.savedMessage = le_message;
    }

    public InvalidValueSudokuException()
    {
    }


    public char getvalue()
    {
        return savedChar;
    }
    public String getMessage()
    {
        return savedMessage;
    }
}
