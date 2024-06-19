#include <bits/stdc++.h>
using namespace std;

int soln(vector<int> &arr, int n, int key)
{
    int left = 0;
    int right = n - 1;

    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        else if (key < arr[mid])
        {
            right = mid - 1;
        }
        else
        {
            left = mid + 1;
        }
    }
    return -1;
}

int main()
{
    vector<int> arr = {1, 5, 10, 15, 20};
    int n = arr.size();
    int key = 5;
    if (soln(arr, n, key) == -1)
        cout << key << " is not in the array" << endl;
    else
    {
        cout << key << " found at index: " << soln(arr, n, key) << endl;
    }
    return 0;
}