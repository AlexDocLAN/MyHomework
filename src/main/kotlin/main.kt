fun main(){
    val likes : Int = 10201
    val string1 : String = "Человеку"
    val string2 : String = "Людям"
    val outputString : String
    val count: Int = likes % 100
    if (count == 11) println("Понравилось $likes людям")
    else if (count % 10 === 1) println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")


}