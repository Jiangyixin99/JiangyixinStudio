#include <stdio.h>

int main()
{
    // 练习一
    int number;
    printf("请输入一个两位数\n");
    // scanf("%d \n", &number);
    int ge = number % 10;
    int shi = number % 10;
    int num = number % 7;
    printf("%d \n", ge != 7 && shi != 7 && num != 0);

    // 练习二 三元运算
    int a = 10;
    int b = 30;
    int c = 20;
    int d = a > b ? a : b;
    int e = d > e ? d : e;
    printf("%d \n", e);

    // 练习三
    int num1 = 11;
    num1 = num1 >= 0 ? num1 : -num1;
    printf("%d \n", num1);

    // 练习四 if
    int money = 1992;
    if (money = 0)
    {
        printf("抱歉没充钱");
    }
    else if (money > 1 && money < 99)
    {
        printf("尊贵的vip1");
    }
    else if (money > 100 && money < 499)
    {
        printf("尊贵的vip2");
    }
    else if (money > 499 && money < 1499)
    {
        printf("尊贵的vip3");
    }
    else if (money > 1499 && money < 3499)
    {
        printf("尊贵的vip4");
    }
    else
    {
        printf("尊贵的vip5\n");
    }

    // 练习五
    int week = 6; // 定义日期
    switch (week)
    { // 给出选择
    case 's':
        printf("跑步\n");
        break;
    case 6:
        printf("打球1\n");
        // break;
    case 7:
        printf("打球2\n");
        break;
    case 8:
        printf("打球3\n");
        break;
    default:
        printf("打游戏\n");
        break;
    }

    // 练习六 1-5 5-1
    for (int i = 1; i <= 5; ++i)
    {
        printf("%d\n", i);
    }
    for (int numq = 5; numq >= 1; numq--)
    {
        printf("%d\n", numq);
    }
    // 1 ~ 5 +
    int nume = 0;
    for (int numw = 1; numw <= 5; numw++)
    {
        nume += numw;
    }
    printf("%d\n", nume);

    // 偶数相加
    int sum = 0;
    for (int i = 1; i <= 100; i++)
    {
        if (i % 2 == 0)
        {
            sum += i;
        }
    }
    printf("%d", sum);

    return 0;
}
