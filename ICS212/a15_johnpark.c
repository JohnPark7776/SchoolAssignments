/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Morse Code translator
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <string.h> /*str functions*/


#define SIZE 37

char *morse[SIZE] = {
    "-----",
    ".----",
    "..---",
    "...--",
    "....-",
    ".....",
    "-....",
    "--...",
    "---..",
    "----.",
    ".-",
    "-...",
    "-.-.",
    "-..",
    ".",
    "..-.",
    "--.",
    "....",
    "..",
    ".---",
    "-.-",
    ".-..",
    "--",
    "-.",
    "---",
    ".--.",
    "--.-",
    ".-.",
    "...",
    "-",
    "..-",
    "...-",
    ".--",
    "-..-",
    "-.--",
    "--..",
};

int main(int argc, char *argv[]) {
    //declare variables
    int i = 1; //Goes through argv
    int j = 0; //Goes through morse
    int numbers = 48; //For printing numbers with ASCII value
    int letters = 97; //For printing letters with ASCII value

    /* Verifies for commmand line argument*/
    if (argc >= 2) {
        //Loops until it hits NULL in the pointer array
        while (argv[i] != NULL) {
            //Verfies correct morse code input
            int result = 100;

            //Runs through the morse array and checks for error
            for (j = 0; j < SIZE; j++) {
                
                if (strcmp(argv[i], morse[j]) == 0) {
                    /* When the argument matches a morse code
                    * the result changes to the value of j
                    * to able to choose the correct ASCII value
                    */
                    result = j;
                    break;
                } else if (j == SIZE - 2 && result == 100) {
                    printf("\nError! Incorrect Morse code.\n");
                    return 0;
                }
            } //closes for loop

            //Prints numerical morse code
            if (result < 10) {
                printf("%c", numbers + result);
            }
            //Prints letter morse code
            if (result >= 10) {
                printf("%c", (letters + (result - 10)));
            }
            i++;
        }
        
    } else {
        printf("Error! Please input morse code along with program name.\n");   
    }
    printf("\n");
    return 0;
} //closes class
