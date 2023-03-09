/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    The Joy of Recursion
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include "getdouble.h" /*getdouble() to get int from user*/

//function prototypes
void printAll(int, int);
int addAll(int, int);
int multiplyAll(int, int);
int powerFirstToLast(int, int);
int getGCD(int, int);

int main(void) {
    //declare variables

    //get 2 digits from user.
    printf("Please enter two positive integers, separated by a space, and the first smaller than the second: ");
    int first = (int)getdouble();
    int last = (int)getdouble();

    /* 
        prints result from user.
        check to make sure both are positive & first is bigger than second
    */
    if (first < 0 || last < 0) {
        printf("You have entered %i and %i\n", first, last);
        printf("ERROR: both numbers must be positive\n");
        return 0;
    } else if (first > last) {
        printf("You have entered %i and %i\n", first, last);
        printf("ERROR: %i is not smaller than %i\n", first, last);
        return 0;
    } else {
        printf("You have entered %i and %i\n", first, last);
        
        //recursive functions
        //Prints all numbers between the first and last
        printAll(first, last);
        //Prints the sum of all numbers between first and last
        printf("The sum of %i to %i = %i\n", first, last, addAll(first, last));
        //Prints the product of all numbers between first and last
        printf("The product of %i to %i = %i\n", first, last, multiplyAll(first, last));
        //Prints first^last
        printf("%i to the power of %i = %i\n", first, last, powerFirstToLast(first, last));
        //Prints the GCD(Greatest Common Divisor) of first and last
        printf("The GCD of %i and %i = %i\n\n", first, last, getGCD(first, last));
    
    } //closes if else


    return 0;
} //closes main
/*
    Prints all numbers betwee first and last
    @param int f = first from main
    @param int l = last from main
*/
void printAll(int f, int l) {
    //declare variable
    int i = 0;
    int counting = 0;
    printf("Counting from %i to %i: ", f, l);
    for (i = f; i <= l; i++) {
        //prints all numbers between first and last 
        //Adds \n after last number
        if (i == l) {
            printf("%i\n", i);
        } else {
            printf("%i ", i);
        }
    }
} //closes checkInt()
/*
    Adds all numbers between first and last from user
    @param f int = first from main
    @param l int =  last from main
    @return result int to main
*/
int addAll(int f, int l) {
    //declare variables
    int result = 0;

    if (f == l) {
        result = l;
    } else {
        result = f + addAll(f + 1, l);
    }
    return result;
} //closes addAll()
int multiplyAll(int f, int l) {
    //declare variables
    int result = 0;

    if (f == l) {
        result = l;
    } else {
        result = f * multiplyAll(f + 1, l);
    }
    return result;
} //closes multiplyAll()
int powerFirstToLast(int f, int l) {

    if (l == 0) {
        return 1;
    } else {
        return powerFirstToLast(f, l - 1) * f;
    }
} //closes powerFirstToLast()
int getGCD(int f, int l) {
    //declare variables
    if (l == 0) {
        return f;
    } else {
        return getGCD(l, f % l);
    }
} //closes getGCD()
