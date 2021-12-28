#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    // Write Your Code Here
    static const char *word[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    if (n <= 9){
        cout << word[n - 1] << endl;
    }      
    else{
        cout << "Greater than 9" << endl; 
    }

    return 0;
}
