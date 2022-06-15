    package be.technifutur.sudokuSolver;

    import be.technifutur.sudoku.model.SudokuModel9x9;
    import be.technifutur.sudoku.vue.SudokuVue9x9;

    // val = non modifiable(get mais pas set), le String est optionel dans ce cas-ci car la valeur est reconnue comme String.
    val nom /*: String*/ = "toto";
    // var = modifiable(get et set)
    var prenom : String? = null;

    // fonction de premier niveau, appellable directement en référencant le chemin du package
    fun main()
    {

        println("Hello World");
        val sudo : SudokuModel9x9 = SudokuModel9x9();
        val vue : SudokuVue9x9 = SudokuVue9x9();
        val acc : SudokuAcesser = SudokuAcesser(sudo);

        //acc[0,1] = '4';
        //acc.set(0,1,'4');

        println(vue.getGrille(sudo));

    }