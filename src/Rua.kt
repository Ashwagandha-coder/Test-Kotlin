fun main(){
    println(abra(3,10))
    println(cadabra(5))
    println(Named(y = 3,x = 2,z = 1))

    default(x = 2, y = 5)

    printEven(1,2,3,4,5,6,7,8)
    printEven(*intArrayOf(1,2,3,4,5,6,7,8,9))

}

fun abra(x: Int, y: Int): Int = y - x

fun cadabra(x: Int): String {
    return "Tring is $x"
}

fun Named(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}
 // void
fun default(x: Int = 1, y: Int = 2) {
    println(x + y)

}

fun foo(name: String, number : Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number

}

// vararg

fun printEven(vararg number: Int) {
    number.forEach { e -> if (e % 2 == 0) println(e) }

}