fun main() {
    val input = readLine()!!.toUpperCase()
    var number = 0

    for (char in input) {
        if (char == 'C' || char == 'G') number++
    }

    println(number.toDouble() / input.length * 100)
}