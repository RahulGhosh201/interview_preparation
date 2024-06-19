#include <bits/stdc++.h>
using namespace std;

int fact(int n)
{
    // int ans = 1;
    // for (int i = 1; i <= n; i++)
    // {
    //     ans = ans * i;
    // }
    // return ans;
    if (n == 1)
        return 1;
    return n * fact(n - 1);
}

int main()
{
    int n = 5;
    cout << "factorial(" << n << "): " << fact(n) << endl;
    return 0;
}