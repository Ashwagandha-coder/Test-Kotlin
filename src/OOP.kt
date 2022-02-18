fun main() {

    val child = OOP("boric", "Lodin", 10)

    val yug = OOP("Danil","Danilov", 22, child)
    println(yug.firtName)


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

class Rectangle(var hight: Double, var length: Double) {
    var per = (hight + length)
}