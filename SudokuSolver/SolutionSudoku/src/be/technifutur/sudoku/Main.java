package be.technifutur.sudoku;

import be.technifutur.sudoku.controler.SudokuInitControler;
import be.technifutur.sudoku.model.SudokuModel4x4;
import be.technifutur.sudoku.vue.SudokuVue4x4;
import be.technifutur.sudoku.vue.SudokuVue9x9;

public class Main
{
    SudokuModel4x4 sudo = new SudokuModel4x4();


    public static void main(String[] args)
    {
        System.out.println(new SudokuVue9x9().getGrilleVide());
       // SudokuInitControler.request("1.2.3");
    }
}
