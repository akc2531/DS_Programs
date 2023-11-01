// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
   int val=100,*pt,**pnt;
   pt=&val;
   pnt=&pt;
   printf("Value of val :- %d \n",val);
   printf("Addres of val :- %u\n",pt);
   printf("Value of val by *pt :- %d\n ",*pt);
   printf("Address of pt : %u\n ",pnt);
   printf("Address as value of pt :- %d\n ",*pnt);
}

/*O/p
Value of val :- 100 
Addres of val :- 2650435124
Value of val by *pt :- 100
 Address of pt : 2650435112
 Address as value of pt :- -1644532172
  */
