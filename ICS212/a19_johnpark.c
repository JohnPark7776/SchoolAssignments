/* 
    John Park
    ICS 212
    TR 1345-1500
*/

/*
    Random Access File Editor
*/ 

#include <stdio.h> /*library with getchar() & printf*() functions*/
#include <stdlib.h> /*stdlib.h*/
#include <time.h> /*Time function*/


/*
A self-referential structures contains a pointer
that points to another structure of the same type
and link together to form dynamic data structures.
data: stores a word (int)
next: is a pointer to the next node
*/
struct node {
    int data;
    struct node *next;
};

//type defintion for "new" data types
typedef struct node Node;
typedef struct node* NodePointer;

//function prototypes
int dataRandomGen();
void insertIntoLinkedList(int, NodePointer *);
void displayLinkedList(NodePointer, int);
int sum(NodePointer);
int count(NodePointer);
void pointAverage(int, int);


int main() {
    //declare variables
    srand(time(NULL)); //Creates seed for random
    int i = 0;
    NodePointer head = NULL;
    //Generates random number between 25 - 75
    int ranGen = (rand() % 50) + 25; 

    //Holds number range 0 - 100 from the amount from ranGen
    int numberHold[ranGen];
    for (i = 0; i < ranGen; i++) {
        numberHold[i] = dataRandomGen();
    }
    //Saves int array to pointer
    int *pNumHold = NULL;
    pNumHold = numberHold;

    //Saves info into LinkedList
    for (i = 0; i < ranGen; i++) {
        insertIntoLinkedList(pNumHold[i], &head);
    }

    //Prints LinkedList
    displayLinkedList(head, ranGen);

    //Prints total sum and count
    printf("Sum: %i\n", sum(head));
    printf("Count: %i\n", count(head));
    pointAverage(sum(head), count(head));
    

    return 0;

} //closes main

/*
    Generates random Int between 0 - 100
*/
int dataRandomGen(int rG) {
    return rand() % 101;

} //closes dataRandomGen()

void insertIntoLinkedList(int num, NodePointer *head2){
//pointer to a new node to be inserted into linked list
   NodePointer newNode = NULL;
//pointer to the previous node in the linked list
   NodePointer previous = NULL;
//pointer to the current node in the linked list
   NodePointer current = *head2;

//create a node on the heap
   newNode = malloc(sizeof(Node));
/*
check to see if space is available
if no space on heap, malloc() will return NULL
*/
   if (newNode != NULL) {
   //copy over word to the node
      newNode -> data = num;

   }
   if(previous == NULL) {
       newNode -> next = current;
       *head2 = newNode;
   } else {
       previous -> next = newNode;
       newNode -> next = current;
   }

} //closes insert

void displayLinkedList(NodePointer current, int rG) {
    int i = 0;
    //for empty list
    if(current == NULL){
        printf("The linked list is empty!\n\n");
        return;
    }
    printf("Linked List items: ");
    //loop through list
    while(current != NULL){
        //display each node
        printf("%d", current -> data);
        //Doesn't print comma after the last Int
        if (i < rG - 1) {
            printf(", ");
        }
    
        //go to next node
        current = current -> next;
        i++;
    }
    printf("\n\n");
} //closes displayLinkedLIst()
/*
    Gets total sum of all Int in ListedList
*/
int sum(NodePointer current) {
    int total = 0;
    while(current != NULL) {
        total += current -> data;
        current = current -> next;
    }
    return total;
} //closes sum()

/*
    Counts amount of Ints in ListedList
*/
int count(NodePointer current) {
    int total = 0;
    while(current != NULL) {
        total++;
        current = current -> next;
    }
    return total;
} //closes count()

/*
    Prints average of ListedList
*/
void pointAverage(int s, int c) {
    float avg = (float)s/(float)c;
    printf("Average: %.2f\n", avg);
} //closes pointAverage()
