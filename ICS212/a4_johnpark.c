/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/* 
    Gets 2 letters and numbers
    from user
*/


#include <stdio.h> /*library with getchar() and printf() functions*/
#include "getdouble.h" //gets getdouble() to use

int main(void) {
    //declare variables to get two letters
    char letters1 = 'A';
    char letters2 = 'B';
    //declare variables to get two numbers
    double numbers1 = 0.0;
    double numbers2 = 0.0;

    //asks user for input
    printf("Please enter 2 letters: ");
    letters1 = getchar();
    getchar();
    letters2 = getchar();


    /* %c outputs ASCII character format */
    printf("The letters you inputted is: '%c' and '%c'\n", letters1, letters2);

    //asks user for input
    printf("Please enter 2 numbers: ");
    getchar();
    numbers1 = getdouble();
    numbers2 = getdouble();

    // %f outputs float format
    printf("The numbers you inputted is: '%f' and '%f'\n", numbers1, numbers2);

    return 0;
}
