#include <iostream>
using namespace std;

const int MX = 100000;
int stack[MX];
int pos = 0;;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int N;
	cin >> N;
	while (N--){
		string input;
		cin >> input;
		if (input == "push"){
			int data;
			cin >> data;
			stack[pos++] = data;
		}
		else if (input == "pop"){
			if (pos == 0)
				cout << -1 << '\n';
			else
				cout << stack[--pos] << '\n';  
		}
		else if (input == "size")
			cout << pos << '\n';
		else if (input == "empty"){
			if (pos == 0)
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		else if (input == "top"){
			if (pos == 0)
				cout << -1 << '\n';
			else
				cout << stack[pos-1] << '\n';
		}
	}
	return (0);
}
