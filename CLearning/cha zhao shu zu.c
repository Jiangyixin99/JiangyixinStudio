#include <stdio.h>
int query(int arr[],int len, int num);
int main(){


//定义数组
int arr[5] = {89 ,32, 34, 56, 78};
int len = sizeof(arr) / sizeof(int);



//定义要查找的数据
int num = 32;
//调用函数查找数据
int number = query(arr, len, num);
//输出索引
printf("%d\n",number);
}


  //查找数据
int query(int arr[],int len, int num)
{
    for (int i = 0; i < len; i++)
{
    if (arr[i] = num)
    {
        return i;
    }
    else
    {
        printf("数组中没有这个数据");
    }
    
}

}