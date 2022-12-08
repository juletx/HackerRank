=begin
  
In this challenge, your task is to write the following methods:

mask_article which appends strike tags around certain words in a text. The method takes 2 arguments: A string and an array of words. It then replaces all the instances of words in the text with the modified version.

A helper method strike, given one string, appends strike off HTML tags around it. The strike off HTML tag is <strike></strike>.
  
=end

def strike(str)
  "<strike>#{str}</strike>"
end

def mask_article(str, arr)
  arr.each do |word|
    str.gsub!(word, strike(word))
  end
  str
end
