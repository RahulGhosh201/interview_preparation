// Program for Array Rotation
#include <bits/stdc++.h>
using namespace std;

void leftRotationByOne(int arr[], int n)
{
    int temp = arr[0];
    for (int i = 0; i < n - 1; i++)
    {
        arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp;
}

void leftRotate(int arr[], int n, int key)
{
    key %= n;
    for (int i = 0; i < key; i++)
    {
        leftRotationByOne(arr, n);
    }
}

void rightRotateByOne(int arr[], int n)
{
    int temp = arr[n - 1];
    for (int i = n - 1; i > 0; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[0] = temp;
}

void rightRotate(int arr[], int n, int key)
{
    for (int i = 0; i < key; i++)
    {
        rightRotateByOne(arr, n);
    }
}

void printArr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main()
{
    int arr[10];
    int n = 0, key = 0;
    cout << "No of elements in the array: ";
    cin >> n;
    cout << "Enter no of rotation in the array: ";
    cin >> key;
    cout << "Enter elements in the array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "Before rotation: ";
    printArr(arr, n);
    // leftRotate(arr, n, key);
    rightRotate(arr, n, key);
    cout << "After rotation: ";
    printArr(arr, n);
    return 0;
}