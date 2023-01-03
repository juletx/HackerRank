#include <stdio.h>
#include <string.h>

int main() {
    char s[1000];
    int count[10] = {0}; // Initialize all counts to 0
    scanf("%s", s); // Read the string into s

    // Iterate through each character of the string
    for (int i = 0; i < strlen(s); i++) {
        char c = s[i];
        // If the character is a digit, increment the count for that digit
        if (c >= '0' && c <= '9') {
            count[c - '0']++;
        }
    }

    // Print the counts
    for (int i = 0; i < 10; i++) {
        printf("%d ", count[i]);
    }
    printf("\n");

    return 0;
}
