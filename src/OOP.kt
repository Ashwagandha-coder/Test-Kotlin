fun main() {

    val child = OOP("boric", "Lodin", 10)

    val yug = OOP("Danil","Danilov", 22, child)
    println(yug.firtName) // геттер по умолчанию

    val rectangle1 = Rectangle(10.9,20.4)
    println(rectangle1.per)

    val rectangle2 = Rectangle(11.2,55.7)
    println(rectangle2 == rectangle1)




}
// Primary contructor
class OOP(val firtName: String, val LatName: String, var age: Int) {
    var children: MutableList<OOP> = mutableListOf() // ArrayLict

    // init running after firct conctructor (init need for example: when created
    // object to was something command
    init {
        println("Object ic created")
    }

    //cecond contructor
    constructor(firtName: String, latName: String, age: Int,child: OOP): this(firtName, latName, age) {

        children.add(child)

    }
    // contructor not have argument
    constructor(): this ("","",-1)
}

data class Rectangle(var hight: Double, var length: Double) {
    var per = (hight + length)

    var yut = 1
    get() = field + 1 // field то же самое что и this.поле
    set(value) {
        if (value < 0) {
            println("Null negative")
            field = value
        }

    }

    fun area() = hight * length
}