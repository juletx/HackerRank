#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, x;
    int arr[n];
    scanf("%d", &n);
    
    for (int i = n-1; i >= 0; i--) {
        scanf("%d", &x);
        arr[i] = x;
    }
    
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
