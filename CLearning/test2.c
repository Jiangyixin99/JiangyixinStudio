#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int Max(int arrd[],int len);




int main()
{
    // 判断是否为2的幂次方
    //  int n = 145;
    //  while (n > 1 && n % 2 == 0)
    //  {
    //      n = n / 2;
    //  }
    //  if (n == 1)
    //  {
    //      printf("yes");
    //  }
    //  else
    //  {
    //      printf("no");
    //  }

    // 纸张折叠
    //  int i = 0;
    //  int height = 884830;
    //  double paper = 0.1;
    //  while (paper <= height)
    //  {
    //     paper = paper * 2;//纸张累加
    //    i++;//计算次数
    // }
    // printf("zhe die le %d\n", i);

    // 数字反转
    // int number = 123;
    // int rve = 0;
    // while (number != 0)
    // {
    //     int a = number % 10; // 提取右边第一个数字
    //     rve = rve * 10 + a; // 将数字加入转变后的数字
    //     number = number / 10; // 去掉右边第一个数字
    // }
    // printf("%d\n", rve);

    // 不使用加减法求商和余数 毁了
    // int dividend = 244;
    // int divisor = 7;
    // int i = 0;
    // int quotient = 0;         // 商
    // int remainder = dividend; // 余数 初始值为被除数
    // while (remainder >= divisor)
    // {
    //     int temp = remainder - divisor;
    //     remainder = temp;
    //     quotient++;
    // }
    // printf("商%d 余数%d \n", quotient, remainder);

    // 质数判断
    //  int number = 7;
    //  int count = 0;
    //  for (int i = 2; i < number; i++)
    //  {
    //      if(number % i == 0){
    //      printf("这不是质数");
    //      break;}
    //      else
    //      {
    //          printf("这是质数");
    //          break;
    //      }

    // 幂级数列
    // long long count = 0;          // 定义累加基数
    // for (int i = 1; i <= 10; i++) // 幂和底数 (外循环)
    // {
    //     long long pow = 1;           // 定义1
    //     for (int s = 1; s <= i; s++) // (内循环)
    //     {
    //         pow = pow * i; // 赋值给1 所有数乘给1
    //     }
    //     count += pow; // 累加
    // }
    // printf("%d", count);

    // 找出0~1000 符合要求的数字
    // 要求 每一位数字之和为15
    // 举例 78 168 1167

    // int counta = 0;
    // int countb = 0;
    // int count = 0;
    // for (int i = 1; i <= 1000; i++)//数据范围
    // {
    //     count = 0;
    //     while (i != 0) // 获取数字中每一位数字
    //     {
    //         int temp = i % 10;//获取数字
    //         count = count + temp;//数字累加
    //         i = i / 10;//去除末尾数字
    //     }
    //     if (count == 15)//判断
    //     {
    //         countb++;//累加符合数字
    //     }
    //     else
    //     {
    //         counta++;//累加不符合数字
    //     }
    // }
    // printf("不符合要求的有%d\n", counta);
    // printf("符合要求的有%d\n", countb);

    // 随机数范围12 ~ 27
    //  srand(time(NULL));
    // int num = rand()% 16 + 12;
    // printf("%d",num);


    // 求最值
    int arr[] = {33, 5, 22, 44, 55};

    printf("%d\n", Max(arr,5));






    return 0;
}




// 函数求最大值
int Max(int arrd[],int len)//arrd表示数组 len表示数组长度
{
    int max = arrd[0];//初始化max为数组的第一个元素
    for (int i = 1; i < len; i++)
    {
        if (max < arrd[i])
        {
            max = arrd[i];// 比较当前元素与max，更新max
        }
    }
     return max; // 返回最大值
}






// int类型数组长度

//计算数组长度 int lenn = sizeof(arr) / sizeof(int);

   