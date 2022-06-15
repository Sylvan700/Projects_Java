class Money
{

    public fun getFullBill(person : Stagiaire, satSize : Int, sunSize : Int) : Int
    {
      return getMealBill(person) + getLodgingBill(person) + getSessBill(person, satSize, sunSize)
    }

    public fun getMealBill(person: Stagiaire) : Int
    {
        return person.mealBuy * Companion.mealPrice
    }

    public fun getLodgingBill(person: Stagiaire) : Int
    {
        return person.nbLodging * Companion.lodgingPrice
    }

    public fun getSessBill(person: Stagiaire,  satSize : Int, sunSize : Int) : Int
    {
        var totSessPrice : Int

        if(person.nbSess == satSize + sunSize)
        {
            totSessPrice = Companion.specialSessPrice
        }
        else
        {
            totSessPrice = person.nbSess * Companion.sessPrice
        }

        return totSessPrice
    }

    companion object {
        const val sessPrice : Int = 20
        const private val specialSessPrice :Int = 90
        const val mealPrice: Int = 10
        const val lodgingPrice : Int = 40
    }

}