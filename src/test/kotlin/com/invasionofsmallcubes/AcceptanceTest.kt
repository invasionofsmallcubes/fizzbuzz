package com.invasionofsmallcubes

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class AcceptanceTest {

    @Test
    fun acc() {
        val fizzBuzz = FizzBuzz()
        assertThat(fizzBuzz.evaluate(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)),
                `is`(listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                        "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz")))
    }

}
