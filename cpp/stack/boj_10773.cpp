#include <iostream>
#include <vector>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int K;
	cin >> K;
	vector<int> v;
	while (K--){
		int tmp;
		cin >> tmp;
		if (tmp == 0)
			v.pop_back();
		else
			v.push_back(tmp);
	}
	int sum = 0;
	for (auto c : v)
		sum += c;
	cout << sum;
	return (0);
}
