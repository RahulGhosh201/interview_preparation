#include <bits/stdc++.h>
using namespace std;

void revStr(string &str)
{
    int n = str.length();
    int l = 0, r = n - 1;
    // for (int i = 0; i < n / 2; i++)
    // {
    //     swap(str[i], str[n - i - 1]);
    // }
    while (l < r)
    {
        swap(str[l], str[r]);
        l++;
        r--;
    }
}

int revInt(int n)
{
    int ans = 0;
    while (n != 0)
    {
        int rem = n % 10;
        ans = ans * 10 + rem;
        n /= 10;
    }
    return ans;
}

int main()
{
    int n = 123;
    string str = "Rahul Ghosh";
    cout << "Befor reversing: " << str << " " << n << endl;
    revStr(str);
    cout << "After reversing: " << str << " " << revInt(n) << endl;
    return 0;
}