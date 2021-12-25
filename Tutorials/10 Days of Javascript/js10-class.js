/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon {
    constructor(array) {
        this.a = array;
    }
    
    perimeter() {
        var sum = this.a.reduce(
            function(a, b){
                return a + b;
            }, 0);
        return sum
    }
}

