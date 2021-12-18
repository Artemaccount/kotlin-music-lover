const val discount = 100
const val discountPercent = 5
const val discountForMusicLover = 1

fun main() {
    println(getSumAfterDiscount(100, true))
    println(getSumAfterDiscount(1500, false))
    println(getSumAfterDiscount(15000, true))
}

fun getSumAfterDiscount(sum: Int, isPermanent: Boolean): String {
    var rubles = 0
    var penny = 0
    if (sum <= 1000) rubles = sum else if (sum in 1001..10000) rubles = (sum - discount)
    else {
        rubles = sum - sum / 100 * discountPercent
        penny = sum % 100 * discountPercent
    }
    if (isPermanent) {
        penny += rubles * 100
        penny -= penny / 100 * discountForMusicLover
        rubles = penny / 100
        penny %= 100
    }
    return "$rubles рублей, $penny копеек"

}