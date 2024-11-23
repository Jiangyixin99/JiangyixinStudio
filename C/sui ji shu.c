#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int contains(int len, int arr[], int num);
int main()
{

    // 数组求和 生成10个1 ~ 100之间的随机数存入数组 数据不能重复
    // 求出所有数据的和
    // 求出平均数
    // 统计有多少数据比平均值小
    int count = 0;                       // 定义累加值
    int counta = 0;                      // 定义比平均值小的数
    int arr[10] = {0};                   // 定义数组
    int len = sizeof(arr) / sizeof(int); // 数组长度
    srand(time(NULL));                   // 种子

    for (int i = 0; i < len;)
    {
        int num = rand() % 100 + 1;         // 1 ~ 100 随机数生成10个
        int flge = contains(len, arr, num); // 存入数据至数组
        if (!flge)
        {
            arr[i] = num;
            i++;
        }
    }

    for (int i = 0; i < len; i++) // 求和
    {
        count += arr[i];
    }
    printf("数组和为%d\n", count);
    int average = count / len; // 求平均值
    printf("平均值average:%d\n", average);

    for (int i = 0; i < len; i++)
    {

        if (arr[i] < average)
        {
            counta++;
        }
    }
    printf("比平均值小的数有：%d个\n", counta);
}

// 判断存入数组数据是否重复 并返回值
int contains(int len, int arr[], int num)
{

    for (int i = 0; i < len; i++)
    {
        if (arr[i] == num)
        {
            return 1;
        }
    }
    return 0;
}