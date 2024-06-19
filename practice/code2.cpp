#include <bits/stdc++.h>
using namespace std;

int soln(vector<int> &arr)
{
    // unordered_set<int> p;
    // for (int i = 0; i < arr.size(); i++)
    // {
    //     int temp = 0;
    //     for (int j = i; j < arr.size(); j++)
    //     {
    //         temp = temp | arr[j];
    //         p.insert(temp);
    //     }
    // }
    // return p.size();
    // set create korchi ekta end then tar modhye 2 to loop chalie mane n^2 complexity te all the or values store korchi, set e store
    // koray unique value gulo only store hoche and then set r size return korchi.

    unordered_set<int> unique;
    set<int> current;

    for (int num : arr)
    {
        unordered_set<int> newArr;
        newArr.insert(num);
        for (int val : current)
        {
            newArr.insert(val | num);
        }
        current = move(newArr);
        unique.insert(current.begin(), current.end());
    }
    return unique.size();
}

int main()
{
    vector<int> arr = {1, 2, 4};
    int ans = soln(arr);
    cout << "Ans: " << ans << endl;
    return 0;
}
