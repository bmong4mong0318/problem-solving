#include <iostream>
#include <algorithm>
#include <vector>
#include <map>
using namespace std;

map<int, int> order;

int compare(pair<int, int> a, pair<int, int> b)
{
	if (a.first == b.first)
		return (order[a.second] < order[b.second]);
	return (a.first > b. first);
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n,c;
	cin >> n >> c;
	map <int, int> m;
	map <int, int>::iterator it;
	vector< pair<int, int> > v;
	vector<int> answer;

	for (int i = 0; i < n; i++) {
		int num;
		cin >> num;
		m[num]++;
		if (order[num] == 0)
			order[num] = i + 1;
	}
	for (it = m.begin(); it != m.end(); it++)
		v.push_back( make_pair (it->second, it->first) );
	sort(v.begin(), v.end(), compare);
	for (int i = 0; i < v.size(); i++)
		for (int j = 0; j < v[i].first; j++)
			answer.push_back(v[i].second);
	for (int i = 0; i < answer.size(); i++)
		cout << answer[i] << " ";
}