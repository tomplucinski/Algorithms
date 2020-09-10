function checkExam(array1, array2) {
    let score = 0;
    
    for (let i = 0; i < array1.length; i++) {
      
      if (array1[i] === array2[i]) {
        score += 4
      }
      
      if (array1[i] !== array2[i] && array2[i] !== "") {
        score -= 1
      }
    }
    
    return score > 0 ? score : 0
}

checkExam()