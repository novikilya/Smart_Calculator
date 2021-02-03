fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    if (n2 == 0) println("Division by zero, please fix the second argument!")
    else println(n1 / n2)
}