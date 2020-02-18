class Main

fun main() {
    with (Math()) {
        println("1. ${calcByEven(2, 2)}")
        println("2. ${calcByMax(2, 2, 3)}")

        println("3. 50 -> ${calcStudentMark(50)}")

        with (calcSumOfEven(1, 99)) {
            println("4. Sum = $sum, Count = $count")
        }

        println("5. 5! = ${calcFact(5)}")

        if (calcCheckFits(6, 10, 6, 12))
            println("6. the envelope is placed")
        else
            println("6. the envelope is not placed")

        println("7. 5 -> ${calcConvertToBinary(5)}")
    }
}

