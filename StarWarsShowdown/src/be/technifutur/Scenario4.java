package be.technifutur;

import java.util.Scanner;

public class Scenario4
{

    public static void main(String[] args)
    {

        Character[] tab = new Character[]
                { new Soldier("Sniper"), new Jedi("Yoda"), new Sith("Darth-Maul"), new Clone() };
        Force f;
        int index = 0;
        int enInt = 0;
        int p1 = 1;
        int p2 = 2;
        boolean chosen = false;
        String entree = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Player One, Pick your fighter: ");

        while(!chosen)
        {
            for (Character i : tab)
            {
                index++;
                System.out.println(index + ". " + i.showTeam() + " :");
                if(i instanceof Force)
                {
                    System.out.println("   " + i.getName() + " control the Force");
                }
                else
                {
                    System.out.println("   " + i.getName() + " doesn't control the Force");
                }
            }
            System.out.println((index +1) + ". quit");
            entree = scan.nextLine();
            enInt = Integer.parseInt(entree);

            if(enInt > 0 && enInt <= (index +1))
            {
                p1 = enInt - 1;
                System.out.println("Player 1, you choice is " + tab[enInt].getName() + ", are you sure?");
                System.out.println("1. Yes/ 2. No");
                entree = scan.nextLine();
                enInt = Integer.parseInt(entree);
                if(enInt == 1)
                {
                    chosen = true;
                }
                else
                {
                    chosen = false;
                }
            }
            index = 0;

        }
        chosen = false;

        System.out.println("Player Two, Pick your fighter: ");

        while(!chosen)
        {
            for (Character i : tab)
            {
                index++;
                if (tab[index - 1].showTeam() != tab[p1].showTeam())
                {
                    System.out.println(index + ". " + i.showTeam() + " :");
                    if(i instanceof Force)
                    {
                        System.out.println("   " + i.getName() + " control the Force");
                    }
                    else
                    {
                        System.out.println("   " + i.getName() + " doesn't control the Force");
                    }
                }
            }
            System.out.println((index +1) + ". quit");
            entree = scan.nextLine();
            enInt = Integer.parseInt(entree);

            if(enInt > 0 && enInt <= (index +1))
            {
                if(enInt != p1)
                {
                    p1 = enInt;
                    System.out.println("Player 2, you choice is " + tab[enInt].getName() + ", are you sure?");
                    System.out.println("1. Yes/ 2. No");
                    entree = scan.nextLine();
                    enInt = Integer.parseInt(entree);

                    if(enInt == 1)
                    {
                        chosen = true;
                    }
                    else
                    {
                        chosen = false;
                    }
                }
                else
                {
                    chosen = false;
                    System.out.println("You cannot take the same team as Player One.");
                }
            }
            index = 0;

        }
        chosen = false;

        System.out.println("Player 1 with " + tab[p1].getName() + "VS Player 2 with " + tab[p2].getName());

    }

}
