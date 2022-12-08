=begin
  
In this challenge, your task is to code a serial_average method which is described below:

It takes a fixed width string in format: SSS-XX.XX-YY.YY. SSS is a three digit serial number, XX.XX and YY.YY are two digit numbers including up to two decimal digits.

It returns a string containing the answer in format SSS-ZZ.ZZ where SSS is the serial number of that input string, and ZZ.ZZ is the average of XX.XX and YY.YY.

All numbers are rounded off to two decimal places.
  
=end

def serial_average(str)
  serial = str[0, 3]
  avg = (str[4, 5].to_f + str[10, 5].to_f) / 2
  return "#{serial}-#{avg.round(2)}"
end