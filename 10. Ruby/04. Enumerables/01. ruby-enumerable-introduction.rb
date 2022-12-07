# In this challenge, you have been provided with a custom object called colors that defines its own each method. You need to iterate over the items and return an Array containing the values.

def iterate_colors(colors)
    # Your code here
    colors_array = []
    colors.each do |color|
        colors_array.push(color)
    end
    return colors_array
end