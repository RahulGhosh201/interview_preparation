// Remove brackets from an algebraic expression
#include <bits/stdc++.h>
using namespace std;

string soln(string &str)
{
    string ans = "";
    for (int i = 0; i < str.size(); i++)
    {
        if (str[i] != '(' && str[i] != ')' && str[i] != '{' && str[i] != '}' && str[i] != '[' && str[i] != ']')
        {
            ans += str[i];
        }
    }
    return ans;
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before removing brackets: " << str << endl;
    string ans = soln(str);
    cout << "After removing brackets: " << ans << endl;
    return 0;
}