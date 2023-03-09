/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Counting Letters
    Gets text from user and counts how frequent a letter was used
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <ctype.h> /*Use of tolower() function*/

//constant variables
#define SIZE 26

//function prototypes
void welcome();
void letterCounter(int[]);
void outputResults(int[]);

int main(void) {
    //declare variables
    int collect[SIZE] = {0};
    
    //function calls
    welcome(); //Prints welcome and instructions
    letterCounter(collect); //Counts frequency of letter and store in array
    outputResults(collect); //Prints results

    return 0;
} //closes main

/*
    Prints welcome statement and instructions
*/
void welcome() {
    //welcome statement
    printf("Hello! Please input a text. To stop adding, press CTRL+D\n");
    printf("We will then display how frequent each letter was used in your text.\n\n");
} //closes welcome()

/*
    Counts frequency of alphabet letter and store in array collect[]
    @param int[], collect from main method
*/
void letterCounter(int c[]) {
    //declare variables
    char temp = '9';
    int aToI = 27;
    int i = 0;

    //checks each character and counts how many times that letter was used
    while ((temp = tolower(getchar())) != EOF) {
        for (i = 0; i < SIZE; i++) {
            aToI = temp - 'a'; //Converts letter to an int for array index

            //Make sure the range is between 0 - 25
            if (aToI <= 25) {
                c[aToI]++;
                break;
            } 
        } //closes for loop
    } //closes while

} //closes letterCounter()

/*
    Prints display to show how frequent an alphabet letter was used
    @param int[], collect from main method
*/
void outputResults(int c[]) {
    //declare variables
    char alphabets[SIZE] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int i = 0;

    printf("\n"); //Adds a space between user input and result

    //Prints every letter and the amount of time it was used
    for (i = 0; i < SIZE; i++) {
        printf("Letter\t\tCount\n");
        printf("  %c\t\t %i\n", alphabets[i], c[i]);
        
    }

} //closes outputResults()
