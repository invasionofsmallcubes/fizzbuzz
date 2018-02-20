package com.invasionofsmallcubes.divisible

class DivisibleDefault(private val n: Int) : Divisible {
    override fun value(): String = n.toString()
    override fun divisible(): Boolean = true
}