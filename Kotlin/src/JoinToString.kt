fun main() {
    println(
        listOf("harsh", "subhdeep", "choton", "rishu").joinToString(
            separator = "-", prefix = "GangBegins-", postfix = "-GangEnds"
        )
    )
}