# Your task is to use each and iterate through the collection and print the key-value pair in separate lines.

def iter_hash(hash)
    # your code here
    hash.each do |key, value|
        puts key
        puts value
    end
end