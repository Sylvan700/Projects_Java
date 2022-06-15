
fun main()
{
    val name = "me";

    var tab = arrayOf("toto", "$name","louis", "Thomas");

    println(tab.joinToString
        (
            postfix = "]", separator = "|", prefix = "[", limit = 2,
            transform = {it[0].uppercase()+it.substring(1)})
        )

    var tab2 = Array(6){it*it}
    println(tab2.joinToString())

    var tab2b = Array(9){ligne ->Array(9){colonne -> ligne * 9 + colonne} }

    println(tab2b.joinToString { t -> t.joinToString(postfix = "\n") })

}