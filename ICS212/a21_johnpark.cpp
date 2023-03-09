/*
Assignment 21 
Create Complex class
*/
#include <iostream>
using namespace std;

class Complex {
    private:
        double real;
        double imaginary;

    public:
        //Constructor with 2 variables
        Complex(double r, double i) {
            set(r, i);
        }
        //Copy Constructor
        Complex(const Complex &complex) {
            set(complex.real, complex.imaginary);
        }

        void print() const{
            cout << "(" << real << " + " << imaginary << "i" << ")";
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

        
        //Destructor
        ~Complex() {

        }
}; //closes Complex class
Complex add(const Complex original, const Complex copy) {

    double realTemp = original.getReal() + copy.getReal(); //(a+c)
    double imaginaryTemp = original.getImaginary() + copy.getImaginary(); //(b+d)

    original.print();
    cout << " + ";
    copy.print();
    cout << " = ";
    cout << "(" << realTemp << " + " << imaginaryTemp << "i" << ")" << endl;

    return Complex(realTemp, imaginaryTemp);
}
Complex subtract(const Complex original, const Complex copy) {

    double realTemp = original.getReal() - copy.getReal(); //(a-c)
    double imaginaryTemp = original.getImaginary() - copy.getImaginary(); //(b-d)

    original.print();
    cout << " - ";
    copy.print();
    cout << " = ";
    cout << "(" << realTemp << " + " << imaginaryTemp << "i" << ")" << endl;

    return Complex(realTemp, imaginaryTemp);
}
Complex multiply(const Complex original, const Complex copy) {

    double realTemp = (original.getReal() * copy.getReal()) - (original.getImaginary() * copy.getImaginary()); //(a*c - b*d)
    double imaginaryTemp = (original.getImaginary() * copy.getReal()) + (original.getReal() * copy.getImaginary()); //(b*c + a*d)

    original.print();
    cout << " * ";
    copy.print();
    cout << " = ";
    cout << "(" << realTemp << " + " << imaginaryTemp << "i" << ")" << endl;

    return Complex(realTemp, imaginaryTemp);
}
Complex divide(const Complex original, const Complex copy) {

    //Real and Imaginary number share divisor when dividing
    double divisor = ((copy.getReal() * copy.getReal()) + (copy.getImaginary() * copy.getImaginary())); //(c * c + d * d)

    double realTemp = ((original.getReal() * copy.getReal()) + (original.getImaginary() * copy.getImaginary())) / divisor; //(a*c+b*d)
    double imaginaryTemp = ((original.getImaginary() * copy.getReal()) - (original.getReal() * copy.getImaginary())) / divisor; //(b*c-a*d)
    
    original.print();
    cout << " / ";
    copy.print();
    cout << " = ";
    cout << "(" << realTemp << " + " << imaginaryTemp << "i" << ")" << endl;

    return Complex(realTemp, imaginaryTemp);
}
int main() {
    //Regular Constructor
    Complex c1(22, 4.4);
    cout<<"Test Constructor"<<endl;
    cout<<"c1 is ";
    c1.print();
    cout<<endl;
    //Copy Constructor
    Complex cc1(c1);
    cout<<"Test Copy Constructor"<<endl;
    cout<<"copy of c1 is ";
    cc1.print();
    cout<<endl<<endl;


    //Math Functions
    //Add
    cout<<"Test Add function"<<endl;
    Complex destruct = add(c1, cc1);
    cout<<"Destruct for ";
    destruct.print();

    cout<<endl<<endl;
    //Subtract
    cout<<"Test Subtract function"<<endl;
    destruct = subtract(c1, cc1);
    cout<<"Destruct for ";
    destruct.print();

    cout<<endl<<endl;
    //Multiply
    cout<<"Test Multiply function"<<endl;
    destruct = multiply(c1, cc1);
    cout<<"Destruct for ";
    destruct.print();

    cout<<endl<<endl;
    //Divide
    cout<<"Test Division Function"<<endl;
    destruct = divide(c1, cc1);
    cout<<"Destruct for ";
    destruct.print();
    cout<<endl;

    return 0;
} //closes main
