fun main() {
    val N = readLine()!!.toInt()
    val numbers = IntArray(N)
    for (i in numbers.indices) {
        numbers[i] = readLine()!!.toInt()
    }

    val M = readLine()!!.toInt()

    println(
        when (M in numbers) {
            true -> "YES"
            else -> "NO"
        }
    )
}