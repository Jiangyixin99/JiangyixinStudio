#include <stdio.h>
#include <time.h>
#include <stdlib.h>
void printArr(int arr[], int len);

int main(){
//打乱数组
int arr[5] = {1, 2, 3, 4, 5};//定义数组
int len = sizeof(arr) / sizeof(int);//数组长度

//遍历数组 得到每一个元素 让这个元素跟随机索引处的元素进行交换

//设置种子
srand(time(NULL));
for (int i = 0; i < len ; i++)
{
    //获取随机索引
    int random = rand() % len;
    int temp = arr[i];
    arr[i] = arr[random];
    arr[random] = temp;


}
printArr(arr, len);

}
// 遍历数组
void printArr(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        printf("%d\n", arr[i]);
    }
}