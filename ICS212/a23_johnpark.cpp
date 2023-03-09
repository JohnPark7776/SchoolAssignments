/*
Assignment 22
Inheritance
Area for Circle
Area and Volume for Cylinder
*/
#include <iostream>
using namespace std;

/*
Base class Circle
*/
class Circle
{
public:
    //Constant variables
    static constexpr double PI = 3.1415926;
    static constexpr double ZERO = 0.0;

    //Overloading: Default constructor
    Circle()
    {
        setRadius(ZERO);
    }
    //Overloading: Parameter (radius)
    Circle(double r)
    {
        setRadius(r);
    }

    //Sets Radius
    void setRadius(double r)
    {
        radius = r;
    }
    
    //Returns Radius
    double getRadius() const
    {
        return radius;
    }

    //Returns Circle Area PIr^2
    double area() const
    {
        return PI * (radius * radius);
    }

protected:
    double radius;
}; //Closes Circle class

/*
Derived class Cylinder with base class Circle
*/
class Cylinder : public Circle
{
public:

    //Overloaded default constructor
    Cylinder() : Circle(ZERO)
    {
        setHeight(ZERO);
    }

    //Constructor Cylinder
    Cylinder(double r, double h) : Circle(r)
    {
        setHeight(h);
    }

    //Sets Height
    void setHeight(double h)
    {
        height = h;
    }

    //Returns Height
    double getHeight() const
    {
        return height;
    }

    //Returns Volume for Cylinder 
    double volume() const
    {
        return PI * (radius * radius) * height;
    }

    /*
    Override Circle's Area function
    Returns Surface area for Cylinder
    */
    double area() const
    {
        return (2 * PI * radius) * (radius + height);
    }

protected:
    double height;
}; //Closes Cylinder Class.

/*
Main Class
Tests Base Class Circle
Tests Derived Class Cylinder
Tests with and without input
*/
int main()
{
    // Circle test with input
    Circle circle1(33.21);
    cout << "Circle1 radius: " << circle1.getRadius() << endl;
    cout << "Circle1 area: " << circle1.area() << endl
         << endl;

    // Circle test without input
    Circle circle2;
    cout << "Circle2 radius: " << circle2.getRadius() << endl;
    cout << "Circle2 area: " << circle2.area() << endl
         << endl;

    // Cylinder test with input
    Cylinder cylinder1(12.33, 22.44);
    cout << "Cylinder1 Height: " << cylinder1.getHeight() << endl;
    cout << "Cylinder1 Radius: " << cylinder1.getRadius() << endl;
    cout << "Cylinder1 Area: " << cylinder1.area() << endl;
    cout << "Cylinder1 Volume: " << cylinder1.volume() << endl
         << endl;

    // Cylinder test without input
    Cylinder cylinder2;
    cout << "Cylinder2 Height: " << cylinder2.getHeight() << endl;
    cout << "Cylinder2 Radius: " << cylinder2.getRadius() << endl;
    cout << "Cylinder2 Area: " << cylinder2.area() << endl;
    cout << "Cylinder2 Volume: " << cylinder2.volume() << endl
         << endl;
} //Closes main method.
