`//function overloading example
#include <iostream>
using namespace std;
int square(int);
double square(double);
int main(){                                 
  cout<<"square = "<<square(3)<<endl; //square = 9
  cout<<"square = "<<square(3.3)<<endl; //square = 10.89
  return 0;
}
int square(int a){return a*a;}
double square(double a){return a*a;}



