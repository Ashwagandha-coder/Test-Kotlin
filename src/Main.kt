fun main() {

    // for each

    val items = listOf("apple","orange","banana") // listOf

    for(item in items)
        println(item)

    var index = 0

    while (index < items.size) {
        println(items[index])
        index++

    }

    // Диапазон

    println(5 in 3..10)

    for (i in 1..10)
        println(i)

    for (i in 1 until 10){
        println(i)
    }
    for (i in 10 downTo 1)
        println(i)
    for (i in 0..100 step 10)
        println(i)





}
