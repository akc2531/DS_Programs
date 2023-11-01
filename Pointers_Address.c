#include <stdio.h>
int main()
{
    int a=100;
    double b= 100.9;
    float c=87.9;
    char d='A';
    int *aa;
    double *bb;
    float *cc;
    char *dd;
    aa=&a;
    bb=&b;
    cc=&c;
    dd=&d;
    printf("Address of A is : %u \n",aa);
    printf("Address of B is : %u \n",bb);
    printf("Address of C is : %u \n",cc);
    printf("Address of D is : %u \n",dd);
}
