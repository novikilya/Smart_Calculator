fun intDivision(x: String, y: String): Int {
    var division = 0
    try {
        division = x.toInt() / y.toInt()
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    }  catch (e: Exception) {
        println("Read values are not integers.")
    }
    return division
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}