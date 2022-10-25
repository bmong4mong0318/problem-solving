#include <iostream>
#include <vector>
#include <utility>
#include <algorithm>

using namespace std;

bool compare(pair<int, string> a, pair<int, string> b)
{
	int sum_a = 0;
	int sum_b = 0;

	if (a.first != b.first)
		return a.first < b.first;
	else {
		int i = 0;
		while (a.second[i]){
			if (isdigit(a.second[i]))
				sum_a += a.second[i] - '0';
			i++;
		}
		i = 0;
		while (b.second[i]){
			if (isdigit(b.second[i]))
				sum_b += b.second[i] - '0';
			i++;
		}
		if (sum_a == sum_b){
			for (int i = 0; i < a.first; i++){
				if (a.second[i] != b.second[i])
					return (a.second[i] < b.second[i]);
			}
		}
		return (sum_a < sum_b);
	}
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int num;
	cin >> num;
	pair<int, string> tmp;
	vector< pair<int,string> > arr;
	for (int i = 0; i < num; i++)
	{
		cin >> tmp.second;
		tmp.first = tmp.second.length();
		arr.push_back(tmp);
	}
	sort(arr.begin(), arr.end(), compare);
	for (int i = 0; i < num; i++)
		cout << arr[i].second << '\n';
	return (0);
}