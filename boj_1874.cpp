#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main()
{
	// ios_base::sync_with_stdio(false); 
	// cin.tie(NULL);
	// cout.tie(NULL);

	int n;
	cin >> n;
	
	stack<int> s;
	vector<int> v;
	vector<int> a;
 
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

		while (cnt <= v[i]){
			s.push(a[j++]);
			cout << '+' << '\n';
			cnt++;
		}
		if (cnt != n && j == n){
			cout << "NO";
			break ;
		}
		while (s.top() == v[i]){
			s.pop();
			cout << '-' << '\n';
			i++;
			cnt++;
		}
	}
	return (0);
}
