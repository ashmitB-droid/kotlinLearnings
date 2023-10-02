fun main(){
    // When is somewhat same like switch case in JAVA
// it can be written as an expression or single statement as well
    val input = "M"
    var gender = when(input){
        "M" -> "Male"
        "F" -> "Female"
        else -> {
            "Unknown gender"
    }
    }
    println(gender)

// as an expression
    val input2 = "H"
    when(input2){
        "H" -> println("Hello")
        "h" -> println("Hi")
        else -> {
            print("Good morning")
        }
    }

 // another way to use when

    var age = 23
    when(age){
        in 20..28 -> println("In college")
        !in 20..28 -> println("Must be working")
        else -> print("retired")
    }

}