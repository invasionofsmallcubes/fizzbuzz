package com.invasionofsmallcubes

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun returnANumber() {
        sequenceIs(listOf(1), listOf("1"))
        sequenceIs(listOf(1, 2), listOf("1", "2"))
    }

    @Test
    fun returnANumberDivisibleByThree() {
        sequenceIs(listOf(3), listOf("Fizz"))
    }

    @Test
    fun returnANumberDivisibleByFive() {
        sequenceIs(listOf(5), listOf("Buzz"))
    }

    @Test
    fun `returnDivisibleByThreeAndFive()`() {
        sequenceIs(listOf(15), listOf("FizzBuzz"))
    }

    private fun sequenceIs(input: List<Int>, expectedOutput: List<String>) {
        assertThat(fizzBuzz.evaluate(input), `is`(expectedOutput))
    }
}