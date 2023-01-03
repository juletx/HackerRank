#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    //Write your logic to print the tokens of the sentence here.
    // get the first word
    char *word = strtok(s, " ");

    // print each word
    while (word != NULL)
    {
        printf("%s\n", word);
        word = strtok(NULL, " ");
    }

    return 0;
}