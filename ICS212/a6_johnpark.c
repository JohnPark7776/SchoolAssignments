/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Gets a single number from user
    Outputs number in different language(not English)
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/

int main(void) {
    //declare variables
    char userInput = 'a';
    //Welcome statement
    printf("Hello! Please input a single number from 0-9 and will ");
    printf("tell you how to say it in Korean!\n");
    
    printf("Please input a single number now. (0-9)\n");

    userInput = getchar();

    switch (userInput) {
        case '0':
            puts("You have entered 0\n");
            puts("0 in Korean is 'gong'\n");
            break;
        case '1':
            puts("You have entered 1\n");
            puts("1 in Korean is 'il'\n");
            break;
        case '2':
            puts("You have entered 2\n");
            puts("2 in Korean is 'i'\n");
            break;
        case '3':
            puts("You have entered 3\n");
            puts("3 in Korean is 'sam'\n");
            break;
        case '4':
            puts("You have entered 4\n");
            puts("4 in Korean is 'suh'\n");
            break;
        case '5':
            puts("You have entered 5\n");
            puts("5 in Korean is 'oh'\n");
            break;
        case '6':
            puts("You have entered 6\n");
            puts("6 in Korean is 'yook'\n");
            break;
        case '7':
            puts("You have entered 7\n");
            puts("7 in Korean is 'chil'\n");
            break;
        case '8':
            puts("You have entered 8\n");
            puts("8 in Korean is 'pal'\n");
            break;
        case '9':
            puts("You have entered 9\n");
            puts("9 in Korean is 'gook'\n");
            break;
        default:
            puts("Error! Please enter number between 0-9");
            break;
    }
    return 0;
}