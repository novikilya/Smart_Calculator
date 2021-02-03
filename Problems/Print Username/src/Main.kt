fun main() {
    val name = readLine()!!

    if (name == "HIDDEN") {
        greetings()
    } else {
        greetings(name)
    }
}

fun greetings(name: String = "secret user") {
    println("Hello, $name!")
}