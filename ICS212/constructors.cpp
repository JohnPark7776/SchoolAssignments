/*
  Example of overloading constructors and copy constructor
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
    Static data members have to be initialized when declared.
    Static data memebers are usually declared const (constant), 
    because the values should not be changed (Principle of Least Privilege)
  */
  static const int ZERO = 0; 
  static const int ONE = 1;
  
  //Constructor initializes each data member
  Fraction(){      
    //reusing the set function 
    set(ZERO, ONE); 
    //shows which constructor is being called
    cout<<"constructor #0"<<endl;  
  }
  
  //Constructor initializes only the numerator
  Fraction(int num){       
    //reusing the set function 
    set(num, ONE);  
    //shows which constructor is being called
    cout<<"constructor #1"<<endl; 
  }
  
  //Constructor initializes the numerator & denominator
  Fraction(int num, int den){       
    //reusing the set function 
    set(num, den); 
    //shows which constructor is being    
    cout<<"constructor #2"<<endl;           
  }   
  
  //copy constructor - makes a copy of a fraction
  Fraction(const Fraction &fraction){         
    set(fraction.numerator, fraction.denominator);
    //shows which constructor is being called
    cout<<"copy constructor"<<endl;      
  }  
  
  //a function to demonstrate the constructors
  void functionX(Fraction fraction8){ /*copy constructor*/                    
    Fraction fraction9; /*constructor #0*/
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
  //instantiating objects with three overloaded constructors
  Fraction fraction1; /*constructor #0*/
  Fraction fraction2(2); /*constructor #1*/
  Fraction fraction3(3,4); /*constructor #2*/     	
  /*
    constructor #0
    constructor #1
    constructor #2
    constructor #0
    constructor #0
  */
  Fraction fraction[5] = {Fraction(), Fraction(6), Fraction(7,8)};   
  /*
  constructor #0    
  constructor #1  
  constructor #2       
  constructor #0
  constructor #0    
  */
  
  //instantiating objects with copy constructor     
  Fraction fraction6(fraction1);  /*copy constructor*/    
  Fraction fraction7=fraction1;   /*copy constructor*/
  fraction1.functionX(fraction2); /*copy constructor*/
  
  return 0;
}

/*
  constructor #0
  constructor #1
  constructor #2
  constructor #0
  constructor #1
  constructor #2
  constructor #0
  constructor #0
  copy constructor
  copy constructor
  copy constructor
  constructor #0
*/


