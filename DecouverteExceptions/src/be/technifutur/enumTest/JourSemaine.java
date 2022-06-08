package be.technifutur.enumTest;

public enum JourSemaine
{
    // Liste des valeurs
    // instancié automatiquement, pas besoin de "new". Un constructeur peu quand même être utiliser.
    LUNDI(true),MARDI(true),MERCREDI(true),JEUDI(true),VENDREDI(true),
    SAMEDI(false) ,DIMANCHE(false)
    ;
    // Le code des objets
    private boolean ouvrable;

    private JourSemaine(boolean param)
    {
        this.ouvrable = param;
    }
    public boolean isOuvrable()
    {
        return ouvrable;
    }

    // Il n'est pas possible de faire de l'héritage avec des enums. Un enum est très statique.
    // Il reste possible de set les valeurs/ les modifiés mais ce n'est pas cohérent dans la logique d'un enum.
}
