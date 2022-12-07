def sum_terms(n)
    # your code here
    (1..n).reduce(0) do |sum, number|
        sum + (number * number + 1)
    end
end