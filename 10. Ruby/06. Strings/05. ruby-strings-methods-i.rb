# In this challenge, your task is to code a process_text method, which takes an array of strings as input and returns a single joined string with all flanking whitespace and new lines removed. Each string has to be separated by a single space.

def process_text(arr)
  arr.map {|s| s.strip}.join(" ")
end