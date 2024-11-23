#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int* add();
int main()
{

    int *ip = add();
    printf("%d\n", *ip);

    return 0;
}

int* add()
{
    static int a = 10;
    return &a;
}