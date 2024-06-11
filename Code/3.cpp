// Remove all characters other than alphabets
#include <bits/stdc++.h>
using namespace std;

string soln(string str)
{
    for (int i = 0; i < str.size(); i++)
    {
        if (!isalpha(str[i]))
        {
            str = str.replace(i, 1, "");
            i -= 1;
        }
    }
    return str;
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    string ans = soln(str);
    cout << "Ans: " << ans << endl;
    return 0;
}