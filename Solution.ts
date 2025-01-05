
function anagramMappings(firstInput: number[], secondInput: number[]): number[] {

    const numberOfElements = firstInput.length;
    const valueToIndexesInSecondInput = new Map<number, number>();
    for (let i = 0; i < numberOfElements; ++i) {
        valueToIndexesInSecondInput.set(secondInput[i], i);
    }

    const anagramMappings = new Array<number>(numberOfElements);
    for (let i = 0; i < numberOfElements; ++i) {
        const value = firstInput[i];
        const indexInSecondInput = valueToIndexesInSecondInput.get(value);
        anagramMappings[i] = indexInSecondInput;
    }

    return anagramMappings;
};
