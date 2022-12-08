# Your task is to print an array of the first N palindromic prime numbers.

def is_prime?(n)
  return false if n < 2
  (2..Math.sqrt(n)).lazy.each do |i|
    return false if n % i == 0
  end
  true
end

def is_palindrome?(n)
  n.to_s == n.to_s.reverse
end

def is_palindromic_prime?(n)
  is_palindrome?(n) && is_prime?(n)
end

def palindromic_primes(n)
  primes = []
  i = 2
  while primes.length < n
    primes << i if is_palindromic_prime?(i)
    i += 1
  end
  primes
end

n = gets.to_i
p palindromic_primes(n)