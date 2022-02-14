fun main() {
    var a: String = "Hai"

    var b: String? = "Bereza"
    b = null



    // Elvis оператор
    // Нужен для того чтоб узнать например длинну строки. Обозначается ?: Если в строке не null тогда
    // вернет длинну ИНАЧЕ вернет -1

    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "Node" else null

    // !! - вбрасвает NPE если в переменной есть null

    val r = b!!.length
}