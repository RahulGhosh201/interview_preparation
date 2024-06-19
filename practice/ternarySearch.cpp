#include <bits/stdc++.h>
using namespace std;

int soln(vector<int> &arr, int n, int key)
{
    int l = 0;
    int r = n - 1;
    while (l <= r)
    {
        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;
        if (arr[mid1] == key)
        {
            return mid1;
        }
        else if (arr[mid2] == key)
        {
            return mid2;
        }
        else if (key < arr[mid1])
        {
            r = mid1 - 1;
        }
        else if (key > arr[mid2])
        {
            l = mid2 + 1;
        }
        else
        {
            l = mid1 + 1;
            r = mid2 - 1;
        }
    }
    return -1;
}

int main()
{
    vector<int> arr = {1, 2, 8, 9, 10, 15};
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