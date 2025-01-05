
/**
 * @param {number[]} firstInput
 * @param {number[]} secondInput
 * @return {number[]}
 */
var anagramMappings = function (firstInput, secondInput) {

    const numberOfElements = firstInput.length;
    const valueToIndexesInSecondInput = new Map();
    for (let i = 0; i < numberOfElements; ++i) {
        valueToIndexesInSecondInput.set(secondInput[i], i);
    }

    const anagramMappings = new Array(numberOfElements);
    for (let i = 0; i < numberOfElements; ++i) {
        const value = firstInput[i];
        const indexInSecondInput = valueToIndexesInSecondInput.get(value);
        anagramMappings[i] = indexInSecondInput;
    }

    return anagramMappings;
};
