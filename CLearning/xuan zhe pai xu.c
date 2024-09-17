#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int contains(int arr[], int len, int num);
void printArr(int arr[], int len);

// 选择排序 从最小索引依次与后面索引比较 将最小索引找出
int main()
{
    // 定义随机数组1 ~ 1000 中 100个
    // 设置种子
    srand(time(NULL));
    int arr[100] = {0};                  // 定义数组
    int len = sizeof(arr) / sizeof(int); // 定义数组长度

    for (int i = 0; i < len;)
    {
        int num = rand() % 1000 + 1;        // 取100个随机数
        int flag = contains(arr, len, num); // 防止随机数重复
        if (!flag)
        {
            arr[i] = num; // 将数据存入数组
            i++;
        }
    }

    for (int i = 0; i < len - 1; i++) // 控制最小索引位置
    {

        for (int s = 1; s < len - i; s++) // 控制每个索引位置
        {
            if (arr[i + s] < arr[i]) // 依次与最小索引比较
            {
                int temp = arr[i];
                arr[i] = arr[i + s];
                arr[i + s] = temp; // 将最小索引放前面
            }
        }
    }

    printArr(arr, len); // 遍历数组 并打印

    return 0;
}

// 随机数不重复函数
int contains(int arr[], int len, int num)
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

// 遍历数组
void printArr(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        printf("%d\n", arr[i]);
    }
}