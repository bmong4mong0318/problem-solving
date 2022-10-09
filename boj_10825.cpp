#include <iostream>
#include <algorithm>
#include <utility>
#include <vector>
#include <stack>
#include <queue>
#include <list>
#include <map>
using namespace std;

class Student{
public: 
	string name;
	int k;
	int y;
	int	s;
};

int compare(Student a, Student b){
	if (a.k == b.k && a.y == b.y && a.s == b.s)
		return (a.name < b.name);
	else if (a.k == b.k && a.y == b.y)
		return (a.s > b.s);
	else if (a.k == b.k)
		return (a.y < b.y);
	else
		return (a.k > b.k);
}

int main()
{
	ios_base::sync_with_stdio(false); 
	cin.tie(NULL);
	cout.tie(NULL);

	int num;
	cin >> num;
	vector <Student> v;
	
	for (int i = 0; i < num; i++){
		Student student;
		cin >> student.name >> student.k >> student.y >> student.s;
		v.push_back(student);
	}
	sort(v.begin(), v.end(), compare);
	for (int i = 0; i < num; i++)
			cout << v[i].name << '\n';
	return (0);
}
