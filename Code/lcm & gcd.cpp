#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b)
{
    while (b != 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int lcm(int a, int b)
{
    return (a * b) / gcd(a, b);
}

int main()
{
    int a = 15, b = 20;
    cout << "lcm(" << a << "," << b << "): " << lcm(a, b) << endl;
    cout << "gcd(" << a << "," << b << "): " << gcd(a, b) << endl;
}