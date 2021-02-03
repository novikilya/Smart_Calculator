fun main() {
    val input = readLine()!!
    val numbers = IntArray(6)
    for (i in input.indices) {
        numbers[i] = input[i].toString().toInt()
    }

    if (numbers[0] + numbers[1] + numbers[2] == numbers[3] + numbers[4] + numbers[5]) {
        println("Lucky")
    } else println("Regular")
}