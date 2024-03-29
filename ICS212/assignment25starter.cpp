#include <iostream>
#include <string> //C++ has a string class  
#include "node.h" //class interface for class Node (this puts the header file code at the top of this file)
#include "stack.h" //class interface for class Stack (this puts the header file code at the top of this file)

using namespace std;

//class DisplayStack
class DisplayStack : public Stack {
  
  friend ostream & operator<<(ostream & output, const DisplayStack & s){
    output<<"write your code here (and delete this line)";
    return output;
  }

};

int main(){
  cout<<"test overloaded operator<< (cout):"<<endl;
  DisplayStack stack1;
  stack1.push("apple");
  stack1.push("banana");
  stack1.push("carrot");
  stack1.push("durian");
  stack1.push("eggplant");
  cout<<"stack1 = "<<stack1<<endl;
  
  DisplayStack stack2;
  stack2.push("aji");
  stack2.push("budai");
  stack2.push("chochouo");
  stack2.push("ebi");
  stack2.push("fugu");
  stack2.push("koi");
  cout<<"stack2 = "<<stack2<<endl; 

  return 0;
}

/*
output:

test overloaded operator<< (cout):
stack1 = eggplant, durian, carrot, banana, apple, 
stack2 = koi, fugu, ebi, chochouo, budai, aji, 

Deleting Nodes in Stack...
delete Node from heap: koi
delete Node from heap: fugu
delete Node from heap: ebi
delete Node from heap: chochouo
delete Node from heap: budai
delete Node from heap: aji

Deleting Nodes in Stack...
delete Node from heap: eggplant
delete Node from heap: durian
delete Node from heap: carrot
delete Node from heap: banana
delete Node from heap: apple
*/

