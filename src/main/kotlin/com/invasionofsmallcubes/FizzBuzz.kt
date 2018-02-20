package com.invasionofsmallcubes

class FizzBuzz {
    fun evaluate(numbers: List<Int>): List<String>? {
        return numbers
                .map { n -> if(divisibleByFive(n) && divisibleByThree(n)) "FizzBuzz"
                else if (divisibleByThree(n)) "Fizz"
                else if (divisibleByFive(n)) "Buzz"
                else n.toString() }
    }

    private fun divisibleByFive(n: Int) = n % 5 == 0

    private fun divisibleByThree(n: Int) = n % 3 == 0
}