#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str = "hello";
    // reverse(str.begin(), str.end());
    int n = str.length();
    for (int i = 0; i < n / 2; i++)
    {
        swap(str[i], str[n - i - 1]);
    }
    // cout << str << endl;
    int x = 123;
    int ans = 0;
    while (x != 0)
    {
        int rem = x % 10;
        ans = ans * 10 + rem;
        x /= 10;
    }
    cout << ans << endl;
}