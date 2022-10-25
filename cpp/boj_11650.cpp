#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, int> a, pair<int, int> b)
{
	if (a.first == b.first)
		return (a.second < b.second);
	return (a.first < b.first);
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int num;
	cin >> num;
	pair <int, int> tmp;
	vector< pair<int, int> > point;
	for (int i = 0; i < num; i++)
	{
		cin >> tmp.first >> tmp.second;
		point.push_back(tmp);
	}
	stable_sort(point.begin(), point.end(), compare);
	for (int i = 0; i < num; i++)
		cout << point[i].first << ' ' << point[i].second << '\n';
}