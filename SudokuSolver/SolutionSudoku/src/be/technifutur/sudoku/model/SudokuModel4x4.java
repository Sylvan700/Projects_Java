package be.technifutur.sudoku.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuModel4x4 extends AbstractSudoku
{

    private static Set<Character> validChar  = new HashSet<>(Arrays.asList('1','2', '3', '4', EMPTY_VALUE));

    public SudokuModel4x4()
    {
        super(4,4, createGrid());
    }

    private static Cell[][] createGrid()
    {

        Cell[][] cells = new Cell[4][4];
        Zone[] lineZones = new Zone[4];
        Zone[] columnZones = new Zone[4];
        Zone[] squareZones = new Zone[4];

        for(int num = 0; num < 4; num++)
        {

            lineZones[num] = new Zone("L"+(num + 1));
            columnZones[num] = new Zone("C"+(num + 1));
            squareZones[num] = new Zone("S"+(num + 1));

        }
        for(int lig = 0; lig<4; lig++)
        {

            for(int col = 0; col < 4; col++)
            {
                Cell cell = new Cell();
                cell.addZone(lineZones[lig]);
                cell.addZone(columnZones[col]);
                cell.addZone(squareZones[(lig/2)*2 + col/2]);
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
