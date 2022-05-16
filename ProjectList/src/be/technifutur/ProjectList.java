package be.technifutur;

import java.util.Scanner;

public class ProjectList {

    public static void main(String[] args)
    {
	    Liste listExample = null;
	    int taille = 0;

		listExample = FonctionsListe.add(listExample, 5);
		listExample = FonctionsListe.add(listExample, 10);
		listExample = FonctionsListe.add(listExample, 12);
		listExample = FonctionsListe.add(listExample, 13);
		listExample = FonctionsListe.add(listExample, 6);

	    taille = FonctionsListe.size(listExample);
	    System.out.println("Taille : " + taille);

		FonctionsListe.afficher(listExample);

	    System.out.print("élément 3 : " + FonctionsListe.get(listExample, 3));

    }
}
