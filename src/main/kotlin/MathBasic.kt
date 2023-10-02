import kotlin.math.max

fun main(){
    val num1 = 4
    val num2 = 5
    println("Addition of numbers is ${num1 + num2}")
    println("Max among two numbers --")
    println(max(num1,num2))

    var num3 = 121
    var num4 = "121"

    println(num3 + num4.toInt())
    println(num3.toString() + num4)
}