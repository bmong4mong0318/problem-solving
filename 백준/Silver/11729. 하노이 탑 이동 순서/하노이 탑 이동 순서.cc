#include <bits/stdc++.h>
using namespace std;

void recursive(int a, int b, int n)
{
	if (n == 1)
	{
		cout << a <<' '<< b << '\n';
		return ;
	}
	recursive(a, 6-a-b, n-1);
	cout << a << ' ' << b << '\n';
	recursive(6-a-b, b, n-1);
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;
	cout << (1<<n) - 1 << '\n';
	recursive(1, 3, n);
}