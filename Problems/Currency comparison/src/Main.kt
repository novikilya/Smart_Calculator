import java.util.*

enum class Countries(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar")
}

fun main() {
    val scanner = Scanner(System.`in`)
    val country1 = scanner.next()
    val country2 = scanner.next()

    println(compareCurrencies(country1, country2))
}

fun compareCurrencies(country1: String, country2: String): Boolean {
    var currency1 = ""
    var currency2 = ""

    for (i in Countries.values()) {
        if (i.country == country1) {
            currency1 = i.currency
        }
    }
    for (i in Countries.values()) {
        if (i.country == country2) {
            currency2 = i.currency
        }
    }

    return currency1 == currency2
}