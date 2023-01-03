#include <iostream>
#include <vector>
#include <utility>
#include <algorithm>

using namespace std;

bool compare(pair<int, string> a, pair<int, string> b)
{
	if (a.first != b.first)
		return a.first < b.first;
	else {
		for (int i = 0; i < a.second.length(); i++)
			if (a.second[i] != b.second[i])
				return (a.second[i] < b.second[i]);
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
	arr.erase(unique(arr.begin(), arr.end()), arr.end());
	arr.shrink_to_fit();
	for (int i = 0; i < arr.size(); i++)
		cout << arr[i].second << '\n';
	return (0);
}