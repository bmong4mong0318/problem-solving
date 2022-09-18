#include <bits/stdc++.h>

using namespace std;

int cnt = 0;

int make_one(unsigned int &n)
{
	if (n == 1)
		return (-1);
	else if (n % 3 == 0)
	{
		n /= 3;
		cnt++;
	}
	else if (n % 2 == 0)
	{
		n /= 2;
		cnt++;
	}
	else
	{
		n-=1;
		cnt++;
	}
	return (0);
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	unsigned int n;
	cin >> n;
	int i = 0;
	while (i == 0)
		i = make_one(n);
	cout << cnt;
}