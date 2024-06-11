// Duplicates in the input string Lexicographically next string
#include <iostream>
#include <algorithm>
#include <string>
#include <unordered_set>
using namespace std;

// Function to find the next lexicographical permutation of a string
bool nextPermutation(string &str)
{
    int n = str.size();
    int i = n - 2;

    // Find the rightmost character that is smaller than its next character
    while (i >= 0 && str[i] >= str[i + 1])
    {
        i--;
    }

    // If no such character is found, the string is the largest permutation
    if (i < 0)
    {
        return false;
    }

    // Find the smallest character on the right side of i that is greater than str[i]
    int j = n - 1;
    while (str[j] <= str[i])
    {
        j--;
    }

    // Swap characters at i and j
    swap(str[i], str[j]);

    // Reverse the sequence from i+1 to end
    reverse(str.begin() + i + 1, str.end());

    return true;
}

// Function to remove duplicates from a string
string removeDuplicates(const string &str)
{
    unordered_set<char> seen;
    string result = "";

    for (char ch : str)
    {
        if (seen.find(ch) == seen.end())
        {
            result += ch;
            seen.insert(ch);
        }
    }

    return result;
}

string nextLexicographicallyString(string str)
{
    // Find the next lexicographical permutation
    if (!nextPermutation(str))
    {
        return "No next lexicographical string";
    }

    // Remove duplicates
    return removeDuplicates(str);
}

int main()
{
    string str;
    cout << "Enter string: ";
    cin >> str;

    string nextStr = nextLexicographicallyString(str);
    cout << "Lexicographically next string without duplicates: " << nextStr << endl;

    return 0;
}
