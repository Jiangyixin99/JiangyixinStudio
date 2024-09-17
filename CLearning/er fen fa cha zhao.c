#include <stdio.h>
#include <stdlib.h>

int chazhao (int arr[], int len, int num);
//二分查找 (在数据有序情况下 可提高效率)
//过程:
//min和max表示当前要查找的范围
//mid是在min和max中间的
//min不变，max等于mid减1
//如果要查找的元素在mid的左边，缩小范围时，min不变，max等于mid减1
//如果要查找的元素在mid的右边，缩小范围时，max不变，min等于mid加1
int main()
{
    // 定义数组
    int arr[10] = {23, 45, 69, 46, 67, 24, 75, 53, 54, 26};
    int len = sizeof(arr) / sizeof(int);
    // 定义查找数据
    int num = 1;
    //调用函数 
    int index = chazhao(arr, len, num);
   
    //打印索引
     printf("索引为%d",index);//如果返回值为 -1
    
    
    return 0;
}


// 定义查找函数
int chazhao (int arr[], int len, int num)
{
    int min = 0;//定义索引最小值
    int max = len - 1;//定义索引最大值
    while (min <= max)//判断数组中是否存在该数据 
    {
        int mid = (min + max) / 2;//定义 并求出中间索引
        if (arr[mid] < num)//将数据与中间值比较 判断在数据在中间值左边还是右边
        {
            min = mid + 1;//若数据在右边 则将最小索引移动至中间值右边
        }
        else if (arr[mid] > num)//将数据与中间值比较 判断在数据在中间值左边还是右边
        {
            max = mid - 1;//若数据在左边 则将最小索引移动至中间值左边
        }
        else
        {
            return mid; // 找到元素 返回索引
        }
    }
    return -1;//未找到元素 返回-1
}