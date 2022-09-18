#include <bits/stdc++.h>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

}


// int main()
// {
//     ios_base::sync_with_stdio(false);
//     cin.tie(NULL); cout.tie(NULL);
 
//     int num, n, m, total;

//     cin >> n >> m;
//     vector<int> a;
//     vector<int> b;
//     vector<int> ans;
    
// 	while (n--)
//     {
//         cin >> num;
//         a.push_back(num);
//     }
//     while (m--)
//     {
//         cin >> num;
//         b.push_back(num);
//     }
//     total = a.size() + b.size();
//     while (total--)
//     {
// 		if (a.size() != 0 || a.size() != 0)
// 		{
// 			if (a.front() >= b.front())
//        	 	{
//             	ans.push_back(b.front());
//             	b.erase(b.begin());
//         	}
//         	else 
//         	{
//           	 	ans.push_back(a.front());
//             	a.erase(a.begin());
// 	    	}
// 		}
// 		else if (a.size() == 0)
// 		{
// 			ans.push_back(b.front());
// 			b.erase(b.begin());
// 		}
// 		else if (b.size() == 0)
// 		{
// 			ans.push_back(a.front());
// 			a.erase(a.begin());
// 		}
// 	}
// 	for (int i = 0; i < ans.size(); i++)
// 		cout << ans[i] << ' ';
// }
