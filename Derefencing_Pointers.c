// Online C compiler to run C program online
#include <stdio.h>

int main() {
   int a=100,*aa;
   float b=100.95,*bb;
   aa=&a;
   bb=&b;
   printf("Now Dereferencing it we get :- \n");
   printf("Value of aa  :- %d \n",*aa);
   printf("Value of bb :-  %.2f" ,*bb);
}
