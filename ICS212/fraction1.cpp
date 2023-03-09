/*
Example of class definition (and driver program) in C++ 
Class Fraction stores the numerator and denominator for Fraction objects
*/
#include <iostream>
using namespace std;

//Fraction class definition (abstract data type (ADT))
class Fraction{ 
   
/*
functions and variables in the public section 
are accessible anywhere in the class definition
*/
public:

   //Constructor initializes each data member
   //(This is a default constructor - a constructor with no parameters.)
   Fraction(){       
      numerator = 0;      
      denominator = 1;   
   }

   /*
   display the data members (numerator and denominator) of a Fraction   
   const is used because these values should not be changed by a display function
   */
   void print() const{      
      cout << numerator << "/" << denominator;   
   }
/*
variables and functions in the private section
are accessible only to member functions
*/
private:      
   int numerator;    //data member      
   int denominator;    //data member

};//DON'T FORGET: end of class definition has a semicolon!

// Driver program to test class Fraction
int main(){
   //instantiate and display objects of class Fraction           
   Fraction f1; 
   f1.print();   
   cout<<endl;

   Fraction f2; 
   f2.print();   
   cout<<endl;
   
   Fraction f3; 
   f3.print();   
   cout<<endl;
   
   return 0;
}

/*
0/1
0/1
0/1

*/

