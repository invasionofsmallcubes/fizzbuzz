package com.invasionofsmallcubes

class DivisibleByFive(private val n: Int) : Divisible {
    override fun divisible() = n % 5 == 0
    override fun value(): String = "Buzz"
}
