
import kotlin.math.max
import kotlin.math.round
// #1
fun main() {
//
//    val amount: Double = 1000.0
//
//
//    val commissionRate = 0.0075 // 0.75%
//    val minCommission = 35.0    // Минимум 35 рублей
//
//
//    val percentCommission = amount * commissionRate
//
//
//    val rawCommission = max(percentCommission, minCommission)
//
//    val finalCommission = round(rawCommission * 100) / 100.0
//
//    println("Сумма перевода: $amount руб.")
//    println("Комиссия: $finalCommission руб.")
//}

// #2

//    val likes = 1
//
//    val lastDigit = likes % 10
//    val lastTwoDigits = likes % 100
//
//    val word = if (lastTwoDigits in 11..14) {
//        "лайков"
//    } else if (lastDigit == 1) {
//        "лайк"
//    } else if (lastDigit in 2..4) {
//        "лайка"
//    } else {
//        "лайков"
//    }
//
//    println("$likes $word")
//}
    // #3

    val purchaseAmount: Double = 15000.0
    val isRegularCustomer: Boolean = true

    var finalPrice = purchaseAmount

    if (purchaseAmount >= 10001) {

        finalPrice = finalPrice * 0.95
    } else if (purchaseAmount >= 1001) {

        finalPrice = finalPrice - 100
    }

    if (isRegularCustomer) {

        finalPrice = finalPrice * 0.99
    }

    println("Итоговая сумма к оплате: ${"%.2f".format(finalPrice)} руб.")
}
