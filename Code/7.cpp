#include <iostream>
using namespace std;

void findSmallestAndLargestWord(const string &str, string &smallest, string &largest)
{
    int start = 0;
    int end = 0;
    int n = str.length();

    smallest = ""; // Initialize smallest word
    largest = "";  // Initialize largest word

    while (end <= n)
    {
        if (end == n || isspace(str[end]) || ispunct(str[end]))
        {
            if (start != end)
            {
                string word = str.substr(start, end - start);
                if (smallest.empty() || word.length() < smallest.length())
                {
                    smallest = word; // Update smallest word if current word is smaller
                }
                if (largest.empty() || word.length() > largest.length())
                {
                    largest = word; // Update largest word if current word is larger
                }
            }
            start = end + 1; // Move start to next character after space or punctuation
        }
        end++; // Move end to next character
    }
}

int main()
{
    string str;
    cout << "Enter string: ";
    getline(cin, str);

    string smallestWord, largestWord;
    findSmallestAndLargestWord(str, smallestWord, largestWord);

    if (!smallestWord.empty())
    {
        cout << "Smallest word: " << smallestWord << endl;
    }
    else
    {
        cout << "No words found." << endl;
    }
    if (!largestWord.empty())
    {
        cout << "Largest word: " << largestWord << endl;
    }
    else
    {
        cout << "No words found." << endl;
    }

    return 0;
}
