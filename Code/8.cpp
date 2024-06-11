// Strings are anagram of each other
#include <bits/stdc++.h>
using namespace std;

bool isAnagram(string str1, string str2)
{
    map<char, int> m1, m2;
    if (m1.size() != m2.size())
        return 0;
    for (int i = 0; i < str1.size(); i++)
    {
        m1[str1[i]]++;
        m2[str2[i]]++;
    }
    for (int i = 0; i < 26; i++)
    {
        if (m1[(char)i] != m2[(char)i])
        {
            return 0;
        }
    }
    return 1;
}

int main()
{
    string str1, str2;
    cout << "Enter str1: ";
    getline(cin, str1);
    cout << "Enter str2: ";
    getline(cin, str2);
    if (isAnagram(str1, str2))
    {
        cout << str1 << " and " << str2 << " are anagram to each other" << endl;
    }
    else
    {
        cout << str1 << " and " << str2 << " are not anagram to each other" << endl;
    }
    return 0;
}