// Reverse words in a given string
#include <bits/stdc++.h>
using namespace std;

void soln(string &str)
{
    int n = str.size();
    for (int i = 0; i < n / 2; i++)
    {
        swap(str[i], str[n - i - 1]);
    }
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before reversal: " << str << endl;
    soln(str);
    cout << "After reversal: " << str << endl;
    return 0;
}