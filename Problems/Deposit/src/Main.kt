import kotlin.math.pow

fun main() {
    val parameter = readLine()!!
    val number = readLine()!!.toDouble()
    println(finalAmount(parameter, number))
}

fun finalAmount(parameter: String, number: Double): Int {
    return when (parameter) {
        "percent" -> {
            return (1000 * (1 + number / 100).pow(10)).toInt()
        }
        "years" -> {
            (1000 * 1.05.pow(number)).toInt()
        }
        else -> return (number * 1.05.pow(10)).toInt()
    }
}