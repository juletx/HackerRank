#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Read the size of the array
    int n;
    scanf("%d", &n);

    // Dynamically allocate memory for the array
    int *arr = (int*)malloc(n * sizeof(int));

    // Read the values for the array
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    // Calculate the sum of the array elements
    int sum = 0;
    for (int i = 0; i < n; i++)
        sum += arr[i];

    // Print the sum
    printf("%d\n", sum);

    // Free the memory allocated for the array
    free(arr);

    return 0;
}
