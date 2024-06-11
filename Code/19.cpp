// Print Array After It Is Right Rotated K Times

#include <bits/stdc++.h>
using namespace std;

void printArr(vector<int> &arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void rotate(vector<int> &arr, int n)
{
    int temp = arr[n - 1];
    for (int i = n - 1; i > 0; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[0] = temp;
}

void rotateRight(vector<int> &arr, int n, int k)
{
    for (int i = 0; i < k; i++)
    {
        rotate(arr, n);
    }
    printArr(arr, n);
}

int main()
{
    int n = 0, k = 0;
    cout << "Enter n: ";
    cin >> n;
    vector<int> arr(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "Enter k: ";
    cin >> k;
    cout << "Before rotating: ";
    printArr(arr, n);
    cout << "After rotating: ";
    rotateRight(arr, n, k);
    return 0;
}