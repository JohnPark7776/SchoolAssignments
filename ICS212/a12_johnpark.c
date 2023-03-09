/*
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Pointer Basics
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/

/*
    Struct to store char, int, and double
*/
struct storeVariables {
    char cVar;
    int iVar;
    double dVar;
} sVar;
/*
    Struct to store pointers
*/
struct storePointers {
    char *cPoint;
    int *iPoint;
    double *dPoint;
} sPoint;
/*
    Struct to store dereferenced Pointer
*/
struct derefOutput {
    char cOutput;
    int iOutput;
    double dOutput;
} derefOutput1;
/*
    Struct to store final variable
*/
struct finalVar {
    char finalChar;
    int finalInt;
    double finalDouble;
} fVar;

//declare function prototypes
void welcomeStatement();
void collector();
void derefPointer();
void addThree();
int printResults(int);

int main(void) {
    //declare variable
    int sequence = 2; //dictates which portion to print results

    //function calls
    welcomeStatement();
    collector();
    derefPointer();
    sequence = printResults(sequence);
    addThree();
    sequence = printResults(sequence);


    return sequence;


} //closes main

/*
    Welcome statement and instructions
*/
void welcomeStatement() {
    //Welcome statement
    printf("Hello. We will display 3 pointer values and what it represents.\n");
    printf("We will then add 3 and then display the new variable.\n\n");
} //closes welcomeStatement()

/*
    Collects info from user
*/
void collector() {
    //initialize
    sVar.cVar = 'I';
    sVar.iVar = 3;
    sVar.dVar = 5.4;

    //saves pointer information
    sPoint.cPoint = &sVar.cVar;
    sPoint.iPoint = &sVar.iVar;
    sPoint.dPoint = &sVar.dVar;

} //closes collector()

/*
    Saves the dereferenced Pointer info
*/
void derefPointer() {
    derefOutput1.cOutput = *sPoint.cPoint;
    derefOutput1.iOutput = *sPoint.iPoint;
    derefOutput1.dOutput = *sPoint.dPoint;
} //closes derefPointer()

/*
    Adds 3 to dereferenced and saves new variable
*/
void addThree() {
    derefOutput1.cOutput += 3;
    derefOutput1.iOutput += 3;
    derefOutput1.dOutput += 3;

    fVar.finalChar = derefOutput1.cOutput;
    fVar.finalInt = derefOutput1.iOutput;
    fVar.finalDouble = derefOutput1.dOutput;
} //closes addThree()

/*
    Prints results based on int s
    @param int, s = sequence from main
    @return int
*/
int printResults(int s) {
    if (s == 2) {
        printf("Pointer 1: %p\n", sPoint.cPoint);
        printf("Pointer 2: %p\n", sPoint.iPoint);
        printf("Pointer 3: %p\n", sPoint.dPoint);

        printf("Dereference 1: %c\n", derefOutput1.cOutput);
        printf("Dereference 2: %i\n", derefOutput1.iOutput);
        printf("Dereference 3: %.2f\n\n", derefOutput1.dOutput);
        return 1;
    } else {
        printf("Adding 3 to the 3 dereferenced pointers.\n\n");
        printf("Dereference 1: %c\n", derefOutput1.cOutput);
        printf("Dereference 2: %i\n", derefOutput1.iOutput);
        printf("Dereference 3: %.2f\n", derefOutput1.dOutput);

        printf("New Char: %c\n", fVar.finalChar);
        printf("New Int: %i\n", fVar.finalInt);
        printf("New double: %.2f\n", fVar.finalDouble);
        return 0;
    }

} //closes printResults()
