#include <stdio.h>
#include <time.h>
#include <stdlib.h>
void printArr(int arr[], int len);
// 反转数组
int main()
{
    int arr[5] = {0}; //定义数组全为 0
    int len = sizeof(arr) / sizeof(int);// 数组长度
    for (int i = 0; i < len; i++)//输入数组数据
    {
        printf("请输入第%d个元素", i + 1);

        scanf("%d", &arr[i]);//i : 0 ~ 4
    }
    printArr(arr, len);

    int i = 0;
    int j = len - 1;
    while (i < j)
    {
        int temp = arr[i];//先记录没反转前的数组数据
        arr[i] = arr[j];//进行反转
        arr[j] = temp;//进行反转
        i++;//移动 数组内存地址
        j--;
    }
    printArr(arr, len);//遍历数组




    
    


}






// 遍历数组
void printArr(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        printf("%d\n", arr[i]);
    }
}




