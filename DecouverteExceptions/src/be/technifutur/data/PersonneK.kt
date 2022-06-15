package be.technifutur.data

import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class PersonneK(val nom : String, val prenom : String, val naissance : LocalDate)
{

    constructor(nom : String, prenom : String,naissance : LocalDate, taille : Int) : this(nom, prenom, naissance)
    {
        this.taille = taille;
    }

    constructor(p: Personne) : this(p.name, p.prenom, p.naissance, p.taille)

    var taille : Int = 0;
    val age : Int
        get() = this.naissance.until(LocalDate.now(), ChronoUnit.YEARS).toInt();

}