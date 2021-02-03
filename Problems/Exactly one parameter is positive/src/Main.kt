fun main() {
    var counter = 0
    for (i in 0..2) {
        val input = readLine()!!.toInt()
        if (input > 0) counter++
    }
    println(counter == 1)
}