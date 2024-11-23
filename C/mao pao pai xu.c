#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int contains(int arr[], int len, int num);
// 冒泡排序

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


    while (len != 1)
    {
        for (int i = 0; i < len - 1; i++) //@细节;当 i 等于 len  时，arr[i + 1] 会越界
        {
            if (arr[i] > arr[i + 1])
            {
                int min = arr[i + 1]; // 取较小值
                arr[i + 1] = arr[i];  // 将较大值排后面
                arr[i] = min;         // 将较小值排前面
            }
        } 
        len--;
    }
    for (int i = 0; i < 100; i++) // 遍历数组
    {
        printf("%d\n", arr[i]);
    }
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