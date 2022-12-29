#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    // Create a stringstream from the input string
    stringstream ss(str);

    // Declare a vector to store the parsed integers
    vector<int> integers;

    // Extract integers from the stringstream and store them in the vector
    int num;
    while (ss >> num) {
        integers.push_back(num);

        // Check if the next character is a comma
        if (ss.peek() == ',') {
        // Discard the comma
            ss.ignore();
        }
    }

    return integers;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}