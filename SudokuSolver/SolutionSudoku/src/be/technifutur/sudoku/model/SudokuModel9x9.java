package be.technifutur.sudoku.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuModel9x9 extends AbstractSudoku
{

    private static Set<Character> validChar  = new HashSet<>(Arrays.asList('1','2', '3', '4', '5', '6', '7', '8', '9', EMPTY_VALUE));

    public SudokuModel9x9()
    {
        super(9,9, createGrid());
    }

    private static Cell[][] createGrid()
    {

        Cell[][] cells = new Cell[9][9];
        Zone[] lineZones = new Zone[9];
        Zone[] columnZones = new Zone[9];
        Zone[] squareZones = new Zone[9];

        for(int num = 0; num < 9; num++)
        {

            lineZones[num] = new Zone("L"+(num + 1));
            columnZones[num] = new Zone("C"+(num + 1));
            squareZones[num] = new Zone("S"+(num + 1));

        }
        for(int lig = 0; lig<9; lig++)
        {

            for(int col = 0; col < 9; col++)
            {
                Cell cell = new Cell();
                cell.addZone(lineZones[lig]);
                cell.addZone(columnZones[col]);
                cell.addZone(squareZones[(lig/3)*3 + col/3]);
                cells[lig][col] = cell;
            }

        }

        return cells;

    }

    @Override
    public boolean isValidValue(char c)
    {
        return validChar.contains(c);
    }

}
