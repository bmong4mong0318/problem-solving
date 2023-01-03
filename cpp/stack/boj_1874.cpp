#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;
	
	stack<int> s;
	vector<int> v;
	vector<int> a;
	vector<char> ans;

	for (int i = 0; i < n; i++){
		int tmp;
		cin >> tmp;
		v.push_back(tmp);
	}
	int num = 0;
	for (int i = 0; i < n; i++)
		a.push_back(++num);	

	int i = 0;
	int j = 0;
	int cnt = 0;
	while (i < n){
		while (cnt < v[i]){
			s.push(a[j++]);
			ans.push_back('+');
			cnt++;
		}
		if (s.top() == v[i]){
			s.pop();
			ans.push_back('-');
			i++;
		}
		else {
			cout << "NO";
			return (0);
		}
	}
	for (int i = 0; i < ans.size(); i++)
		cout << ans[i] << '\n';
	return (0);
}
