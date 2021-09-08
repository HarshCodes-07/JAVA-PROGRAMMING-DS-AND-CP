fun main() {
    val a = 5;
    val b = 8;
    println("The Greater Number is ${greater(a, b)}")
}

fun greater(a: Int, b: Int): Int = if (a > b) a else b