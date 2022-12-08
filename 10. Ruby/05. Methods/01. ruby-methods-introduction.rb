# In this challenge, you need to write a method prime? that takes an argument and returns true or false depending on if the number is prime or not.

def prime?(num)
    if num < 2
        return false
    end
    for i in 2..num-1
        if num % i == 0
            return false
        end
    end
    return true
end