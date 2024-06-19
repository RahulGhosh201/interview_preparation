#include <bits/stdc++.h>
using namespace std;

void common(vector<int> a, vector<int> b)
{
    unordered_set<int> c(b.begin(), b.end());
    // for (int i = 0; i < a.size(); i++)
    // {
    //     for (int j = 0; j < b.size(); j++)
    //     {
    //         if (a[i] == b[j])
    //         {
    //             c.insert(a[i]);
    //         }
    //     }
    // }
    vector<int> ans;
    for (int i = 0; i < a.size(); i++)
    {
        if (c.find(a[i]) != c.end())
        { // mane end() r age jodi find kore fele bujhte hbe then that element exists in the given set
            ans.push_back(a[i]);
            c.erase(a[i]);
        }
    }

    for (auto it : ans)
    {
        cout << it << " ";
    }
    cout << endl;
}

int main()
{
    vector<int> a = {1, 5, 3, 4, 10, 2, 6, 15};
    vector<int> b = {5, 11, 6, 10, 19};
    common(a, b);
    return 0;
}