fun main() {
    tetwhen("hello")
}
 // When оператор
fun tetwhen (input: Any) {
    when (input) {

        1 -> println("one")
        2 -> println("tvo")
        is String -> println("Строка")
        in 10..20 -> println("from 10 to 20")
    }
}