/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Prints number from 1-9999 in Korean.
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/

int main(void) {
    //declare global variables
    char one[] = "il";
    char two[] = "i";
    char three[] = "sam";
    char four[] = "sa";
    char five[] = "oh";
    char six[] = "yook";
    char seven[] = "chil";
    char eight[] = "pal";
    char nine[] = "gu";
    char ten[] = "sib";
    char hundred[] = "baek";
    char thousand[] = "chun";

    
    int i = 0;
    //for loop to print numbers 1-9999 in Korean
    for(i = 1; i < 10000; i++) {
        //declare variables
        int onePlace = i % 10;
        int tenPlace = (i / 10) % 10;
        int hunPlace = (i / 100) % 10;
        int thouPlace = i / 1000;

        printf("%i = ", i);
        // >1000
        switch (thouPlace) {
            case 1:
                printf("%s ", thousand);
                break;
            case 2:
                printf("%s %s ", two, thousand);
                break;
            case 3:
                printf("%s %s ", three, thousand);
                break;
            case 4:
                printf("%s %s ", four, thousand);
                break;
            case 5:
                printf("%s %s ", five, thousand);
                break;
            case 6:
                printf("%s %s ", six, thousand);
                break;
            case 7:
                printf("%s %s ", seven, thousand);
                break;
            case 8:
                printf("%s %s ", eight, thousand);
                break;
            case 9:
                printf("%s %s ", nine, thousand);
                break;
            default:
                break;
        } //closes thousands
        switch (hunPlace) {
            case 1:
                printf("%s ", hundred);
                break;
            case 2:
                printf("%s %s ", two, hundred);
                break;
            case 3:
                printf("%s %s ", three, hundred);
                break;
            case 4:
                printf("%s %s ", four, hundred);
                break;
            case 5:
                printf("%s %s ", five, hundred);
                break;
            case 6:
                printf("%s %s ", six, hundred);
                break;
            case 7:
                printf("%s %s ", seven, hundred);
                break;
            case 8:
                printf("%s %s ", eight, hundred);
                break;
            case 9:
                printf("%s %s ", nine, hundred);
                break;
            default:
                break;
        } //closes hundreds
        switch (tenPlace) {
            case 1:
                printf("%s ", ten);
                break;
            case 2:
                printf("%s %s ", two, ten);
                break;
            case 3:
                printf("%s %s ", three, ten);
                break;
            case 4:
                printf("%s %s ", four, ten);
                break;
            case 5:
                printf("%s %s ", five, ten);
                break;
            case 6:
                printf("%s %s ", six, ten);
                break;
            case 7:
                printf("%s %s ", seven, ten);
                break;
            case 8:
                printf("%s %s ", eight, ten);
                break;
            case 9:
                printf("%s %s ", nine, ten);
                break;
            default:
                break;
        } //closes ten
        switch (onePlace) {
            case 1:
                printf("%s\n", one);
                break;
            case 2:
                printf("%s\n", two);
                break;
            case 3:
                printf("%s\n", three);
                break;
            case 4:
                printf("%s\n", four);
                break;
            case 5:
                printf("%s\n", five);
                break;
            case 6:
                printf("%s\n", six);
                break;
            case 7:
                printf("%s\n", seven);
                break;
            case 8:
                printf("%s\n", eight);
                break;
            case 9:
                printf("%s\n", nine);
                break;
            default:
                printf("\n");
                break;
        }

    } //closes for loop
    return 0;
}