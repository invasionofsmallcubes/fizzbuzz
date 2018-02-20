package com.invasionofsmallcubes.divisible

object DivisibleFactory {
    fun createChain(n: Int) : List<Divisible> = listOf(DivisibleByFiveAndThree(n), DivisibleByThree(n), DivisibleByFive(n), DivisibleDefault(n))
}