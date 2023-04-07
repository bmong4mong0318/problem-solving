#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;

#define fast ios_base::sync_with_stdio(false); cin.tie(0), cout.tie(0)
#define ll long long

int main() {
    fast;
    double w, h;
    cin >> w >> h;
    if (w / pow(h, 2) > 25) cout << "Overweight";
    else if (w / pow(h, 2) > 18.5) cout << "Normal weight";
    else cout << "Underweight";
}