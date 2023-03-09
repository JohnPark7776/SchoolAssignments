/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Random Access File Editor
*/ 

#include <stdio.h> 
#include <stdlib.h>
#include "student.h"
#include "getdouble.h"
#include "stringinput.h"
#include <ctype.h>

void printStudent(Student);

int main() {
          
    Student studentX = {-1, "", "", 0, 0.0 };
    Student studentArray[MAX_RECORDS] = {{-1, "", "", 0, 0.0 }};
    FILE *filePointer = NULL;    
    char *fileName = "students.dat";
    int fileClosed = 0; 
    int seekError = 0;
    int writeError = 0;
    int readError = 0; 
    int sizeFirstName = 0;
    int sizeLastName = 0;
    char dummyString[MAX_STRING] = {'\0'};

    int endLoop = 1;
    int temp;
    char choice = 'h';

    filePointer = fopen(fileName,"rb+");

    while (endLoop == 1) {
        int tester = 0;
        int i = 0;
        for (i = 0; i < MAX_RECORDS; i++){
            readError = fread(&studentX,sizeof(Student),1,filePointer);
            if(1 == readError){
                studentArray[i] = studentX;
                if (-1 != studentArray[i].number) {
                    printStudent(studentArray[i]);
                }
                
            }
        }
        printf("Enter the record number you wish to edit: ");
        scanf("%d", &temp);
        if (temp >= 0 && temp <= 20) {
            for (i = 0; i < MAX_RECORDS; i++) {
                if (studentArray[i].number != -1 && studentArray[i].number == temp) {
                tester = 1;
                break;
                }
            }
            if (tester == 1) {
                printf("You selected record #%d:\n", temp);
                printStudent(studentArray[i]);
                printf("Do you wish to edit first name (f), last name (l), age (a), or gpa (g)?");
                getchar();
                choice = getchar();

                switch (choice) {
                    case 'f': 
                        getchar();
                        getstring(studentX.first, MAX_STRING);
                        break;

                    case 'l':
                        sizeLastName = getstring(studentX.last, MAX_STRING);
	                    if(sizeLastName > MAX_STRING - 2){
                            printf("ERROR: Cannot enter last name greater than %d characters\n", MAX_STRING - 2);
                        }

                        break;
                    case 'a':
                        studentX.age = getdouble();
                        break;
                    case 'g':
                        studentX.gpa = getdouble();
                        break;
                    default: 
                        printf("Error! '%c' is not a valid answer!", choice);
                        tester = 0;
                        break;
                } //closes switch(choice)
                studentX.number = temp;
                seekError = fseek(filePointer,studentX.number, SEEK_SET);
                if(0==seekError){
                    printf("Record #%d was correctly located in file  \"%s\". \n", studentX.number, fileName);
                } else {
                    printf("Record #%d was NOT correctly located in file  \"%s\". \n", studentX.number, fileName);
                }
                
                //write new record to file
                writeError = fwrite(&studentX,sizeof(Student),1,filePointer);
                if(1 == writeError){
                    printf("Record #%d was correctly written to file  \"%s\". \n", studentX.number, fileName);
                }
                else{
                    printf("Record #%d was NOT correctly written to file  \"%s\". \n", studentX.number, fileName);
                }
                //output record
                printStudent(studentX);
                
                fileClosed = fclose(filePointer);
                if(0 == fileClosed){
                    printf("File connection to \"%s\" closed successfully.\n", fileName);
                }//end of if
                else{
                    printf("File connection to \"%s\" did NOT close successfully.\n", fileName);
                }//end of else
            

            
            } else {
                printf("Records #%i does not exist!", temp);
            } //closes if(tester)/else



        } else {
            printf("Error! Please input a number between 0 - 20 only.\n");
        } //closes if(temp)/else
        printf("Keep editing records? Yes(y) or No(n)? ");
        scanf("%c", &choice);
        if ((choice == 'n') || (choice == 'N')) {
            endLoop = 0;
            return 0;
        } 
    i = 0;
    } //closes while loop
    
    return 0;
}
//display Student structure
void printStudent(Student studentX){
   printf("%6d  %9s  %8s  %3d  %3.1f  \n", 
               studentX.number, 
               studentX.first, 
               studentX.last, 
               studentX.age, 
               studentX.gpa);
}