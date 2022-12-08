combination = -> (n) do
  -> (r) do
    (1..n).reduce(:*) / ((1..r).reduce(:*) * (1..(n - r)).reduce(:*))
  end
end

n = gets.to_i
r = gets.to_i
nCr = combination.(n)
puts nCr.(r)