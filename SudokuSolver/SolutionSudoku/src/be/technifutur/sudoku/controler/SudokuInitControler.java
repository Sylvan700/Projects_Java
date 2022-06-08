package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.SudokuException;

public class SudokuInitControler
{

    private SudokuModel modelN;

    public void setSudoku(SudokuModel model)
    {
        modelN = model;
    }

    public SudokuModel getSudoku()
    {

        return modelN;
    }

    public void request(String s)
    {
        // Le texte donné est coupé en différent tableau a chaque '.', deux fois.
        String[] tempTabString = s.split("\\.", 3);
        // 2 coordonées sont récupéré du tableau de String et convertis en int.
        int x = Integer.valueOf(tempTabString[0]);
        int y = Integer.valueOf(tempTabString[1]);
        // La dernière coordonées est convertie en char.
        char z = tempTabString[2].charAt(0);
        // Les valeurs converties sont rendues au modèles.
        try {
            modelN.setValue(x -1, y - 1, z);
        } catch (SudokuException e) {
            throw new RuntimeException(e);
        }
    }
}
