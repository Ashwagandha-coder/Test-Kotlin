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





}
