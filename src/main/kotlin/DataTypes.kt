/* Const are same like static final in JAVA
they should be out of functions
as they are not part of object*/
const val PI = 3.14

fun main(){
    var num: Int = 28
    var str: String = "Name"
    var longNumber: Long = 10231L
    var double: Double = 132.13
    var float: Float = 132.12F
    var bool: Boolean = true
    var char: Char = 'A'

    // if I want to store any data type in a variable, wiser not to use it
    var anyVal: Any = "kajbf"

    // The type inference is by default in kotlin we do not need to declare data type as in JAVA
    var num1 = 28
    var str1 = "Name"
    var longNumber1 = 10231L
    var double1 = 132.13
    var float1 = 132.12F
    var bool1 = true
    var char1 = 'A'

    /* Val vs Var Keywords*/
// Val is used to make a variable immutable
    var num2 = 28
    num2 = 29
    val strVal = "Name"
//    strVal = "skjdf"  [ERROR]

}