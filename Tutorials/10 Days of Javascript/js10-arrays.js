

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    var max = 0
    var sec = 0
    for (var n of nums) {
        if (n > max) {
            sec = max
            max = n
        }
        else if (n > sec && n < max) {
            sec = n
        }
    }
    return sec
}

