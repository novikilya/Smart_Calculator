fun main() {
    var output = 0
    do {
        val input = readLine()!!.toInt()
        if (input > output) output = input
    } while (input != 0)
    println(output)
}