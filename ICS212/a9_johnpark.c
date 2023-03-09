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

/*
    Struct to keep track score
*/
struct Score {
    int uScore;
    int cScore;
    int ties;
} score1;

//Function prototypes
int userChoiceConverter(char);
int randomGenerator(void);
char result(int, int);


int main(void) {
    //declare variables
    int computerChoice = 4;
    int userChoice = 4;
    char userChoice2 = 'b';

    //welcome statement
    printf("\nHello! You will play rock-paper-scissors with a Computer.\n Please input either r, p, or s\n");
    //gets choice from user
    userChoice2 = getchar();
    
    while (EOF != userChoice2) {
        userChoice = userChoiceConverter(userChoice2);

        //Skips this when user inputs wrong letter
        if (userChoice != 5) {
            //gets random int between 0 - 2
            computerChoice = randomGenerator();

            
            switch(result(userChoice, computerChoice)) {
                case 't':
                    score1.ties += 1;
                    break;
                case 'c':
                    score1.cScore += 1;
                    break;
                case 'u':
                    score1.uScore += 1;
                    break;
            }
        }

        printf("Please input either r, p, or s. Press CTRL-D or CTRL-Z to end the game.\n");
        getchar();
        userChoice2 = getchar();

    } //closes while(EOF)
    
    printf("\nUser Wins\tComputer Wins\t Ties\n");
    printf("%i\t\t%i\t\t %i\n\n", score1.uScore, score1.cScore, score1.ties);
    printf("Thanks for playing!\n\n");
    return 0;

} //closes main

/*
    Gets char from user and change to int.
    @param char from userChoice2
    @return int for userchoice or error
*/
int userChoiceConverter(char uC2) {
     //turns choice into an int
    switch (uC2) {
        case 'r':
            printf("You have entered %c for rock\n", uC2);
            return 0;
            break;
        case 'p':
            printf("You have entered %c for paper\n", uC2);
            return 1;
            break;
        case 's':
            printf("You have entered %c for scissors\n", uC2);
            return 2;
            break;
        default:
            printf("Error! Please input only r, p, or s\n\n");
            return 5;
            break;
    } //closes switch(uC2)
} //closes userChoiceConverter()

/*
    Randomly generates int between 0-2
    @return int for computer choice
*/
int randomGenerator(void) {
    //Creates seed for random
    srand(time(NULL));
    //declare variables
    int ranGen = rand() % 3;

    //Computer choice to r, p, or s
    switch (ranGen) {
        case 0: 
            printf("Computer has thrown rock\n");
            return 0;
            break;
        case 1:
            printf("Computer has thrown paper\n");
            return 1;
            break;
        case 2:
            printf("Computer has thrown scissors\n");
            return 2;
            break;
    } //closes switch(computerChoice)
} //closes randomGenerator()
/*
    Prints result from battle between user and computer.
    Sends result to struct Score to keep score
    @param int userChoice 
    @param int computerchoice
    @return char t, c, or u to keep score
*/
char result(int userChoice, int computerChoice) {
    //prints the result of the game
    if (userChoice == computerChoice) {
        printf("You guys tied!\n\n");
        return 't';
    } else {
        switch (userChoice) {
            //user = rock
            case 0:
                if (computerChoice == 1) {
                    printf("You lost!\n\n");
                    return 'c';
                } else {
                    printf("You won!\n\n");
                    return 'u';
                }
                break;
            //user = paper
            case 1:
                if (computerChoice == 2) {
                    printf("You lost!\n\n");
                    return 'c';
                } else {
                    printf("You won!\n\n");
                    return 'u';
                }
                break;
            //user = scissors
            case 2:
                if (computerChoice == 0) {
                    printf("You lost!\n\n");
                    return 'c';
                } else {
                    printf("You won!\n\n");
                    return 'u';
                }
                break;
        } //closes switch(userChoice) result

    } //closes if/else statement

} //closes result()
