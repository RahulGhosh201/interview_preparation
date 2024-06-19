#include <bits/stdc++.h>
using namespace std;

void sorting(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n - 1; i++)
    {
        int minIdx = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[minIdx] > arr[j])
            {
                minIdx = j;
            }
        }
        swap(arr[minIdx], arr[i]);
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
    sorting(arr);
    cout << "After sorting: ";
    printArr(arr);
    return 0;
}