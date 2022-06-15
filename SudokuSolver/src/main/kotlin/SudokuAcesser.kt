package be.technifutur.sudokuSolver

import be.technifutur.sudoku.model.SudokuModel9x9

class SudokuAcesser(val model : SudokuModel9x9)
{
    operator fun get(line : Int, column : Int) : Char = model.getValue(line,column);
    //operator fun set(line : Int, column : Int) : Char = model.setValue(line,column);
}

class CellAccesser(val line : Int, val column : Int, val sudoku : SudokuAcesser)
{
    var value : Char
        get() = sudoku[line, column] /*sudoku.model.getValue(line,column)*/
        set(value) = sudoku.model.setValue(line,column,value);

}


