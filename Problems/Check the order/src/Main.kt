fun main() {
    val n = readLine()!!.toInt()

    var output = "YES"
    var number1 = -1
    for (i in 1..n) {
        val number2 = readLine()!!.toInt()
        if (number2 <= number1) output = "NO"
        number1 = number2
    }

    println(output)
}