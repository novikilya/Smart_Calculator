import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()

    if (weekend) {
        println(cups in 15..25)
    } else {
        println(cups in 10..20)
    }
}