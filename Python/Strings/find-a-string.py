def count_substring(string, sub_string):
    sub_len = len(sub_string)
    count = 0
    for i in range(len(string) - sub_len + 1):
        if string[i:i+sub_len] == sub_string:
            count += 1
    return count

