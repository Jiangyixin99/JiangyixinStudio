#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));
    int number = rand() % 100 + 1;

    int guess;
    int count = 0;


    while (1)
    {
        if (scanf("%d\n", &guess) != 1)// 检查输入是否为整数
        {
            // 清除输入缓冲区并提示错误
            while (getchar() != '\n'); // 清除换行符
            printf("输入错误，请输入一个整数：\n");
            continue; // 继续下一次循环
        }
        
        printf("请输入1 ~ 100之间的数字\n");
        scanf("%d\n", &guess);
        if (guess < number)
        {
            printf("猜小了，再猜一次");
            count++;
        }
        else if (guess > number)
        {
            printf("猜大了， 再猜一次");
            count++;
        }
        else if (guess == number)
        {
            count++;
            break;
        }
        else
        {
           printf("请重新输入");
        }
    }
    printf("猜对了,猜了%d次\n", count);
}//有问题 待解决