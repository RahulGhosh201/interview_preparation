#include <bits/stdc++.h>
using namespace std;

void fib(int n)
{
    int a = 0, b = 1;
    int x = n, ans = 0;
    while (n != 0)
    {
        // cout << a << " ";
        ans = a;
        int temp = a + b;
        a = b;
        b = temp;
        n--;
    }
    cout << x << "th term in the fibonacci series is: " << ans << endl;
}

int main()
{
    int n = 5;
    fib(n);
    return 0;
}