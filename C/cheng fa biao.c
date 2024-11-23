#include <stdio.h>

int main()
{ // 九九乘法表
   
    for (int i = 1; i <= 9; i++) // 控制行数 i的变化1~9
    {

        for (int s = 1; s <= i; s++) // 控制一行的式子数 s的变化1~9
        {

            printf("%d * %d = %d\t", s, i, s * i);
        }
        printf("\n");
    }

    // 1 * 1 = 1
    // 1 * 2 = 2 2 * 2 = 4
    // 1 * 3 = 3 2 * 3 = 6 3 * 3 = 9

    return 0;
}