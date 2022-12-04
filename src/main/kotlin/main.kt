import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(){
    val amount : Int = 1023_000 // сумма перевода в рублях
    val amountDeep : Int = amount * 100 //сумма перевода в копейках
    val minimalCommission : Int = 3_500 // минимальная комиссия 35 рублей
    val percentOfCommission : Double = 0.0075 // 0.75% комиссия за перевод
    val kopeykaPerRuble : Int = 100 // число копеек в рубле
    val commission: Int = if (amount * percentOfCommission < minimalCommission ) minimalCommission else (amount * percentOfCommission).roundToInt()
    val totalCommissionRub : Int = commission / kopeykaPerRuble
    val totalCommissionKop : Int = commission - totalCommissionRub * kopeykaPerRuble
    println("Комиссия за перевод составит: " +
            totalCommissionRub + " рублей " +
            totalCommissionKop + " коп.")
}