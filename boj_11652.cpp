#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int num;
    cin >> num;
    long long tmp;
    vector<long long> a;
    for (int i = 0; i < num; i++){
        cin >> tmp;
        a.push_back(tmp);
    }
	sort(a.begin(), a.end());
	long long card = a[0];
	int cnt = 0, max = 0;
    for (int i = 1; i < num; i++){
		if (a[i] == a[i-1])
			cnt++;
		else
			cnt = 0;
		if (cnt > max){
			max = cnt;
			card = a[i];
		}
	}
    cout << card;
    return (0);
}