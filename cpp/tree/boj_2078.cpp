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

int a,b,x,y;
int main(){
	cin >> a >> b;
	while (1){
		if (a == 1){
			y += b - 1;
			break;
		}
		else if (b == 1){
			x += a - 1;
			break;
		}
		if (a > b){
			x += a / b, a %= b;
		}
		else {
			y += b / a, b %= a;
		}
	}
	cout << x << " " << y;

}

// int main()
// {
// 	ios_base::sync_with_stdio(false); 
// 	cin.tie(NULL);
// 	cout.tie(NULL);

// 	int A, B;
// 	cin >> A >> B;
// 	int a = 1, b = 1, tmp = 0;
// 	int L = 0, R = 0;
// 	while (1){
// 		// 정답이면 탈출
// 		if (a == A && b == B)
// 			break ;
	
// 		tmp = a;
// 		// 왼쪽 가지로 이동
// 		a = a + b;
// 		// a가 타겟값보다 작거나 같으면 진행
// 		if (a <= A){
// 			++L;
// 			if (a == A && b == B)
// 				break ;
// 		}

// 		// a가 타겟값보다 커져버리면 오른쪽 가지로 가보기
// 		else if (a > A && b < B){
// 			// 오른쪽가지로 가야되니 다시 원래 노드로 이동
// 			a = tmp;
			
// 			tmp = b;
// 			// 오른쪽 가지로 이동
// 			b = a + b;
// 			// b가 타겟값보다 작거나 같으면 진행
// 			if (b <= B){
// 				++R;
// 				if (a == A && b == B)
// 					break ;
// 			}
// 			// 틀린 경우는 들어오지 않으므로 나머지 경우는 생각할 필요 X
			
// 		}
// 	}
// 	cout << L << " " << R;
// 	return (0);
// }
