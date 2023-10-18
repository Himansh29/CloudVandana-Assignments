function reverseWords(sentence) {
    let words = sentence.split(' ');

    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const inputSentence2 = "My name is Himanshu";
console.log(reverseWords(inputSentence2));
console.log(reverseWords(inputSentence));
