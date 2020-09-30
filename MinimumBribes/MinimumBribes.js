const test1 = [2, 1, 5, 3, 4]
const test2 = [2, 5, 1, 3, 4]
const test3 = [5, 1, 2, 3, 7, 8, 6, 4]

const miniMumBribes = (q) => {
    let bribes = 0
    for (let i = 0; i < q.length; i++) {
        if (q[i] - (i+1) > 2) {
            return 'Too chaotic'
        }

        for(let j = Math.max(0, q[i]-2); j < i; j++) {
            if (q[j] > q[i]) {
                bribes++
            }
        }
    }
    return bribes
}

miniMumBribes(test1)
miniMumBribes(test2)
miniMumBribes(test3)