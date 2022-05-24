class rectangle(

    var base: Double,
    var height: Double,
) {
    fun findArea(): Double {
        return base * height / 2
    }

}

class Triangle(
    var base: Double,
    var height: Double,
    var sideLenOne: Double,
    var sidelentwo: Double,
    var sidelenthree: Double
) {
    fun findArea(): Double {

        return base * height / 2
    }

}

fun main() {


    println("AreaTriangle")
    var area_triangle_1 = Triangle(10.0, 10.0, 10.0, 10.0, 10.0)
    println(area_triangle_1.findArea())

    println("Area Reactangle")
    var area_rectangle_1 = rectangle(20.0, 12.0)
    println(area_rectangle_1.findArea())

}