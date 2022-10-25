#include <iostream>
#include <list>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int num;
    cin >> num;
    string input;
    list<char> L;
    list<char> ::iterator cursor;
    while (num--)
    {
        cin >> input;
        L.clear();
        cursor = L.begin();
        for (int i = 0; i < input.length(); i++){
            if (input[i] == '<') {
                if (cursor != L.begin())
                    cursor--;
            }
            else if (input[i] == '>') {
                if (cursor != L.end())
                    cursor++;
            }
            else if (input[i] == '-') {
                if (cursor != L.begin())
                    cursor = L.erase(--cursor);
            }
            else {
                L.insert(cursor, input[i]);
            }
        }
        for (cursor = L.begin(); cursor != L.end(); cursor++) {
            cout << *cursor;
        }
        cout << '\n';
    }
    return (0);
}