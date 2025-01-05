
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] anagramMappings(int[] firstInput, int[] secondInput) {

        int numberOfElements = firstInput.length;
        Map<Integer, Integer> valueToIndexesInSecondInput = new HashMap<>();
        for (int i = 0; i < numberOfElements; ++i) {
            valueToIndexesInSecondInput.put(secondInput[i], i);
        }

        int[] anagramMappings = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; ++i) {
            int value = firstInput[i];
            int indexInSecondInput = valueToIndexesInSecondInput.get(value);
            anagramMappings[i] = indexInSecondInput;
        }

        return anagramMappings;
    }
}
