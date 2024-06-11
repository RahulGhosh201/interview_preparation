// Convert characters of a string to opposite case Count words in a given string
#include <bits/stdc++.h>
using namespace std;

void soln(string &str)
{
    for (int i = 0; i < str.size(); i++)
    {
        if (isalpha(str[i]))
        {
            if (islower(str[i]))
            {
                str[i] = toupper(str[i]);
            }
            else if (isupper(str[i]))
            {
                str[i] = tolower(str[i]);
            }
        }
    }
}

int main()
{
    string str;
    cout << "Enter str: ";
    getline(cin, str);
    cout << "Before modification: " << str << endl;
    soln(str);
    cout << "After modification: " << str << endl;
    return 0;
}