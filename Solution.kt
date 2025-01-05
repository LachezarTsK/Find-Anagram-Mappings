
import java.util.HashMap

class Solution {
    
    fun anagramMappings(firstInput: IntArray, secondInput: IntArray): IntArray {

        val numberOfElements = firstInput.size
        val valueToIndexesInSecondInput = HashMap<Int, Int>()
        for (i in 0..<numberOfElements) {
            valueToIndexesInSecondInput[secondInput[i]] = i
        }

        val anagramMappings = IntArray(numberOfElements)
        for (i in 0..<numberOfElements) {
            val value = firstInput[i]
            val indexInSecondInput = valueToIndexesInSecondInput[value]!!
            anagramMappings[i] = indexInSecondInput
        }

        return anagramMappings
    }
}
