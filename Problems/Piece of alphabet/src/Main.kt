fun main() {
    val input = readLine()!!
    println(checkString(input))
}

fun checkString(input: String): Boolean {
    var char = input.first()
    for (i in input) {
        if (char != i) {
            return false
        }
        char++
    }
    return true
}