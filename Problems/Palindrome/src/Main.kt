fun main() {
    val input = readLine()!!

    var output = "yes"
    for (i in input.indices) {
        if (input[i] != input[input.lastIndex - i]) {
            output = "no"
        }
    }

    println(output)
}