fun main(){
    // ? mark is used in case we expect the value to be null
    var name: String? = null
    println(name?.lowercase())
    var name1: String? = "name1"
    print(name1?.lowercase())
}