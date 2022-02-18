fun main() {

    val a = listOf(1,2,3,4,5,6)

    a.forEach { e -> println(e) }
    println(a.map { e ->  e * 2})
    println(a.filter { e -> e % 2 == 0})
    a.reduce { sum, e -> sum + e }

    a.sortedByDescending { it }

    a.any { it > 10 } // false

    val num = listOf(1,45,34,22,-11,22,-88,-32)

    val (pocitive, negative) = num.partition { it > 0 }


}