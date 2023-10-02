fun main(){
    var name = "I am a string"
    println(name.uppercase())
    println(name[0])
    println(name[name.length-1])
    println("".isBlank())

    var age = 29
    println("my name is $name and my age is $age")

    // string formatting
    var paragraph = """
        I %s
        am 
        preserving %d
        indent.
        """.trimIndent()

    println(paragraph.format("is para", 12))

    // ===, == and equals

    val str1 = "Hello"
    val str2 = "Hello"
    val str3 = String("Hello".toCharArray())
    println(str1===str3)
    println(str1==str3)
    println(str1.equals(str3))
    println(str1 === str2)
}