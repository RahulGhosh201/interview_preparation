// Non-Repeating Element
#include <bits/stdc++.h>
using namespace std;

int soln(int arr[], int n)
{
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        ans ^= arr[i];
    }
    return ans;
}

int main()
{
    int arr[10], n = 0;
    cout << "Enter no of elements: ";
    cin >> n;
    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int ans = soln(arr, n);
    cout << "Non repeating elemnt in the array: " << ans << endl;
    return 0;
}