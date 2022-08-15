#include <iostream>
#include <algorithm>
#define MAX 1000
using namespace std;

int main()
{
    int n;
    int *input;

    cin >> n;
    input = new int[MAX];
    for (int i = 0 ; i < n ; i++)
        cin >> input[i];
    sort(&input[0], &input[n]);
    for (int i = 0 ; i < n ; i++)
    {
        cout << input[i];
        cout << endl;
    }
    return (0);
}