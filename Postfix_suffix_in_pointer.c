// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    //printf("Hello world");
      int val=100,*pt=&val;
      printf("%u and %d\n",pt,*pt);
      ++pt;
      printf("%u and %d",pt,*pt);
    //return 0;
}

/*O/p
3267050388 and 100
3267050392 and -1027916904
    */
