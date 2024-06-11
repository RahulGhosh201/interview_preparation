// Equilibrium Index of an Array
#include <bits/stdc++.h>
using namespace std;

int soln(vector<int> arr)
{
    int totalSum = 0, leftSum = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        totalSum += arr[i];
    }
    for (int i = 0; i < arr.size(); i++)
    {
        totalSum -= arr[i];
        if (leftSum == totalSum)
        {
            return i;
        }
        leftSum += arr[i];
    }
    return -1;
}

int main()
{
    vector<int> arr = {1, 3, 5, 2, 2};
    int ans = soln(arr);
    if (ans >= 0)
    {
        cout << "Equilibrium index: " << ans << endl;
    }
    else
    {
        cout << "Equilibrium index not found, so: " << -1 << endl;
    }
    return 0;
}