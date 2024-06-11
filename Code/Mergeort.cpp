#include <bits/stdc++.h>
using namespace std;

void merge(vector<int> &v, int left, int mid, int right)
{
    int n1 = mid - left + 1;
    int n2 = right - mid;
    vector<int> leftVec(n1);
    vector<int> rightVec(n2);

    for (int i = 0; i < n1; i++)
    {
        leftVec[i] = v[left + i];
    }
    for (int i = 0; i < n2; i++)
    {
        rightVec[i] = v[mid + i + 1];
    }

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2)
    {
        if (leftVec[i] <= rightVec[j])
        {
            v[k] = leftVec[i];
            i++;
        }
        else
        {
            v[k] = rightVec[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        v[k] = leftVec[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        v[k] = rightVec[j];
        k++;
        j++;
    }
}

void mergeSort(vector<int> &v, int left, int right)
{
    if (left < right)
    {
        int mid = left + (right - left) / 2;
        mergeSort(v, left, mid);
        mergeSort(v, mid + 1, right);
        merge(v, left, mid, right);
    }
}

int main()
{
    vector<int> arr = {2, 4, 1, 3, 6, 7};
    mergeSort(arr, 0, arr.size() - 1);
    for (int num : arr)
    {
        cout << num << " ";
    }
    cout << endl;
}