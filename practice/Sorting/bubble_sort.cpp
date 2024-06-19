#include <bits/stdc++.h>
using namespace std;

void sorting(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
            }
        }
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