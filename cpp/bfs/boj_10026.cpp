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
#include <cstring>

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

int pic[101][101];
int visited[101][101];
int N, cnt1, cnt2;

int BFS(int row, int col, int color){
	queue<ii> q;
	if (visited[row][col] == 0){
		q.push(make_pair(row, col));
		visited[row][col] = 1;
	}

	while(!q.empty()){
		int x = q.front().first;
		int y = q.front().second;
		q.pop();

		for (int i = 0; i < 4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= N || ny < 0 || ny >= N)
				continue;
			
			if (pic[nx][ny] != color)
				continue;
			
			if (pic[nx][ny] == color && visited[nx][ny] == 0){
				q.push(make_pair(nx,ny));
				visited[nx][ny] = 1; 
			}
		}
	}
	return 1;
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> N;
	for (int i = 0; i < N; i++){
		string tmp;
		cin >> tmp;
		for (int j = 0; j < N; j++)
			pic[i][j] = tmp[j];
	}

	for (int i = 0; i < N; i++){
		for (int j = 0; j < N; j++){
			if (pic[i][j] == 'R' && visited[i][j] == 0)
				cnt1 += BFS(i , j, 'R');
			else if (pic[i][j] == 'G' && visited[i][j] == 0)
				cnt1 += BFS(i , j, 'G');
			else if (pic[i][j] == 'B' && visited[i][j] == 0)
				cnt1 += BFS(i , j, 'B');
		}
	}

	memset(visited, 0, sizeof(visited));

	for (int i = 0; i < N; i++){
		for (int j = 0; j < N; j++){
			if (pic[i][j] == 'G')
				pic[i][j] = 'R';
		}
	}

	for (int i = 0; i < N; i++){
		for (int j = 0; j < N; j++){
			if (pic[i][j] == 'R' && visited[i][j] == 0)
				cnt2 += BFS(i , j, 'R');
			else if (pic[i][j] == 'B' && visited[i][j] == 0)
				cnt2 += BFS(i , j, 'B');
		}
	}

	cout << cnt1 << " " << cnt2;
	return (0);
}
