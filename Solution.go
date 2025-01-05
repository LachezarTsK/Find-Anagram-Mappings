
package main

import "fmt"

func anagramMappings(firstInput []int, secondInput []int) []int {

    numberOfElements := len(firstInput)
    valueToIndexesInSecondInput := map[int]int{}
    for i := 0; i < numberOfElements; i++ {
        valueToIndexesInSecondInput[secondInput[i]] = i
    }

    anagramMappings := make([]int, numberOfElements)
    for i := 0; i < numberOfElements; i++ {
        value := firstInput[i]
        indexInSecondInput := valueToIndexesInSecondInput[value]
        anagramMappings[i] = indexInSecondInput
    }

    return anagramMappings
}
