#include <bits/stdc++.h>
using namespace std;

void soln1(string str)
{
    unordered_map<char, int> m;
    for (int i = 0; i < str.length(); i++)
    {
        m[str[i]]++;
    }

    for (auto it : m)
    {
        cout << it.first << ": " << it.second << endl;
    }
}

void soln2(vector<int> arr)
{
    unordered_map<int, int> m;
    for (int i = 0; i < arr.size(); i++)
    {
        m[arr[i]]++;
    }

    for (auto it : m)
    {
        cout << it.first << ": " << it.second << endl;
    }
}

int main()
{
    string str = "hello world";
    vector<int> arr = {1, 2, 3, 4, 5, 2, 3, 3};
    soln1(str);
    soln2(arr);
    return 0;
}