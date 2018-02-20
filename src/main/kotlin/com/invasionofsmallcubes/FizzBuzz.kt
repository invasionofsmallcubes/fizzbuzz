package com.invasionofsmallcubes

class FizzBuzz {
    fun evaluate(numbers: List<Int>): List<String>? {
        return numbers
                .map { n -> if(DivisibleByFive(n).divisible() && DivisibleByThree(n).divisible()) DivisibleByFiveAndThree(n).value()
                else if (DivisibleByThree(n).divisible()) DivisibleByThree(n).value()
                else if (DivisibleByFive(n).divisible()) DivisibleByFive(n).value()
                else DivisibleDefault(n).value() }
    }

}