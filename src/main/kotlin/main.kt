fun main(){

    println("Please enter a number from 1-10: ")
    var number = readln()!!.toInt()
    var numberString: String = "x"


    when (number){
        1 -> numberString = "uno"
        2 -> numberString = "dos"
        3 -> numberString = "tres"
        4 -> numberString = "cuatro"
        5 -> numberString = "cinco"
        6 -> numberString = "seis"
        7 -> numberString = "siete"
        8 -> numberString = "ocho"
        9 -> numberString = "nueve"
        10 -> numberString = "diez"
        !in 1..10 -> numberString = "Please enter a number from 1-10 :)"
    }
println("Your number is: $numberString")


}