package com.invasionofsmallcubes

import com.invasionofsmallcubes.divisible.*

class FizzBuzz {
    fun evaluate(numbers: List<Int>): List<String>? {
        return numbers
                .map { n ->
                    DivisibleFactory.createChain(n)
                            .first { div -> div.divisible() }.value()
                }
    }
}