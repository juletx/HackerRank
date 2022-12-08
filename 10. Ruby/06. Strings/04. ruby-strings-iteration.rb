# Challenge: Write the method count_multibyte_char which takes a string as input and returns the number of multibyte characters (byte size > 1) in it.

def count_multibyte_char(str)
  count = 0
  str.each_char do |char|
    count += 1 if char.bytesize > 1
  end
  count
end