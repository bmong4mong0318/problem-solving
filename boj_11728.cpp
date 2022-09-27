#include <iostream>
#include <vector>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
 
    int n, m;
	int a_idx = 0, b_idx = 0;

    cin >> n >> m;
    int a[n+1],b[m+1];

    for (int i=0; i<n; i++)
        cin >> a[i];
    for (int i=0; i<m; i++)
        cin >> b[i];
	while (a_idx < n && b_idx < m)
	{
		if(a[a_idx]<=b[b_idx])
            cout << a[a_idx++] << " ";
        else
            cout << b[b_idx++] << " ";
	}
	while(a_idx<n)
        cout << a[a_idx++] << " ";
    while(b_idx<m)
        cout << b[b_idx++] << " ";
}
