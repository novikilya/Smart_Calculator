import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val class1 = scanner.nextInt() + 1
    val class2 = scanner.nextInt() + 1
    val class3 = scanner.nextInt() + 1
    val min = (class1 / 2).toInt() + (class2 / 2).toInt() + (class3 / 2).toInt()
    println(min)
}