package Sudoku;

import java.util.Scanner;

public class SudokuJav
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String entree = "";
        int valeurs = 0;
        boolean dejaexist = false;

        System.out.println("Ajouter ou retirer des chiffres d'une ligne ( avec + ou -). Tous les chiffres seront différents");
        entree = scan.nextLine(); // récupère ce que l'utilisateur écrit/envoie

        while( ! entree.equals("q")) // Tant que l'utilisateur n'envoie pas "q", on ne quitte pas la boucle
        {
            if(entree.length() == 2) // Si l'utilisateur a bien écrit 2 caractères...
            {
               if(Character.isDigit(entree.charAt(1))) // Si le second caractères écrit est un chiffre...
               {
                   int valEntree = Character.digit(entree.charAt(1),10); // conversion du 2eme caractère entré en chiffre (base 10)

                   dejaexist = CompaValeurs(valeurs, valEntree);
                   if(dejaexist && entree.charAt(0) != '-')
                   {
                       System.out.println("Entrée déjà existante");
                       System.out.println("valeur en binaire "+ Integer.toBinaryString(valeurs));
                   }
                   else
                   {
                       if(entree.charAt(0) == '+' && valEntree != 0) // Si le premier caractère entré est "+" et le second différent de 0 alors...
                       {
                           valeurs = ajoutValeurs(valeurs, valEntree);
                           System.out.println("Ajout de la valeur " + valEntree);
                           System.out.println("valeur en binaire "+ Integer.toBinaryString(valeurs));
                       }
                       else if(entree.charAt(0) == '-' && valEntree != 0)
                       {
                           valeurs = retraitValeurs(valeurs, valEntree);
                           System.out.println("Retrait de la valeur " + valEntree);
                           System.out.println("valeur en binaire "+ Integer.toBinaryString(valeurs));
                       }
                       else
                       {
                           System.out.println("0 n'est pas une entrée valable");
                       }
                   }
               }
               else
               {
                   System.out.println("Mauvaise entrée");
               }
            }
            else if(entree.equals("reset"))
            {
                valeurs = 0;
                System.out.println("Reset des valeurs");
            }
            else
            {
                System.out.println("Mauvaise entrée");
            }

            entree = scan.nextLine();
        }

    }

    public static int ajoutValeurs(int ancValeur, int nouvelValeur)
    {
        int result = 0;
        int mask = 1 << (nouvelValeur -1); // création de masque, décalage de bits vers la gauche basé sur le nombre entré
        result = ancValeur | mask; // Comparaison entre les bits actuels et le masque, la ou le masque fait 1, un 1 est ajouté
        return result;
    }

    public static int retraitValeurs(int ancValeur, int nouvelValeur)
    {
        int result = 0;
        int mask = 1 << (nouvelValeur -1);
        mask = ~ mask; // Inverse le masque pour avoir 1 partout sauf la ou la valeur entree est.
        result = ancValeur & mask; // Comparaison entre les bits actuels et le masque, la ou le masque fait 0, un 0 est ajouté
        return result;
    }

    public static boolean CompaValeurs(int ancValeur, int nouvelValeur)
    {
        boolean result = false;
        int mask = 1 << (nouvelValeur -1);
        result = (ancValeur & mask) == mask;

        return result;
    }

}
