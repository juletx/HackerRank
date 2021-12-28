

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    var vowels = "aeiou"
    for (var c of s) {
        if (vowels.includes(c)) {
            console.log(c)
        }
    }
    for (var c of s) {
        if (!vowels.includes(c)) {
            console.log(c)
        }
    }
}

