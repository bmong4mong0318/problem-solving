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

int R, C;
int maze[1001][1001];
int visJ[1001][1001];
int visF[1001][1001];


int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	queue<ii> q;
	queue<ii> q_fire;

	cin >> R >> C;
	for (int i = 0; i < R; i++){
		for (int j = 0; j < C; j++){
			visJ[i][j] = -1;
			visF[i][j] = -1;
		}
	}

	for (int i = 0; i < R; i++){
		string tmp;
		cin >> tmp; 
		for (int j = 0; j < C; j++){
			maze[i][j] = tmp[j];
			if (tmp[j] == 'J'){
				q.push({i, j});
				visJ[i][j] = 0;
			}else if (tmp[j] == 'F'){
				q_fire.push({i, j});
				visF[i][j] = 0;
			}
		}
	}

	while (!q_fire.empty()){
		int x_fire = q_fire.front().first;
		int y_fire = q_fire.front().second;
		q_fire.pop();
		for (int i = 0; i < 4; i++){
			int nx = x_fire + dx[i];
			int ny = y_fire + dy[i];

			if (nx < 0 || nx >= R || ny < 0 || ny >= C)
				continue;
			if (visF[nx][ny] >= 0 || maze[nx][ny] == '#')
				continue;

			visF[nx][ny] = visF[x_fire][y_fire] + 1;
			q_fire.push({nx,ny});
		}
	}

	while (!q.empty()){
		int x = q.front().first;
		int y = q.front().second;
		q.pop();

		for (int i = 0; i < 4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= R || ny < 0 || ny >= C){
				cout << visJ[x][y] + 1;
				return 0;
			}
			if (visJ[nx][ny] >= 0 || maze[nx][ny] == '#')
				continue;

			if (visF[nx][ny] != -1 
				&& visF[nx][ny] <= visJ[x][y] + 1)
				continue;

			visJ[nx][ny] = visJ[x][y] + 1;
			q.push({nx,ny});
		}	
	}
	cout << "IMPOSSIBLE";
	return (0);
}
