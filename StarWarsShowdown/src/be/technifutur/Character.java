package be.technifutur;

import java.util.Scanner;

public abstract class Character
{
    private final String name;

    public Character(String aName) // Demande dans ses paramètres un nom a la création de l'objet.
    {
            this.name = aName;
    }

    public abstract String showTeam();
    public abstract void fight();

    public String getName()
    {
        return name;
    }

}
