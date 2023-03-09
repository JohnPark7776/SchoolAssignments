/*
Example of accessor, mutator, and utility functions in C++ 
Class Fraction stores the numerator and denominator for Fraction objects
*/
#include <iostream>
//has the abs() function - returns the absolute value
#include <cmath> 
using namespace std;

//Fraction class definition (abstract data type (ADT))
class Fraction{ 
   
/*
functions and variables in the public section 
are accessible anywhere in the class definition
*/
public:
   /*
   static data members (have to be initialized when declared)
   constant, because values should not be changed (Principle of Least Privilege)
   */
   static const int ZERO = 0; 
   static const int ONE = 1;
   
   //Constructor initializes each data member
   Fraction(){       
      numerator = ZERO;      
      denominator = ONE;   
   }

   //mutator function - set Fraction values and error checking    
   void set(int num, int den){      
      //prevent division by zero                                                                                
      if(ZERO == den){ 
         den = ONE;
      }
      //change the values of numerator & denominator
      numerator = num; 
      denominator = den;
      /*
      if denominator is negative, 
      set it to positive and set numerator to negative
      */
      if(denominator < ZERO) {
         denominator = -denominator; 
         numerator = -numerator;
      }
      //reduce Fraction to lowest terms
      reduce();
   }

  //mutator function to set the numerator only
   void setNumerator(int num){
      numerator = num;
   }
   
   //mutator function to set the denominator only
   void setDenominator(int den){
      //re-use code!
      set(numerator, den);
   }
   
   //accessor function to get the numerator    
   int getNumerator() const{
      /*
      const function (Principle of Least Privilege), 
      so cannot change data members by mistake
      */
      //numerator = ZERO;
      return numerator;
   }
      
   //accessor function to get the denominator
   int getDenominator() const{
      return denominator;
   }               

   /*
   display the data members (numerator and denominator) of a Fraction   
   const is used because these values should not be changed by a display function
   */
   void print() const{      
      cout << numerator << "/" << denominator;   
      /*
      const function (Principle of Least Privilege), 
      so cannot change data members by mistake
      */
      //denominator = ONE;
   }
/*
Variables and functions in the private section
are accessible only to member functions.
This is an example of data hiding and Principle of Least Privilege.
*/
private:      
   //data members (which can only be initialized in the constructor)
   int numerator;          
   int denominator;    
   
   /*
   Finds GCD (greatest common divisor) using Euclid's algorithm
   And reduces Fraction to lowest terms 
   */
   void reduce(){      
      int a = numerator;      
      int b = denominator;      
      while (b != ZERO){         
         int temp = a % b;         
         a = b;         
         b = temp;      
      }      
      /*
      a is the greatest common divisor
      the abs() function - returns the absolute value
      */
      numerator = numerator / abs(a);      
      denominator = denominator / abs(a);   
   }

};//DON'T FORGET: end of class definition has a semicolon!

// Driver program to test class Fraction
int main(){
   //set the data & display       
   Fraction f1; 
   cout<<"Fraction f1 is ";
   f1.print();  
   cout<<endl;
   f1.set(51, 100);
   cout<<"Fraction f1 is ";
   f1.print();   
   cout<<endl;

   //see if error checking works
   f1.set(51, -100);
   cout<<"Fraction f1 is ";
   f1.print();   
   cout<<endl;
   f1.set(51, 0);
   cout<<"Fraction f1 is ";
   f1.print();   
   cout<<endl;
  
   //set & get the data
   Fraction f2;
   f2.setNumerator(51);
   f2.setDenominator(100);
   cout<<"Fraction f2's numerator is: "<<f2.getNumerator()<<endl;
   cout<<"Fraction f2's denominator is: "<<f2.getDenominator()<<endl;

   //test the utility function reduce()
   Fraction f3;
   f3.set(50, -100);
   cout<<"Fraction f3 is ";
   f3.print();   
   cout<<endl;
   
   //can access static data members using "ClassName::dataMember" or "object.dataMember"
   cout<<"ZERO is "<<Fraction::ZERO<<endl;
   cout<<"ONE is "<<f3.ONE<<endl;
   
   /*
   but we cannot access regular data members this way, 
   because they are private (information hiding)
   */
   //cout<<"Fraction f2's denominator is: "<<f2.denominator<<endl;   
   
   return 0;
}

/*
Fraction f1 is 0/1
Fraction f1 is 51/100
Fraction f1 is -51/100
Fraction f1 is 51/1
Fraction f2's numerator is: 51
Fraction f2's denominator is: 100
Fraction f3 is -1/2
ZERO is 0
ONE is 1
*/


