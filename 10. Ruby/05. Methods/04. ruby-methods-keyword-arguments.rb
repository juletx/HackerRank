# In this challenge, your task is to write a method convert_temp that helps in temperature conversion. The method will receive a number as an input (temperature), a named parameter input_scale (scale for input temperature), and an optional parameter output_scale (output temperature scale, defaults to Celsius) and return the converted temperature. It should perform interconversion between Celsius, Fahrenheit and Kelvin scale.

def convert_temp(temp, input_scale:, output_scale: 'celsius')
  case input_scale.downcase
  when 'celsius'
    case output_scale.downcase
    when 'celsius'
      temp
    when 'fahrenheit'
      temp * 1.8 + 32
    when 'kelvin'
      temp + 273.15
    end
  when 'fahrenheit'
    case output_scale.downcase
    when 'celsius'
      (temp - 32) / 1.8
    when 'fahrenheit'
      temp
    when 'kelvin'
      (temp + 459.67) * 5 / 9
    end
  when 'kelvin'
    case output_scale.downcase
    when 'celsius'
      temp - 273.15
    when 'fahrenheit'
      temp * 9 / 5 - 459.67
    when 'kelvin'
      temp
    end
  end
end