#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//遍历第二种格式的二维数组
int main()
{
//定义三个数组
int arr1[2] = {1, 4};
int arr2[4] = {1, 3, 4, 7};
int arr3[3] = {4, 6, 5};
//计算三个数组的长度
int len1 = sizeof(arr1) / sizeof(int);
int len2 = sizeof(arr2) / sizeof(int);
int len3 = sizeof(arr3) / sizeof(int);
int len[3] = {len1, len2, len3};
//将三个数组 组成一个二维数组 数组在这属于指针类型
int* arr[3] = {arr1, arr2, arr3};
//有三个数组 所以循环三次      
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < len[i]; j++)//遍历数组len改变索引长度
{
    printf("%d\n",arr[i][j]);  
}
}







return 0;
}
