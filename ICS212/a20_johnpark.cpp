/*
Assignment 20 
Create Complex class
*/
#include <iostream>
using namespace std;

class Complex {
    public:

    Complex() {
        real = 0;
        imaginary = 0;
    }

    void print() const{
        cout << real << " + " << imaginary << "i";
    }
    void set(double r, double i) {
        real = r;
        imaginary = i;
    }
    double getReal() const{
        return real;
    }
    double getImaginary() const{
        return imaginary;
    }

private:
    double real;
    double imaginary;
}; //closes Complex class

int main() {
    Complex c1;
    cout<<"c1 is ";
    c1.print();
    cout<<endl;

    Complex c2;
    cout<<"c2 is "; 
    c2.print();
    cout<<endl;
    
    Complex c3;
    cout<<"c3 is "; 
    c3.print();
    cout<<endl;

    cout<<endl;

    c1.set(3, 22);
    cout<<"c1 is now ";
    c1.print();
    cout<<endl;

    c2.set(-2, 99);
    cout<<"c2 is now ";
    c2.print();
    cout<<endl;

    c3.set(44, 39);
    cout<<"c3 is now ";
    c3.print();
    cout<<endl;

    cout<<endl;

    cout<<"c1 real is " << c1.getReal() << endl;
    cout<<"c1 imaginary is " << c1.getImaginary() << endl;

    cout<<endl;

    cout<<"c2 real is " << c2.getReal() << endl;
    cout<<"c2 imaginary is " << c2.getImaginary() << endl;

    cout<<endl; 

    cout<<"c3 real is " << c3.getReal() << endl;
    cout<<"c3 imaginary is " << c3.getImaginary() << endl;
}