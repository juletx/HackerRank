# In this challenge, we practice setting the encoding information for some string of text using Ruby's Encoding methods. Write a function named transcode which takes a ISO-8859-1 encoded string as a parameter, converts it to an UTF-8 encoded string, and returns the result.

def transcode(str)
  str.force_encoding('UTF-8')
end