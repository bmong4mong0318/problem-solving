#include <iostream>
using namespace std;
const int MX = 100000;
int queue[MX];
int pos = 0;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N;
	cin >> N;
	while (N--) {
		string input;
		cin >> input;
		if (input == "push") {
			int data;
			cin >> data;
			int size = pos;
			for (int i = size - 1; i >= 0; i--)
				queue[i + 1] = queue[i];
			queue[0] = data;
			pos++;
		}
		else if (input == "pop") {
			if (pos == 0)
				cout << -1 << '\n';
			else
				cout << queue[--pos] << '\n';
		}
		else if (input == "size") {
			cout << pos << '\n';
		}
		else if (input == "empty") {
			if (pos == 0)
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		else if (input == "front") {
			if (pos == 0)
				cout << -1 << '\n';
			else
				cout << queue[pos - 1] << '\n';
		}
		else if (input == "back") {
			if (pos == 0)
				cout << -1 << '\n';
			else
				cout << queue[0] << '\n';
		}
	}
	return (0);
}