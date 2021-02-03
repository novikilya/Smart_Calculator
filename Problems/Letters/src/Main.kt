fun main() {
    val letters = mutableMapOf<Int, String>()
    var counter = 0
    do {
        counter++
        letters[counter] = readLine()!!
    } while (letters[counter] != "z")
    print(letters[4])
}