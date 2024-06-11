// Sum of numbers in string
#include <bits/stdc++.h>
using namespace std;

int soln(string str)
{
    int sum = 0, num = 0;
    for (int i = 0; i < str.size(); i++)
    {
        if (isdigit(str[i]))
        {
            num = num * 10 + (str[i] - '0');
        }
        else
        {
            sum += num;
            num = 0;
        }
    }
    sum += num;
    return sum;
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    int ans = soln(str);
    cout << "Ans: " << ans << endl;
    return 0;
}