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
#include <set>
#include <cstring> //memeset

using namespace std;

#define ffor(i, x) for (int (i) = 0; (i) < (x) ; (i)++) // ⭐️ 0부터 x까지 for-loop
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

int N, M;
vector<ii> bam;
vector<ii> sa;
queue<int> q;
int dis[101]; 

int isBam(int x){
	vector<ii>::iterator cur;

	for (cur = bam.begin(); cur != bam.end(); cur++){
		if (x == (*cur).first)
			return (*cur).second;
	}
	return -1;
}

int isSa(int x){
	vector<ii>::iterator cur;

	for (cur = sa.begin(); cur != sa.end(); cur++){
		if (x == (*cur).first)
			return (*cur).second;
	}
	return -1;
}

int main()
{
	// ios_base::sync_with_stdio(false); 
	// cin.tie(NULL);
	// cout.tie(NULL);

	cin >> N >> M;
	for (int i = 0,x ,y; i < N; i++){
		cin >> x >> y;
		bam.push_back({x, y}); 
	}

	for (int i = 0, x, y; i < M; i++){
		cin >> x >> y;
		sa.push_back({x, y});
	}

	memset(dis, -1, sizeof(dis));
	q.push(1);
	dis[1] = 0;;

	while (!q.empty()){
		int x = q.front();
		q.pop();

		for (int i = 1; i <= 6; i++){
			int nx = x + i;

			if (nx > 100)
				continue;

			if (isBam(nx) != -1)
				nx = isBam(nx);
			else if (isSa(nx) != -1)
				nx = isSa(nx);

			if (dis[nx] == -1){
				q.push(nx);
				dis[nx] = dis[x] + 1;
			}
		}
	}
	cout << dis[100];
	return (0);
}
