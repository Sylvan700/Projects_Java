package Streamkotlin

import be.technifutur.data.Personne
import be.technifutur.data.PersonneK

fun main()
{

    val dataTest = Personne.dataTest()

    // nomDeLaValeur : liste de PersonneK = 
    val listK : List<PersonneK> = dataTest.map{ p ->  PersonneK(p.name, p.prenom, p.naissance, p.taille)}

    val listK2 : List<PersonneK> = dataTest.map{ p -> PersonneK(p) }

    // affichage du contenu de la liste
    listK2.forEach{println(it)}
    // affichage des âges des personnes contenues dans la liste
    listK2.map{it.age}.forEach{println(it)}
    // affichage de l'âge maximum(mais ne marche pas?)
    println(listK2.map{it.age}.maxOrNull())
    // affichage de la personne de - de 65 ans avec l'âge le plus haut
    println(listK2.filter( ::monTest ).maxByOrNull{ it.age})

    // test est une fonction qui reçois un paramètre(PersonneK) qui est de type boolean
    val test: (PersonneK)-> Boolean = {p -> p.age < 65}

    val premier : PersonneK = listK2[0]

    val testing : PersonneK? = execute(premier, ::monTest);
    val testing2 : PersonneK? = execute(premier, test)
    val testing3 : PersonneK? = execute(premier){ p : PersonneK -> p.age == 35 }

    println("-------------------------------------------------")
    println(premier)
    println(testing)
    println(testing2)

    println("-------------------------------------------------")

    val byDizaine : Map<Int, List<PersonneK>> = listK.groupBy{it.age / 10 * 10}
    byDizaine.forEach{println(it)}

    val values : Collection<List<PersonneK>> = byDizaine.values

    // flatmap "applatis" les collections
    var result : List<PersonneK> = values.flatMap{it}
    result = byDizaine.flatMap { it.value }

    println(byDizaine.map { it.key }.toSortedSet())

    val diz = arrayOf(10, 20, 30, 40, 50, 60, 70)



    // moyenne
    byDizaine.flatMap { it.value }.distinct().map{it.age}.average()

}

fun monTest(p: PersonneK) : Boolean { return p.age > 65 }

// attend en paramètre (PersonneK) et une fonction(PersonneK)
fun execute(personne : PersonneK, laFonction : (PersonneK) -> Boolean) : PersonneK?
{
    return if(laFonction(personne))personne else null
}

// fonction générique
fun <T>execute3(laValeur : T, laFonction : (T) -> Boolean) : T?
{

    return if(laFonction(laValeur))laValeur else null;

}
