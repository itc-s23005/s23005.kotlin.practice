package jp.ac.it_college.std.s23005.practice.chap2

class CommonCalculationExecutor (override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalArgumentException("Not implements calc")
    }

    override fun printStartMessage() {
        println("start $message")
    }
}