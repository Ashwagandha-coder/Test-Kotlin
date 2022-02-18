fun main() {

    val ret = 56

    val pop = "ruaq"

    val ork = listOf("apple","banana","urka")

    val tuq: MutableList<Int> = mutableListOf(1,34,78,99,22)

    val qeq:ArrayList<Int> = arrayListOf(2,67,34,22,99)

    val opa = setOf("aqop","ygv","yfhb")

    val rua: MutableSet<Int> = mutableSetOf(2,4,67,44,222,111,999)

    val b = rua.add(444)

    var y = hashMapOf(4 to "apple",3 to "pear",2 to "peach")

    val r: HashMap<Int, String> = hashMapOf(2 to "opa",1 to "ropa",9 to "jopa")

    val rq = r.put(229,"yvd")

    val pojn = sequenceOf(45,76,11,999,5555,32,76)

    for (i in ork)
        println(i)

    var index = 0

    while (index < ork.size) {
        println(ork[index])
        index ++

    // Диапазон

    println(5 in 3..10)

    for (i in 1..10)
        println(i)

    // Не включительнй Диапазон

    for (j in 1 until 10)
        println(j)
    }
}