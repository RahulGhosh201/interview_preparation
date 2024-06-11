#include <bits/stdc++.h>
using namespace std;

int soln(int arr[], int n, int l, int r, int key)
{

    while (l <= r)
    {
        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;
        if (arr[mid1] == key)
            return mid1;
        if (arr[mid2] == key)
            return mid2;
        if (key < arr[mid1])
            r = mid1 - 1; // mane key r value array r first part e peye gechi then r=mid1-1
        else if (key > arr[mid2])
            l = mid2 + 1; // key r value array r third part r modhye pai then l=mid2+1
        else              // nahole 2nd part r modhye anbo
        {
            l = mid1 + 1;
            r = mid2 - 1;
        }
    }
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int n = 9;
    int l = 0, r = n;
    int key = 7;
    if (soln(arr, n, l, r, key) >= 0)
        cout << "Ans: " << soln(arr, n, l, r, key) << endl;
    else
        cout << key << " not found" << endl;
    return 0;
}