=begin

In this challenge, your task is to write a method which takes an array of strings (containing secret enemy message bits!) and decodes its elements using ROT13 cipher system; returning an array containing the final messages.

For example, this is how ROT13 algorithm works,

Original text:

Why did the chicken cross the road?
Gb trg gb gur bgure fvqr!
On application of ROT13,

Jul qvq gur puvpxra pebff gur ebnq?
To get to the other side!

=end

def rot13(secret_messages)
    # your code here
    secret_messages.map do |message|
        message.tr('A-Za-z', 'N-ZA-Mn-za-m')
    end
end