#include <iostream>
#include <string>

using namespace std;

int main() {
    // Read in two strings
    string s1, s2;
    cin >> s1 >> s2;

    // Print the length of each string
    cout << s1.size() << " " << s2.size() << endl;

    // Concatenate the two strings and print the result
    cout << s1 + s2 << endl;

    // Swap the first characters of each string and print the result
    char temp = s1[0];
    s1[0] = s2[0];
    s2[0] = temp;
    cout << s1 << " " << s2 << endl;

    return 0;
}
