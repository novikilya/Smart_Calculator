fun main() {
    val words = readLine()!!.split(" ").toTypedArray()

    var maxLength = 0
    var output = ""
    for (i in words) {
        if (i.length > maxLength) {
            maxLength = i.length
            output = i
        }
    }

    println(output)
}