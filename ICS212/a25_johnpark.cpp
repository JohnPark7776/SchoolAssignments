#include <iostream>
#include <string>  //C++ has a string class
#include "node.h"  //class interface for class Node (this puts the header file code at the top of this file)
#include "stack.h" //class interface for class Stack (this puts the header file code at the top of this file)

using namespace std;

// class DisplayStack
class DisplayStack : public Stack
{

    friend ostream &operator<<(ostream &output, const DisplayStack &s)
    {
        Node *i = s.top;
        
        while (i != NULL)
        {
            cout << *i << " ";
            i = i->getNext();
        }

        return output;
    }
};

int main()
{
    cout << "test overloaded operator<< (cout):" << endl;
    DisplayStack stack1;
    stack1.push("apple");
    stack1.push("banana");
    stack1.push("carrot");
    stack1.push("durian");
    stack1.push("eggplant");
    cout << "stack1 = " << stack1 << endl;

    DisplayStack stack2;
    stack2.push("aji");
    stack2.push("budai");
    stack2.push("chochouo");
    stack2.push("ebi");
    stack2.push("fugu");
    stack2.push("koi");
    cout << "stack2 = " << stack2 << endl;

    return 0;
}