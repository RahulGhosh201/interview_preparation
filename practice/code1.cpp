// Calculate the sum of n terms of fibonacci series
// ip:n=5
// op:7

#include <bits/stdc++.h>
using namespace std;

int soln(int n)
{
    vector<int> v;
    int a = 0, b = 1;
    while (n != 0)
    {
        v.push_back(a);
        int temp = a + b;
        a = b;
        b = temp;
        n--;
    }
    int ans = 0;
    for (int num : v)
    {
        ans += num;
    }
    return ans;
}

int main()
{
    int n = 0;
    cout << "Enter n: ";
    cin >> n;
    int ans = soln(n);
    cout << "Ans: " << ans << endl;
    return 0;
}