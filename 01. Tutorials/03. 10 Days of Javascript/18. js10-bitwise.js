

function getMaxLessThanK(n, k) {
    var max = 0
    var and;
    for (var i=1; i < n; i++) {
        for (var j=i+1; j < n+1; j++) {
            and = i & j 
            if ((and) > max && (and) < k) {
                max = and
            }
        }
    }
    return max
}

