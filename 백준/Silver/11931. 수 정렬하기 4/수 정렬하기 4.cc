#include <iostream>
#include <algorithm>
#define MAX 1000000
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int n;
    int input[MAX];

    cin >> n;
    for (int i = 0 ; i < n ; i++)
        cin >> input[i];
    sort(input, input + n, greater<int>());
    for (int i = 0 ; i < n ; i++)
        cout << input[i] << '\n';
    return (0);
}