// Sort string of characters
#include <bits/stdc++.h>
using namespace std;

// void sorting(string &str)
// {
//     sort(str.begin(), str.end());
// }

void sorting(string &str)
{
    int n = str.size();
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (str[j] > str[j + 1])
            {
                char temp = str[j];
                str[j] = str[j + 1];
                str[j + 1] = temp;
            }
        }
    }
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before sorting: " << str << endl;
    sorting(str);
    cout << "After sorting: " << str << endl;
    return 0;
}