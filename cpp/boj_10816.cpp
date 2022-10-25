#include <iostream>
#include <algorithm>
#include <utility>
#include <vector>
#include <string>
#include <stack>
#include <queue>
#include <deque>
#include <list>
#include <map>

using namespace std;

int n, m;
int arr[500000];
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
 
    cin >> n;
    for (int i = 0; i<n; i++)
		cin >> arr[i];
    sort(arr, arr + n);
    cin >> m;
    int x;
    while (m--) {
        cin >> x;
        int cnt = upper_bound(arr, arr + n, x) - lower_bound(arr, arr + n, x);
        cout << cnt << ' ';
    }
    return 0;
}

// my code // time-out

// int solution(int num, vector<int> v)
// {
// 	int	start = 0;
// 	int end = v.size()-1;
//     int mid;
// 	vector<int>::iterator cur = v.begin();
// 	int sum = 0;

//     while(start <= end){
//         mid = (start + end) / 2;
// 		cur += mid;
//         if(v[mid] == num){
// 			sum++;	
// 			v.erase(cur);
// 			v.shrink_to_fit();
// 		}
//         else if(v[mid] < num)
//             start = mid + 1;
//         else if(v[mid] > num)
//             end = mid - 1;
// 		cur = v.begin();
//     }
//     return (sum);
// }

// int main()
// {
// 	ios_base::sync_with_stdio(false); 
// 	cin.tie(NULL);
// 	cout.tie(NULL);

// 	ccc(N);
// 	vector<int> a;
// 	while (N--){
// 		ccc(tmp);
// 		a.push_back(tmp);
// 	}
// 	ccc(M);
// 	int M_mem = M;
// 	vector<ii> b;
// 	while (M--){
// 		ii tmp;
// 		cin >> tmp.first;
// 		b.push_back(tmp);
// 	}
// 	sort(a.begin(),a.end());
// 	ffor(i, M_mem){
// 		b[i].second = solution(b[i].first, a);
// 		cob(b[i].second);
// 	}
// 	return (0);
// }
