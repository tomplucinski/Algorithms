const name = 'Tom Plucinski'

const vowelCount = (str) => {
  let word = str.toUpperCase().split(' ').join('').split('')
  const vowels = 'AEIOU'
  let vowelCount = 0

  word.forEach(letter => {
      if (vowels.includes(letter)) {
          vowelCount++
      }
  })

  return vowelCount
}


vowelCount(name)