import kotlin.math.roundToInt

fun main() {
    val purchaseAmount: Int = 10200
    val discount: Double = 0.05
    val discoutForRegularUsers : Double = 0.01
    val isRegularUser: Boolean = false

    if (purchaseAmount <= 1000) println("Сумма вашей покупки: $purchaseAmount руб.")

    else if (purchaseAmount in 1001..10_000)     {
        var totalPrice: Int = purchaseAmount - 100
        if (isRegularUser)  totalPrice = (totalPrice * (1 - discoutForRegularUsers)).roundToInt()
        println("Сумма вашей покупки $totalPrice руб.")
    }
    else if (purchaseAmount > 10_000) {
        var totalPrice: Int  = (purchaseAmount - purchaseAmount * discount).roundToInt()
        if (isRegularUser) totalPrice = (totalPrice * (1 - discoutForRegularUsers)).roundToInt()
        println("Сумма вашей покупки $totalPrice руб.")
    }
}