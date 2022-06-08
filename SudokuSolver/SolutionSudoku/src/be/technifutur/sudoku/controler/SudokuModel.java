package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SudokuException;

public interface SudokuModel
{

    public static final char EMPTY_VALUE = '\u0000';

    public abstract int getLineSize();

    public abstract int getColumnSize();

    public abstract boolean isValidValue(char c);

    public abstract void setValue(int i, int i1, char c) throws SudokuException;

    public abstract char getValue(int line, int column) throws OutOfSudokuException;

}
