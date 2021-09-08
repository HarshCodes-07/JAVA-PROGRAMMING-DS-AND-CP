fun display(character: Char = '*', size: Int = 10): Unit {
    repeat(size) {
        print(character)
    }
    println()
}

fun main() {
    display()
    display('X',3);
}