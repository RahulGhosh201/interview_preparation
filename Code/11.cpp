// Encrypt the string Remove duplicates from a given string
#include <bits/stdc++.h>
using namespace std;

string soln(string &str)
{
    unordered_set<char> seen;
    string result = "";
    for (char ch : str)
    {
        if (seen.find(ch) == seen.end())
        {
            result += ch;
            seen.insert(ch);
        }
    }
    return result;
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before removing duplication: " << str << endl;
    string ans = soln(str);
    cout << "After removing duplication: " << ans << endl;
    return 0;
}