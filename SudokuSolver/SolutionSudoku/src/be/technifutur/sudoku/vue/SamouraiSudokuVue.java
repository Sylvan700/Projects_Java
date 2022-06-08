package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SamouraiSudokuModel;

public class SamouraiSudokuVue
{

    public String getGrilleVide()
    {
        return
                """
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                                | . . . | . . . | . . . |
                                | . . . | . . . | . . . |
                                | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
                +-------+-------+-------+-------+-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                | . . . | . . . | . . . |       | . . . | . . . | . . . |
                +-------+-------+-------+       +-------+-------+-------+
                """;
    }

    public String getGrille(SamouraiSudokuModel sudo) throws OutOfSudokuException
    {
        String txtEmpty = getGrilleVide().replace(".","%s"); // remplace les points par des valeurs de String(%s)
        Character[] tab = new Character[(21 * 21) - 4 * (3 * 6)]; // Chaine de caractères de la taille du nombre de case dans le carré

        int i2 = 0;

        for(int i = 0 ; i < sudo.getColumnSize()  ; i = i + 1)
        {

            for(int i1 = 0 ; i1 < sudo.getLineSize() ; i1 = i1 + 1)
            {
                if(sudo.isEmpty(i, i1))
                {

                    if(sudo.getValue(i , i1) != '/')
                    {
                        tab[i2] = '.';
                        i2++;
                    }

                }
                else
                {
                    tab[i2] = sudo.getValue(i , i1);
                    i2++;
                }

            }

        }

        return String.format(txtEmpty , (Object[])tab);
    }
}
