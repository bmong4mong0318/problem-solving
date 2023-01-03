#include <iostream>
#include <vector>
#include <stack>
using namespace std;
#define ffor(i, x) for (int (i) = 0; (i) < (x) ; (i)++) // :별:️ 0부터 x까지 for-loop
#define ccc(x) int (x); cin >> (x); // :별:️ int 변수 만들고 그걸로 stdin 인풋 하나 받기
#define cob(x) cout << x << ' '; // :별:️ 변수 출력하고 스페이스바
#define ii pair<int, int> // :별:️ 보통 vector랑 많이 쓴다
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    ccc(N)
    stack<ii> s;
    ffor(i,N){
        ii x;
        cin >> x.first;
        x.second = i+1;
        if (s.empty()){
            s.push(x);
			cob('0')
        }
        else if (x.first < s.top().first){
            cob(s.top().second)
            s.push(x);
        }
        else if (x.first > s.top().first){
			while (x.first > s.top().first){
            	s.pop();
				if (s.empty())
					break ;
			}
			if (s.empty()){
           	 s.push(x);
				cob('0')
    	    }
			else
				cob(s.top().second)
            s.push(x);
		}
    }
    return (0);
}

