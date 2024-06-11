// Check if a string is substring of another
#include <bits/stdc++.h>
using namespace std;

bool isPart(string str1, string str2)
{
    if (str1.find(str2) != string::npos)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    string str1, str2;
    cout << "Enter str1: ";
    getline(cin, str1);
    cout << "Enter str2: ";
    getline(cin, str2);
    if (isPart(str1, str2))
    {
        cout << str2 << " is a part of " << str1 << endl;
    }
    else
    {
        cout << str2 << " is not a part of " << str1 << endl;
    }
    return 0;
}