fun main() {
    val amount = 5000
    val fee = 0.0075
    val minFeeAmount = 35
    val feePerOperation = if ((amount * fee) > minFeeAmount) amount * fee else minFeeAmount

    println("Комиссия за перевод стоставит: $feePerOperation руб.")
}