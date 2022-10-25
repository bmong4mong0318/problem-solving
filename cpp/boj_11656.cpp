#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);
	
	string input;
	cin >> input;
	vector <string> a;

	a.push_back(input);
	int len = input.length();
	for (int i = 0; i <len; i++){
		input.erase(input.begin());
		a.push_back(input);
	}
	sort(a.begin(), a.end());
	for (int i = 1; i <= len; i++)
		cout << a[i] << '\n';
}