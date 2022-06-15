
val satSize : Int = 4
val sunSize : Int = 5

val moneyClass :Money = Money()

var stagList : MutableList<Stagiaire> = mutableListOf()
var saturdaySession : List<MutableList<Stagiaire>> = List(satSize) { mutableListOf() }
var sundaySession : List<MutableList<Stagiaire>> = List(sunSize) { mutableListOf() }

fun main()
{
    Menu()
}

fun Menu()
{

    var selectString : String?
    var selectNum : Int = 0

    println("-------------------------------------------------------------------------------------------------------")
    for(i in stagList)
    {

        println(i.name)
        println(i.surname)
        var nbSess : Int = 0
        for(i1 in saturdaySession)
        {
            if(i1.contains(Stagiaire(i.name, i.surname)))
            {
                nbSess++
            }
        }

        if(nbSess > 0)
        {
            println("Saturday application: $nbSess")
            nbSess = 0
        }

        for(i2 in sundaySession)
        {
            if(i2.contains(Stagiaire(i.name, i.surname)))
            {
                nbSess++
            }
        }

        if(nbSess > 0)
        {
            println("Sunday application: $nbSess")
        }

        println(" Total bill:" + moneyClass.getFullBill(i, satSize, sunSize))

    }
    println("-------------------------------------------------------------------------------------------------------")
    println("Press Enter to see the trainee sub-menu")
    readLine()

    println("--Enter a number to select your action--")
    println("1. Add a new trainee ")
    println("2. Edit trainee ")
    println("3. Remove trainee")
    println("4. Back to Menu")

    selectString = readLine().toString()
    selectNum = selectString.toInt()

    if (selectNum == 1)
    {
        AddNewStagiaire()
    }
    else if(selectNum == 2)
    {
        Subscription()
    }
    else if(selectNum == 3)
    {
        RemoveStagiaire()
    }
    else if(selectNum == 4)
    {
        Menu()
    }

}

fun RemoveStagiaire() {
    TODO("Not yet implemented")
}

fun AddNewStagiaire()
{

    var name : String
    var surname: String

    println("Enter name")
    name = readLine().toString()
    println("Enter surname")
    surname = readLine().toString()

    stagList.add(Stagiaire(name, surname))

    Menu()

}

fun Subscription()
{

    var name: String
    var surname :String
    var entree : String?

    var selectedStagPos : Int = -1


    println("Enter the name of the trainee you want to edit")
    name = readLine().toString()
    println("Enter the surname of the trainee you want to edit")
    surname = readLine().toString()

    for(i in stagList)
    {
        var ind = 0

        if(stagList.elementAt(ind).name == name && stagList.elementAt(ind).surname == surname)
        {
            selectedStagPos = ind;
        }

        ind++
    }

    if(selectedStagPos < 0)
    {
        println("Trainee not found")
        Subscription()
    }

    println("is the trainee taking the full course?")
    // need to redo because is probably not going to be easy to use
    entree = readLine().toString()

    if(entree == "yes" || entree == "y" || entree == "Yes" || entree == "YES")
    {

        saturdaySession.forEach(){it.add(stagList.elementAt(selectedStagPos))}
        sundaySession.forEach(){it.add(stagList.elementAt(selectedStagPos))}

        stagList[selectedStagPos].nbSess = sunSize + satSize;

        println("Trainee registered into every sessions. Cost: "
                + moneyClass.getSessBill(stagList.elementAt(selectedStagPos), satSize, sunSize))

    }
    else
    {

        var entreeNum : List<String> = listOf()

        println("Enter every session the trainee is going to go on Saturday")
        println("separate each number with a comma")

        entree = readLine().toString()
        entreeNum = entree.split(",")

        for(i in entreeNum)
        {
            saturdaySession[i.toInt() -1].add(stagList.elementAt(selectedStagPos))

            stagList[selectedStagPos].nbSess++
        }

        var entreeNum2 : List<String> = listOf()

        println("Enter every session the trainee is going to go on Sunday")
        println("separate each number with a comma")

        entree = readLine().toString()
        entreeNum2 = entree.split(",")

        for(i in entreeNum2)
        {
            sundaySession[i.toInt() -1].add(stagList.elementAt(selectedStagPos))

            stagList[selectedStagPos].nbSess++
        }

    }

    println("How many meal are needed?")

    entree = readLine().toString()

    stagList[selectedStagPos].mealBuy = entree.toInt()

    println("How many lodging are needed?")

    entree = readLine().toString()

    stagList[selectedStagPos].nbLodging = entree.toInt()

    Menu()

}