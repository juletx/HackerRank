

/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    var total = 0
    for (var o of objects) {
        if (o.x === o.y) {
            total++
        }
    }
    return total
}

