/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Calculate how many days from user birthday till now.
*/

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <time.h> /*getdate()*/
#include "getdouble.h" /*gets getdouble() to use*/

//symbolic constants
#define DAYSOFYEAR 365.25
#define DAYSPERMONTH 365.25/12.0

int main(void) {
    //declare variables
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    double day = 0;
    double month = 0;
    double year = 0;

    // System's Current date
    printf("Today's date: %d/%d/%d\n", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900);

    printf("Please input the day you were born.\n");
    day = getdouble();
    printf("Please input the month you were born.\n");
    month = getdouble();
    printf("Please input the year you were born.\n");
    year = getdouble();

    //calculate
    double todayAmountDays = ((tm.tm_year + 1900) * DAYSOFYEAR) + (tm.tm_mon * DAYSPERMONTH) + tm.tm_mday;
    double userAmountDays = (year * DAYSOFYEAR) + ((month - 1) * DAYSPERMONTH) + day;
    double calculateDays = (todayAmountDays - userAmountDays);

    printf("Your age in days: %.2f days\n", calculateDays);



    return 0;


}
