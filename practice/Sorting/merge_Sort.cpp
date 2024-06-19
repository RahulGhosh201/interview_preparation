#include <bits/stdc++.h>
using namespace std;

void merging(vector<int> &arr, int l, int mid, int r)
{
    int n1 = mid - l + 1;
    int n2 = r - mid;
    vector<int> v1(n1);
    vector<int> v2(n2);
    for (int i = 0; i < n1; i++)
    {
        v1[i] = arr[l + i];
    }
    for (int i = 0; i < n2; i++)
    {
        v2[i] = arr[mid + i + 1];
    }
    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2)
    {
        if (v1[i] <= v2[j])
        {
            arr[k] = v1[i];
            i++;
        }
        else
        {
            arr[k] = v2[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        arr[k] = v1[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        arr[k] = v2[j];
        j++;
        k++;
    }
}

void merge(vector<int> &arr, int l, int r)
{
    if (l < r)
    {
        int mid = l + (r - l) / 2;
        merge(arr, l, mid);
        merge(arr, mid + 1, r);
        merging(arr, l, mid, r);
    }
}

void printArr(vector<int> &arr)
{
    for (int num : arr)
    {
        cout << num << " ";
    }
    cout << endl;
}
int main()
{
    vector<int> arr = {10, 5, 12, 23, 15};
    cout << "Before sorting: ";
    printArr(arr);
    int l = 0, r = arr.size();
    merge(arr, l, r - 1);
    cout << "After sorting: ";
    printArr(arr);
    return 0;
}