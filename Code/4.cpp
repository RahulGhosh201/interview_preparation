// Reverse a string
#include <bits/stdc++.h>
using namespace std;

// string soln(string str)
// {
//     int n = str.size();
//     for (int i = 0; i < n / 2; i++)
//     {
//         swap(str[i], str[n - i - 1]);
//     }
//     return str;
// }

void soln(string &str)
{
    // int n = str.length();
    // for (int i = 0; i < n / 2; i++)
    // {
    //     swap(str[i], str[n - i - 1]);
    // }
    int i = 0, n = str.length() - 1;
    while (i <= n)
    {
        swap(str[i], str[n]);
        i++;
        n--;
    }
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before revarsal: " << str << endl;
    // string ans = soln(str);
    soln(str);
    cout << "After revarsal: " << str << endl;
}