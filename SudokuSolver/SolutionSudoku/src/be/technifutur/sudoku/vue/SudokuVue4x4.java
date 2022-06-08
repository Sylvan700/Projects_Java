package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel4x4;

public class SudokuVue4x4 {
    public String getGrilleVide()
    {
        return """
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        | . .  | . . |
                        | . .  | . . |
                        +------+-----+
                        """;
    }

    public String getGrille(SudokuModel4x4 sudo)
    {

        String txtEmpty = getGrilleVide().replace(".","%s"); // remplace les points par des valeurs de String(%s)
        Character[] tab = new Character[16]; // Chaine de caractères de la taille du nombre de case dans le carré

        int i2 = 0;

        for(int i = 0 ; i < sudo.getColumnSize() ; i = i + 1)
        {

            for(int i1 = 0 ; i1 < sudo.getLineSize() ; i1 = i1 + 1)
            {
                if(sudo.getValue(i , i1) != sudo.EMPTY_VALUE)
                {

                    tab[i2] = sudo.getValue(i , i1);

                }
                else
                {

                    tab[i2] = '.';

                }

                i2++;

            }

        }

        return String.format(txtEmpty , (Object[])tab);
    }
}
