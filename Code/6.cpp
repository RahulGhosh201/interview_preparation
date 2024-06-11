// Capitalize first and last character of each word Frequency of characters in a
// string
#include <bits/stdc++.h>
using namespace std;

void freq(string str)
{
    unordered_map<char, int> m;
    for (char ch : str)
    {
        m[ch]++;
    }
    for (auto it : m)
    {
        cout << it.first << " " << it.second << endl;
    }
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    freq(str);
    return 0;
}