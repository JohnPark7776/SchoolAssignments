// Assignment #24 starter code
// by Lisa Miller, from William Albritton
// ICS 212

#include <iostream>
#include <cmath>

using namespace std;
/***** CHANGE WHEN ADDING CLASSES **/
#define SIZE 7
#define PI 3.14

// Abstract base class
class Shape
{
public:
    virtual void printSize() const = 0;
    virtual const char *name() const = 0;
    virtual void inputData() = 0;
    virtual double area() const = 0;
    virtual double volume() const
    {
        return 0.0;
    }
};

// derived class Circle, subclass of Shape
class Circle : public Shape
{
public:
    // syntax "datatype variable = value"  will give a default value for the variable
    //  this constructor will be called with no arguments or one argument
    //  for example: shapeArray[0] = new Circle();
    //  for example:  Circle c = new  Circle(10);
    Circle(double r = 0.0)
    {
        if (r < 0)
            r = -r;
        radius = r;
    }
    const char *name() const
    {
        return "Circle";
    }
    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
    }
    void inputData()
    {
        cout << "Enter the " << name() << "'s radius: ";
        cin >> radius;
    }
    double area() const
    {
        return PI * radius * radius;
    }

protected:
    double radius;
};

// derived class Sphere, subclass of Circle
class Sphere : public Circle
{
public:
    Sphere(double r = 0.0) : Circle(r)
    {
    }

    const char *name() const
    {
        return "Sphere";
    }

    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
        cout << "The " << name() << "'s volume = " << volume() << endl;
    }

    double area() const
    {
        return 4 * PI * (radius * radius);
    }

    double volume() const
    {
        return (4 * PI * radius * radius * radius) / 3;
    }
};

//derived class Cylinder, subclass Circle
class Cylinder : public Circle
{
public:
    Cylinder(double r = 0, double h = 0) : Circle(r)
    {
        if (h < 0)
            h = -h;
        height = h;
    }

    const char *name() const
    {
        return "Cylinder";
    }

    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
        cout << "The " << name() << "'s volume = " << volume() << endl;
    }

    void inputData()
    {
        cout << "Enter the " << name() << "'s radius: ";
        cin >> radius;
        cout << "Enter the " << name() << "'s height: ";
        cin >> height;
    }

    double area() const
    {
        return (2 * PI * radius) * (radius + height);
    }

    double volume() const
    {
        return PI * (radius * radius) * height;
    }

protected:
    double height;
};

//derived class Square, subclass Shape
class Square : public Shape
{
public:
    Square(double s = 0)
    {
        if (s < 0)
            s = -s;
        side = s;
    }

    const char *name() const
    {
        return "Square";
    }

    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
    }

    void inputData()
    {
        cout << "Enter the " << name() << "'s side: ";
        cin >> side;
    }

    double area() const
    {
        return side * side;
    }

protected:
    double side;
};

// derived class Cube, subclass Square
class Cube : public Square
{
public:
    Cube(double s = 0) : Square(s)
    {
    }

    const char *name() const
    {
        return "Cube";
    }

    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
        cout << "The " << name() << "'s volume = " << volume() << endl;
    }

    double area() const
    {
        return 6 * (side * side);
    }

    double volume() const
    {
        return side * side * side;
    }
};

//derived class Triangle, subclass Square
class Triangle : public Square
{
public:
    Triangle(double s = 0) : Square(s)
    {
    }

    const char *name() const
    {
        return "Triangle";
    }

    double area() const
    {
        return side * side * (sqrt(3) / 4);
    }
};

// derived class Tetrahedron, subclass Triangle
class Tetrahedron : public Triangle
{
public:
    Tetrahedron(double s = 0) : Triangle(s)
    {
    }

    const char *name() const
    {
        return "Tetrahedron";
    }

    void printSize() const
    {
        cout << "The " << name() << "'s area = " << area() << endl;
        cout << "The " << name() << "'s volume = " << volume() << endl;
    }

    double area() const
    {
        return sqrt(3) * side * side;
    }

    double volume() const
    {
        return side * side * side * (sqrt(2) / 12);
    }
};

int displayMenu(Shape *s[]);

int main()
{

    Shape *shapeArray[SIZE];
    shapeArray[0] = new Circle();
    shapeArray[1] = new Sphere();
    shapeArray[2] = new Cylinder();
    shapeArray[3] = new Square();
    shapeArray[4] = new Cube();
    shapeArray[5] = new Triangle();
    shapeArray[6] = new Tetrahedron();

    int choice = displayMenu(shapeArray);
    while (choice >= 0 && choice <= 6)
    {
        shapeArray[choice]->inputData();
        shapeArray[choice]->printSize();
        cout << endl;
        choice = displayMenu(shapeArray);
    }
    return 0;
}

// displays menu of choices from array of Shapes
int displayMenu(Shape *s[])
{
    int choice = 0;
    cout << "Select an object from the menu (enter 7 to quit)." << endl;
    for (int i = 0; i < SIZE; i++)
    {
        cout << '\t' << i << ". " << s[i]->name() << endl;
    }
    cin >> choice;
    return choice;
}
