package com.invasionofsmallcubes.divisible

class DivisibleByFiveAndThree(n: Int) : Divisible {

    private val byFive = DivisibleByFive(n)
    private val byThree = DivisibleByThree(n)

    override fun divisible(): Boolean = byFive.divisible() && byThree.divisible()

    override fun value(): String = "FizzBuzz"
}