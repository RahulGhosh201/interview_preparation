// Remove vowels from a String
// Remove spaces from a given string
#include <bits/stdc++.h>
using namespace std;

bool isVowel(char ch)
{
    ch = tolower(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        return 1;
    }
    return 0;
}

string soln(string str)
{
    for (int i = 0; i < str.length(); i++)
    {
        if (isVowel(str[i]) || str[i] == ' ')
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