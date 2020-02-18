import kotlin.math.max

class Math {

    // 1. Если а – четное посчитать а*б, иначе а+б
    fun calcByEven(a: Int, b: Int): Int {
        return if (a % 2 == 0) a * b else a + b
    }

    // 2. Посчитать выражение макс(а*б*с, а+б+с)
    fun calcByMax(a: Int, b: Int, c: Int): Int {
        val x = a * b * c
        val y = a + b + c
        return if (x >= y) x else y
        //return max(a * b * c, a + b + c)
    }

    // 3.Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
    //рейтинг Оценка
    //0-19 F
    //20-39 E
    //40-59 D
    //60-74 C
    //75-89 B
    //90-100 A
    fun calcStudentMark(rate: Int): Char {
        return when(rate) {
            in 0..19 -> 'F'
            in 20..39 -> 'E'
            in 40..59 -> 'D'
            in 60..74 -> 'C'
            in 75..89 -> 'B'
            else -> 'A'
        }
    }

    // 4. Есть два конверта со сторонами (а,б) и (в,г) определить, можно ли один конверт вложить в другой
    fun calcCheckFits(a: Int, b: Int, c: Int, d: Int): Boolean  {
        return (a > c && b > d) || (a > d && b > c) ||  // первый конверт влазит во второй
               (a < c && b < d) || (a < d && b < c)     // второй конверт влазит в первый
    }

    // 5. Найти сумму четных чисел и их количество в диапазоне от 1 до 99
    data class ResultOfSumOfEven(val sum: Int, val count: Int)
    fun calcSumOfEven(start: Int, finish: Int): ResultOfSumOfEven {
        var sum = 0
        var count = 0
        for (i in start..finish)
            if (i % 2 == 0) {
                sum += i
                ++count
            }
        return ResultOfSumOfEven(sum, count)
    }

    // 6. Написать функцию, которая возвращает факториал числа N (n! = 1*2*…*n-1*n;)
    fun calcFact(n: Int): Int {
        var result = 1
        for (i in 2..n) result *= i
        return result
    }

    // 7. Написать функцию, которая возвратит строковое представление числа N(dec) в двоичном формате.
    fun calcConvertToBinary(n: Int): String {
        var result = ""
        var number = n
        while (number > 0) {
            result = "${number and 1}$result"
            number = number shr 1
        }
        return result
    }
}