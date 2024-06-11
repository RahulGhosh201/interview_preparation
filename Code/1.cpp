// ASCII value of a char
#include <bits/stdc++.h>
using namespace std;

int ASCIIval(char c)
{
    return (int)c;
}

int main()
{
    char c;
    cout << "Enter c: ";
    cin >> c;
    int ans = ASCIIval(c);
    cout << "ASCII value of " << c << " is " << ans << endl;
    return 0;
}