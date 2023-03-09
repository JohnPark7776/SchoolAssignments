/*
Reads line from a26_data.txt file
Returns data in alphabetical order
Park, John
ICS 212 Assignment #26
05/03/2022
*/
#include <iostream>
#include <string.h>
#include <string>
#include <fstream>
#include <vector>    //to get the vector class (a vector is a type of array)
#include <algorithm> //to use the sort() function
#include <iomanip>   //to use the setw() function

using namespace std;

// Used to store three strings: the English, the Japanese, and the sort field
class Entry
{
public:
    // default constructor
    Entry()
    {
    }
    Entry(string e, string j, string s)
    {
        english = e;
        japanese = j;
        setSortField(s);
    }
    // three set functions
    void setEnglish(string e)
    {
        english = e;
    }

    void setJapanese(string j)
    {
        japanese = j;
    }

    void setSortField(string field)
    {
        string temp = field;
        string ban = " []()~-.";
        for_each(temp.begin(), temp.end(), [](char &c)
                 { c = tolower(c); });
        for (char c : ban)
        {
            temp.erase(remove(temp.begin(), temp.end(), c), temp.end());
        }

        sortField = temp;
    }
    // three get functions
    string getEnglish() const
    {
        return english;
    }

    string getJapanese() const
    {
        return japanese;
    }

    string getSortField() const
    {
        return sortField;
    }

    // Compiled get function
    void getAll() const
    {
        cout << english << japanese << endl;
    }

    // overload operator <
    bool operator<(const Entry e) const
    {
        return sortField < e.sortField;
    }

    // overload operator <<
    friend ostream &operator<<(ostream &output, const Entry &e)
    {
        e.getAll();
        return output;
    }

private:
    // data field for English
    string english;
    // data field for Japanese
    string japanese;
    // data field for the sort field
    string sortField;
};

int main(int argc, char *argv[])
{
    // Make a vector of Entry objects.
    vector<Entry> vEntry;

    // Read the data from the file one line at a time
    string line;
    Entry entry;
    ifstream myfile(argv[1]);

    if (!myfile) // Always test the file open.
    {
        cout << "Error opening output file" << endl;
        system("pause");
        return -1;
    }
    while (getline(myfile, line))
    {
        stringstream linestream(line);
        string engTemp, japTemp;

        // Break the line into three parts as described on the assignment webpage.
        getline(linestream, engTemp, '\t');
        getline(linestream, japTemp, '\t');

        // Store the data for each line in an Entry object.
        Entry entry1(engTemp, japTemp, engTemp);

        // Store each Entry object in the vector.
        vEntry.push_back(entry1);
    }

    // Closes file
    myfile.close();

    // Sort the vector of Entry objects.
    sort(vEntry.begin(), vEntry.end());

    // Display the English and Japanese parts of the sorted Entry objects.
    for (int i = 0; i < vEntry.size(); i++)
    {
        cout << i + 1 << ". " << setw(50) << left
             << vEntry[i].getEnglish() << vEntry[i].getJapanese() << endl;
    }
    return 0;
}
