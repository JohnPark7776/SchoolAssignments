/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Call-by Reference
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/

//constant variables
#define SIZE 5

//function prototypes
int addThree(int);
void printFifth(int[], int[]);
void printAll(int[], int[]);
void printHex(int[]);

int main(void) {
    //declare variables Part 1
    int firstTime = 3;

    printf("\nVariable before function call: %i\n", firstTime);
    firstTime = addThree(firstTime);
    printf("Variable after function call: %i\n\n", firstTime);
    //end Part 1


    //declare variables Part 2, 3, 4

    //Part 2
    int intArr[SIZE] = {3, 21, 49, 77, 99};
    int *intPoint = NULL;
    intPoint = intArr;

    printFifth(intArr, intPoint);
    //end Part 2

    //Part 3
    printAll(intArr, intPoint);
    //end Part 3

    //Part 4
    printHex(intArr);
    //end Part 4


    return 0;
} //closes main

int addThree(int f) {
    //declare variable
    int result = f + 3;

    printf("Making a call-by-reference function call...\n");
    printf("Variable during function call: %i\n", f);
    printf("Adding 3 now...\n");
    f = result;
    printf("Variable during function call: %i\n", f);
    


    return f;
} //closes addThree

void printFifth(int a[], int p[]) {

    printf("Array[4]: %i\n", a[4]);

    printf("*Array + 4: %i\n", *(a + 4));

    printf("Pointer[4]: %i\n", p[4]);

    printf("*Pointer + 4: %i\n\n", *(p + 4));

} //closes printFifth()

void printAll(int a[], int p[]) {
    int i = 0;

    for (i = 0; i < SIZE; i++) {
        if (i == 0) {
            printf("Array: %i ", a[i]);
        } else {
            printf("%i ", a[i]);
        }
    }
    for (i = 0; i < SIZE; i++) {
        if (i == 0) {
            printf("\n*Array: %i ", *(a + i));
        } else {
            printf("%i ", *(a + i));
        }
        
    }
    for (i = 0; i < SIZE; i++) {
        if (i == 0) {
            printf("\nPointer: %i ", p[i]);
        } else {
            printf("%i ", p[i]);
        }
        
    }
    for (i = 0; i < SIZE; i++) {
        if (i == 0) {
            printf("\n*Pointer: %i ", *(p + i));
        } else {
            printf("%i ", *(p + i));
        }
        
        if (i == SIZE - 1) {
            printf("\n");
        }
    }
} //closes printAll()

void printHex(int a[]) {
    int i = 0;

    for (i = 0; i < SIZE; i++) {
        printf("\n&intArray = %p", &a[i]);
        if (i == SIZE - 1) {
            printf("\n\n");
        }
    }
} //closes printHex()
