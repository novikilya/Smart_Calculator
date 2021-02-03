fun main() {
    val input = readLine()!!

    var counter = 0
    for (i in input) {
        var n = 0
        for (k in input) {
            if (i == k) n++
        }
        if (n == 1) counter++
    }

    println(counter)
}