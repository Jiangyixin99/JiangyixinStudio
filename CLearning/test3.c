#include <stdio.h>

int main() {
    int count = 0; // 用于存储数字之和
    int countb = 0; // 用于统计符合条件的数字数量

    for (int i = 1; i <= 1000; i++) { // 遍历1到1000的所有数字
        count = 0; // 重置数字之和
        int temp = i; // 使用临时变量来遍历每一位数字

        while (temp != 0) { // 获取数字中每一位数字
            count += temp % 10; // 数字累加
            temp /= 10; // 去除末尾数字
        }

        if (count == 15) { // 判断数字之和是否为15
            countb++; // 累加符合条件的数字数量
            printf("%d\n", i); // 打印符合条件的数字
        }
    }

    printf("符合条件的数字共有%d个。\n", countb); // 打印符合条件的数字总数
    return 0;
}