#include <iostream>
#include <algorithm>
#include <utility>
#include <vector>
#include <stack>
#include <queue>
#include <list>
#include <map>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);
	int T;
	cin >> T;
	for (int i = 0; i < T; i++){
		int N, M;
		cin >> N >> M;
		vector<int> a;
		for (int j = 0; j < N; j++){
			int tmp;
			cin >> tmp;
			a.push_back(tmp);
		}
		vector<int> b;
		for (int k = 0; k < M; k++){
			int tmp2;
			cin >> tmp2;
			b.push_back(tmp2);
		}
		int ans = 0;
		sort(a.begin(),a.end());
		sort(b.begin(),b.end());
		for (int n = 0; n < N; n++){
			for (int m = 0; m < M; m++){
				ans++;
				if (a[n] > a[M])
					break ;	
			}
		}
		cout << ans << '\n';
	}
	return (0);
}
