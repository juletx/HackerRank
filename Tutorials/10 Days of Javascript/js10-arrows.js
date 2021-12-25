

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    for (let [i, n] of nums.entries()) {
        if (n % 2 === 0) {
            nums[i] *= 2
        }
        else {
            nums[i] *= 3
        }
    }
    return nums
}

