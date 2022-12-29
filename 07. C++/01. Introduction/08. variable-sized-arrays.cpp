#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q;
    cin >> n >> q;

    // Create a vector of vectors to store the arrays
    vector<vector<int>> arrays(n);

    // Read the arrays
    for (int i = 0; i < n; i++)
    {
        int k;
        cin >> k;

        // Read the elements of the array
        for (int j = 0; j < k; j++)
        {
            int element;
            cin >> element;
            arrays[i].push_back(element);
        }
    }

    // Process the queries
    for (int i = 0; i < q; i++)
    {
        int x, y;
        cin >> x >> y;

        // Print the element at index y of the array at index x
        cout << arrays[x][y] << endl;
    }

    return 0;
}