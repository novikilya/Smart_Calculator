fun main() {
    val input = readLine()!!
    for (i in input) {
        if (i in '0'..'9') {
            println(i)
            break
        }
    }
}