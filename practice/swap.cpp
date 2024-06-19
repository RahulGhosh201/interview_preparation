#include <bits/stdc++.h>
using namespace std;

void swapping(int &a, int &b)
{
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}

int main()
{
    int a = 5, b = 10;
    cout << "Before swap: a:" << a << " b:" << b << endl;
    swapping(a, b);
    cout << "After swapping: a:" << a << " b:" << b << endl;
    return 0;
}