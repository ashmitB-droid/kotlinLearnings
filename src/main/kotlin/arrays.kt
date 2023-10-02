fun main(){
    var nameArray = arrayOf<String>("pintu","bantu","shanty")
    println(nameArray.contentToString())
    println(nameArray[0])
    println(nameArray[1])
    println(nameArray.size)

    if("pintu" in nameArray) println("Yes found") else println("not found")

    // Array of nulls

    var arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.size)
}