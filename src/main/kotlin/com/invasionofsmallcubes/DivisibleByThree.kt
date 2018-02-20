package com.invasionofsmallcubes

class DivisibleByThree(private val n: Int) : Divisible {
    override fun value(): String = "Fizz"
    override fun divisible(): Boolean = n % 3 == 0
}