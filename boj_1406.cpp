#include <iostream>

using namespace std;

const int MX  = 1000000;
char dat[MX];
int pre[MX], nxt[MX];
int unused = 1;

void insert(int addr, char word)
{
	dat[unused] = word;
  	pre[unused] = addr;
	nxt[unused] = nxt[addr];
	if(nxt[addr] != -1) 
		pre[nxt[addr]] = unused;
	nxt[addr] = unused;
	unused++;
}

void erase(int addr) 
{
	nxt[pre[addr]] = nxt[addr];
	if(nxt[addr] != -1) 
		pre[nxt[addr]] = pre[addr];
}

void traverse()
{
	int cur = nxt[0];
	while (cur != -1)
	{
		cout << dat[cur];
		cur = nxt[cur];
	}
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);
	fill(pre, pre + MX, -1);
	fill(nxt, nxt + MX, -1);
	
	int cur = 0;
	string	input;
	cin >> input;
	for (auto c : input){
		insert(cur, c);
		cur++;
	}

	int	n;
	cin >> n;
	while (n--)
	{
		char	cmd;
		cin >> cmd;
		if (cmd == 'P'){
			char add;
			cin >> add;
			insert(cur, add);
			cur = nxt[cur];
		}
		else if (cmd == 'L'){
			if (pre[cur] != -1)
				cur = pre[cur];
		}
		else if (cmd == 'D'){
			if (nxt[cur] != -1)
				cur = nxt[cur];
		}
		else {
			if (cur != 0){
				erase(cur);
				cur = pre[cur];
			}
		}
	}
	traverse();
}