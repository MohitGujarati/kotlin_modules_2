package kt_module1_2



fun main() {


    println("Q-1")
    print_()
    println("Q-2")
    println(enter_int())
    println("Q-3")
    println(addnum(10, 30))
    println("Q-4")
    println(multiply_flottingnum())
    println("Q-5")
    Ascii_value()
    println("Q-6")
    quotient_remainder(100, 4)
    println("Q-7")
    odd_even(3)
    println("Q-8")
    string_freq()
    println("Q-9")
    println(expression(10, 30))
    println("Q-10")
    println(start())
    println("Q-11")
    hash_map()

}

fun addnum(i: Int, i1: Int): Int {
    return i + i1
}


fun print_() {
    println("hello world")
}

fun enter_int(): Int {
    println("enter an digit")
    var num = Integer.valueOf(readLine())

    return num
}

fun string_freq() {
    val str = "this is is Kotlin programming language"
    val a = IntArray(26)

    for (i in 0 until str.length) {
        if (str[i].toInt() >= 65 && str[i].toInt() <= 90) {
            a[str[i].toInt() - 65]++
        } else if (str[i].toInt() >= 97 && str[i].toInt() <= 122) {
            a[str[i].toInt() - 97]++
        }
    }
    for (i in 0..25) {
        if (a[i] > 0) {
            println((i + 65).toChar() + " - " + a[i]);
        }
    }

}

fun hash_map() {
    var hash = hashMapOf<Int, String>()

    hash.put(1, "hello 1")
    hash.put(2, "hello 2")
    hash.put(3, "hello 3")
    hash.put(4, "hello 4")


    for (i in 0..hash.size) {
        println(hash[i])
    }

}


fun start(): String {

    return "ok"

}

fun expression(a: Int, b: Int): Boolean {

    return a > b

}

fun odd_even(i: Int) {

    if (i % 2 == 0) {
        println("Even")
    } else
        println("Odd")

}

fun quotient_remainder(val1: Int, val2: Int) {
    val dividend = val1
    val divisor = val2

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")
}

fun Ascii_value() {

    val ch = 'a'
    val ascii = ch.toInt()


    println("Ascii $ch is: $ascii")

}

fun multiply_flottingnum(): Float {

    var a: Float = 23.7f
    var b: Float = 20.6f

    return a * b
}
