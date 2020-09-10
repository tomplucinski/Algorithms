const reverseWords = (input) => {
    let data = input.slice(1).split(' ')
    let reversedArray = []

    for (let i = 0; i < data.length; i++) {
        reversedArray.push(data[i].split('\n').join(' '))
    }

    let initialWord = reversedArray.pop() + reversedArray.shift()
    let words = reversedArray.join('\n')
    const reversedWords = initialWord + "\n" + words

    return reversedWords
}

reverseWords()