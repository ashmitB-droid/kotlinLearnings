fun main(){
    var array = arrayOf<Int>(1,2,3,4,5)
    var list = mutableListOf<String>("hello","all","people")
    for(name in list){
        println(name)
    }

    for(name in list){
        println(name.replaceFirstChar { 'A' })
    }

    for(index in array.indices){
        println("$index ---> ${array[index]}")
    }
}