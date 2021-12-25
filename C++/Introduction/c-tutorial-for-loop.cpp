#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a, b;
    cin >> a >> b;

    static const char *word[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for (int n=a; n<=b; n++){
        if (n <= 9)
            cout << word[n - 1] << endl;
        else if (n % 2 == 1)
            cout << "odd" << endl;
        else
            cout << "even" << endl;
    }

    return 0;
}

