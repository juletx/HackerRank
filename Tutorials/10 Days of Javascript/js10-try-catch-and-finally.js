

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try {
        s = s.split("").reverse().join("");
    }
    catch (e) {
        console.log(e.message)
    }
    console.log(s)
}

