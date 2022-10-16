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

#define ffor(i, x) for (int (i) = 0; (i) < (x) ; ++(i)) // ⭐️ 0부터 x-1까지 for-loop
#define fffor(i, x) for (int (i) = 1; (i) <= (x) ; ++(i)) // ⭐️ 1부터 x까지 for-loop
#define cc(x) cin >> (x); // ⭐️ stdin 인풋 하나 받기
#define ccc(x) int (x); cin >> (x); // ⭐️ int 변수 만들고 그걸로 stdin 인풋 하나 받기
#define coo(x) cout << x << '\n'; // ⭐️ 변수 출력하고 줄바꿈
#define cob(x) cout << x << ' '; // ⭐️ 변수 출력하고 스페이스바
#define ii pair<int, int> // ⭐️ 보통 vector랑 많이 쓴다
#define ll long long // ⭐️ 매번 long long 치고 있으면 현기증이 옴

int dx[] = {1, 0, -1, 0}; // 동 남 서 북 // ⭐️ DFS, BFS 문제 풀 때 꼭 씀
int dy[] = {0, 1, 0, -1}; // ⭐️ 이렇게 안하고 2x4 배열로 만들어 쓰는 사람들도 있는 것 같다
int INF = 1e9 + 7; // ⭐️ 의외로 자주 쓰는 수. 자주 쓰고 말고는 문제를 풀면서 생각해보면 될 문제

int solution(int num, vector<int> v)
{
	int	start = 0;
	int end = v.size()-1;
    int mid;
	vector<int>::iterator cur = v.begin();
	int sum = 0;

    while(start <= end){
        mid = (start + end) / 2;
		cur += mid;
		cout << "check::";
        if(v[mid] == num){
			sum++;	
			v.erase(cur);
			v.shrink_to_fit();
		}
        else if(v[mid] < num)
            start = mid + 1;
        else if(v[mid] > num)
            end = mid - 1;
    }
    return (sum);
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	ccc(N);
	vector<int> a;
	while (N--){
		ccc(tmp);
		a.push_back(tmp);
	}
	ccc(M);
	int M_mem = M;
	vector<ii> b;
	while (M--){
		ii tmp;
		cin >> tmp.first;
		b.push_back(tmp);
	}
	sort(a.begin(),a.end());
	for (int i = 0; i < M_mem; i++){
		b[i].second = solution(b[i].first, a);
		cob(b[i].second);
	}
	return (0);
}
