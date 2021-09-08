fun isValidIdentifier(s: String): Boolean {
    fun isValidChar(char: Char): Boolean {
        return char == '_' || char in 'a'..'z' || char in 'A'..'Z' || char in '0'..'9'
    }
    for (ch in s) {
        if (!isValidChar(ch)) {
            return false
        }
    }
    if (s.length == 0)
        return false
    return s.get(0) == '_' || s.get(0) in 'a'..'z' || s.get(0) in 'A'..'Z'
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}