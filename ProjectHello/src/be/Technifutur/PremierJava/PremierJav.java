package be.Technifutur.PremierJava;

import java.util.Scanner;

public class PremierJav
{

    public static void main(String[] args)
    {

        int nbr = 0;
        String entree = "";
        boolean entier = false;
        int[] divider = new int[100];
        Scanner scan = new Scanner(System.in);

        // Supérieur ou égal a 2
        // Divisible uniquement par lui même et 1
        System.out.println("Enter a number between 1 & 100 to know if it is an integer");
        entree = scan.nextLine();
        nbr = Integer.parseInt(entree);

        if (nbr >= 2 && nbr <= 100)
        {

            for (int i = 1; i <100; i = i+1)
            {

                if (nbr % i == 0 && (i == 1 || i == nbr))
                {
                    System.out.println(nbr + "is an integer between 1 & 100");
                }
                else
                {
                    entier = false;
                }

            }

        }
        else
        {
            entier = false;
        }

        if (entier)
        {
            System.out.println(nbr + "is not an integer between 1 & 100");
        }

    }

}