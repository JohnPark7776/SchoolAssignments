/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Rock-Paper-Scissors game
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <stdlib.h> /*random number generator functions*/
#include <time.h> /*Time function*/

int main(void) {
    //declare variables
    int computerChoice = 4;
    int userChoice = 4;
    char userChoice2 = 'b';
    //Creates seed for random
    srand(time(NULL));

    //welcome statement
    printf("\nHello! You will play rock-paper-scissors with a Computer. Please input either r, p, or s\n");
    //gets choice from user
    userChoice2 = getchar();
    
    //turns choice into an int
    switch (userChoice2) {
        case 'r':
            userChoice = 0;
            printf("You have entered %c for rock\n", userChoice2);
            break;
        case 'p':
            userChoice = 1;
            printf("You have entered %c for paper\n", userChoice2);
            break;
        case 's':
            userChoice = 2;
            printf("You have entered %c for scissors\n", userChoice2);
            break;
        default:
            printf("Error! Please input only r, p, or s\n");
            return 0;
            break;
    } //closes switch(userChoice)

    //gets random int between 0 - 2
    computerChoice = rand() % 2;

    //Computer choice to r, p, or s
    switch (computerChoice) {
        case 0: 
            printf("Computer has thrown rock\n");
            break;
        case 1:
            printf("Computer has thrown paper\n");
            break;
        case 2:
            printf("Computer has thrown scissors\n");
            break;
    } //closes switch(computerChoice)

    //prints the result of the game
    if (userChoice == computerChoice) {
        printf("You guys tied!\n\n");
    } else {
        switch (userChoice) {
            //user = rock
            case 0:
                if (computerChoice == 1) {
                    printf("You lost!\n\n");
                } else {
                    printf("You won!\n\n");
                }
                break;
            //user = paper
            case 1:
                if (computerChoice == 2) {
                    printf("You lost!\n\n");
                } else {
                    printf("You won!\n\n");
                }
                break;
            //user = scissors
            case 2:
                if (computerChoice == 0) {
                    printf("You lost!\n\n");
                } else {
                    printf("You won!\n\n");
                }
                break;
        } //closes switch(userChoice) result

    } //closes if/else statement

    printf("Thanks for playing!\n\n");
    return 0;

} //closes main
