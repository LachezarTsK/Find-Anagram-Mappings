
using System;
using System.Collections.Generic;

public class Solution
{
    public int[] AnagramMappings(int[] firstInput, int[] secondInput)
    {
        int numberOfElements = firstInput.Length;
        Dictionary<int, int> valueToIndexesInSecondInput = new Dictionary<int, int>();
        for (int i = 0; i < numberOfElements; ++i)
        {
            valueToIndexesInSecondInput.TryAdd(secondInput[i], i);
        }

        int[] anagramMappings = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; ++i)
        {
            int value = firstInput[i];
            int indexInSecondInput = valueToIndexesInSecondInput[value];
            anagramMappings[i] = indexInSecondInput;
        }

        return anagramMappings;
    }
}
