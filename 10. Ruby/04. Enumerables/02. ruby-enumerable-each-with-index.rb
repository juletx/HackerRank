# In this challenge, your task is to complete the skip_animals method that takes an animals array and a skip integer and returns an array of all elements except first skip number of items as shown in the example below.

def skip_animals(animals, skip)
    # Your code here
    animals_array = []
    animals.each_with_index do |animal, index|
        if index >= skip
            animals_array.push("#{index}:#{animal}")
        end
    end
    return animals_array
end