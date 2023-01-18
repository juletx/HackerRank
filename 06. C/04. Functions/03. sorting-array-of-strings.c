#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int lexicographic_sort(const char* a, const char* b) {
    int len_a = strlen(a);
    int len_b = strlen(b);
    int len = len_a < len_b ? len_a : len_b;
    for (int i = 0; i < len; i++) {
        if (a[i] < b[i]) {
            return 1;
        } else if (a[i] > b[i]) {
            return 0;
        }
    }
    return len_a < len_b ? 1 : 0;
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    int len_a = strlen(a);
    int len_b = strlen(b);
    int len = len_a < len_b ? len_a : len_b;
    for (int i = 0; i < len; i++) {
        if (a[i] < b[i]) {
            return 0;
        } else if (a[i] > b[i]) {
            return 1;
        }
    }
    return len_a < len_b ? 0 : 1;
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int len_a = strlen(a);
    int len_b = strlen(b);
    int count_a = 0;
    int count_b = 0;
    for (int i = 0; i < len_a; i++) {
        int flag = 0;
        for (int j = i + 1; j < len_a; j++) {
            if (a[i] == a[j]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            count_a++;
        }
    }
    for (int i = 0; i < len_b; i++) {
        int flag = 0;
        for (int j = i + 1; j < len_b; j++) {
            if (b[i] == b[j]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            count_b++;
        }
    }
    if (count_a < count_b) {
        return 1;
    } else if (count_a > count_b) {
        return 0;
    } else {
        return lexicographic_sort(a, b);
    }
}

int sort_by_length(const char* a, const char* b) {
    int len_a = strlen(a);
    int len_b = strlen(b);
    if (len_a < len_b) {
        return 1;
    } else if (len_a > len_b) {
        return 0;
    } else {
        return lexicographic_sort(a, b);
    }
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len - 1; j++) {
            if (cmp_func(arr[j], arr[j + 1]) == 0) {
                char* temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}


int main() 
{
    int n;
    scanf("%d", &n);
  
    char** arr;
	arr = (char**)malloc(n * sizeof(char*));
  
    for(int i = 0; i < n; i++){
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }
  
    string_sort(arr, n, lexicographic_sort);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);    
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");
}