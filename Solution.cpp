
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {

public:
    vector<int> anagramMappings(const vector<int>& firstInput, const vector<int>& secondInput) const {

        int numberOfElements = firstInput.size();
        unordered_map<int, int> valueToIndexesInSecondInput;
        for (int i = 0; i < numberOfElements; ++i) {
            valueToIndexesInSecondInput[secondInput[i]] = i;
        }

        vector<int> anagramMappings(numberOfElements);
        for (int i = 0; i < numberOfElements; ++i) {
            int value = firstInput[i];
            int indexInSecondInput = valueToIndexesInSecondInput[value];
            anagramMappings[i] = indexInSecondInput;
        }

        return anagramMappings;
    }
};
