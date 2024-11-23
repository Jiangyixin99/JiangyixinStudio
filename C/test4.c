#include <stdio.h>
//找出0~1000 符合要求的数字
//    要求 每一位数字之和为15
  //  举例 78 168 1167
int main(){
    int countb = 0;
    int count = 0;
    for (int i = 1; i <= 11; i++)//数据范围
    {
        count = 0;
        int temp = i;
        while (temp != 0) // 获取数字中每一位数字
        {
             count += temp % 10;//数字累加 未改变temp值
            temp /= 10;//去除末尾数字
        }
        if (count == 15)//判断
        {
            countb++;//累加符合数字
        }
        
    }
   
    printf("符合要求的有%d\n", countb);
}
