fun main(){
    // immutable read only list
    var list = listOf<String>("Hello", "All", "The", "People")
    println(list.size)
    println(list)
    println(list[0])
    println(list.contains("Hello"))

    // mutable list which can be edited
    var list2 = mutableListOf("Hello", "All", "The", "People")
    list2.remove(list2[0])
    println(list2)
    list2.add("HEHE")
    println(list2)

    // destructing the Array or List
    var list3 = listOf<Int>(1,2,3,5,6)
    var (one, two, three, _, six) = list3
    println("$one $two $three $six")
    println(one)

}