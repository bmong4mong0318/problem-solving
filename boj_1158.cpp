#include <iostream>
#include <list>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);
	int num, n;
	cin >> num >> n;
	int len = num;
	int cnt = n - 1;
	list<int> a;
	while (num > 0)
		a.push_front(num--);
	list<int>::iterator cur = a.begin();
	int tmp = cnt;
	cout << '<';
	for (int i = 0; i < len; i++){
		while (cnt--) {
			if (*cur == a.back())
				cur = a.begin();
			else
				cur++;
		}
		cnt = tmp;
		if (a.size() == 1)
			cout << *cur;
		else
			cout << *cur << ", ";
		if (cur == a.end()) {
			a.pop_back();
			cur = a.begin();
		}
		else {
			cur = a.erase(cur);
			if (cur == a.end())
				cur++;
		}
	}
	cout << '>';
	return (0);
}