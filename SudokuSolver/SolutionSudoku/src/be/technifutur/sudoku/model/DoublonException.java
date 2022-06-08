package be.technifutur.sudoku.model;

public class DoublonException extends SudokuException
{
    private final String id;
    private final char value;
    public DoublonException(String id, char value2)
    {
        super("La valeur"+value2+" est en doublon dans la zone: "+id);
        this.id = id;
        this.value = value2;
    }

    public DoublonException()
    {
        this.id = " ";
        this. value = ' ';
    }

    public String getZoneId() {
        return id;
    }

    public char getDoublonValue() {
        return value;
    }
}
