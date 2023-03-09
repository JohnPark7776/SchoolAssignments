/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Bitwisdom
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <stdlib.h>
#include <string.h> /*str functions*/
#include <ctype.h>
#include "printbits.h"

//function prototypes
int twoComplement(unsigned int);
unsigned int charPacker(unsigned char, unsigned char, unsigned char, unsigned char);
void intChopper(unsigned int, unsigned char, unsigned char, unsigned char, unsigned char);
unsigned int circleLeft(unsigned int, unsigned int);

void printbin(unsigned char);

int main(int argc, char *argv[]) {
    //Checks for 6 inputs
    if(argc == 7) {
        int i = 1;
        while (argv[i] != NULL) {
            //checks the first 4 to make sure it's one character and not a integer
            if (i >= 1 && i <= 4) {
                if (strlen(argv[i]) > 1) {
                    printf("Error! Please input only a single character for position #%i\n", i);
                    return 0;
                } else if (!isalpha(*argv[i])) {
                     printf("Error! Please input a character for position #%i\n", i);
                     return 0;
                } 
            }
            //checks the last 2 to make sure it's an integer
            if (i > 4 && i <= 6) {
                if (!isdigit(*argv[i])) {
                    printf("Error! Please input only an integer for position %i\n", i);
                    return 0;
                } 
            }
            i++; 
        }
        //If passes all error check, goes through these functions.
        if (i == 7) {
            twoComplement(atoi(argv[5]));
            charPacker(*argv[1], *argv[2], *argv[3], *argv[4]);
            intChopper(atoi(argv[5]), *argv[1], *argv[2], *argv[3], *argv[4]);
            circleLeft(atoi(argv[5]), atoi(argv[6]));
        }
    } else {
        printf("Error! Please enterr program name followed by FOUR characters and then TWO integers on the commandline\n");
        return 0;
    }
    return 0;
}
int twoComplement(unsigned int firstInt) {
    
    printf("Function 1:\n");
    printf("Input is unsigned integer:\n");
    printbits(firstInt);
    printf("Output is the complement of the integer:\n");
    firstInt = ~firstInt;
    printbits(firstInt);

}

unsigned int charPacker(unsigned char one, unsigned char two, unsigned char three, unsigned char four) {
    char hold[4] = {one, two, three, four};
    int i = 0;
    printf("\nFunction 2:\n");
    printf("Input is four characters:\n");
    for (i = 0; i < 4; i++) {
        printbin(hold[i]);
        printf(" = 0x%o = '%c'\n", hold[i], hold[i]);
        
    }

    printf("Output is unsigned integer variable in bit format:\n");
    int32_t result = one;
    result <<= 8;
    result |= two;
    result <<= 8;
    result |= three;
    result <<= 8;
    result |= four;


    printbits(result);

}
void intChopper(unsigned int firstInt, unsigned char one, unsigned char two, unsigned char three, unsigned char four) {
    char hold[4] = {one, two, three, four};
    int i = 0;

    printf("\nFunction 3:\n");
    printf("Input is unsigned integer:\n");
    printbits(firstInt);
    printf("Output is four characters:\n");
    hold[0] = (firstInt >> 24) & 0xff;
    hold[1] = (firstInt >> 16) & 0xff;
    hold[2] = (firstInt >> 8) & 0xff;
    hold[3] = firstInt & 0xff;
    for (i = 0; i < 4; i++) {
        printbin(hold[i]);
        printf(" = 0x%.2o = '%lc'\n", hold[i], hold[i]);
    }

    
}
unsigned int circleLeft(unsigned int firstInt, unsigned int secondInt) {

    printf("\nFunction 4:\n");
    printf("Input is unsigned integer:\n");
    printbits(secondInt);
    printf("Rotated %i bit(s) to the left.\n", firstInt);
    printf("Output is unsigned integer:\n");
    int result = (secondInt << firstInt) | (secondInt >> (32 - firstInt));
    printbits(result);
}
void printbin(unsigned char value)
{
    for (int i = sizeof(char) * 7; i >= 0; i--)
        printf("%d", (value & (1 << i)) >> i );

}
