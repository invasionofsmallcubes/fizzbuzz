package com.invasionofsmallcubes

import com.invasionofsmallcubes.divisible.DivisibleFactory.createChain

class FizzBuzz {
    fun evaluate(numbers: List<Int>): List<String>? {
        return numbers
                .map { n ->
                    createChain(n).first { div -> div.divisible() }.value()
                }
    }
}