#include <stdio.h>

int main()
{
    printf("hello world \n");
    // 生成char字节大小
    printf("%lu \n", sizeof(char));
    // 隐型转换数据类型
    int i = 10;
    float f = 1;
    double d = i + f;
    //%d 整型
    //%f 实型
    //%s 字符串
    //%c 字符
    // 变量

    // @书写
    // 二进制 0b number
    // 八进制 0 number
    // 十六进制 0x number

    //@数据类型
    // 决定数据类型大小
    // 决定类型

    //@整数: short int long longlong
    // 符号 un/ signed
    signed int num = 99;
    printf("%u\n", num);

    // @小数
    // doubel float （long doubel）
    double num2 = 1.232;
    printf("%.2lf\n", num2);

    //@字符 : char
    char c1 = 'd';
    printf("%c\n", c1);
    char c2 = '1';
    printf("%c\n", c2);
    char c3 = 'c';
    printf("%c\n", c3);

    //@标识符 name 由数字 字母 下划线 组成 (不能以数字开头, 不能是关键字)

    //@键盘录入scanf
    // int a;
    // scanf("%d\n", &a);键盘录入 关键字
    // printf("%d\n", a);

    //@内存
    // char str[4] = "aaa";//[内存占用大小]
    // int age;
    // scanf("%d\n", &age);
    // printf("%d\n", age);

    // #练习
    // 变量定义
    // double length;
    // double weidth;
    // double height;
    //  %lf 为doubel的占位符
    // #scanf("%lf %lf %lf\n", &length, &weidth, &height);
    // double a_mian = length * weidth;
    // double b_mian = length * height;
    // double c_main = weidth * height;
    // 面积计算
    // printf("%.2lf %.2lf %.2lf\n", a_mian, b_mian, c_main);

    //@运算
    // 通用细节
    // 1 整数计算 结果一定是整数
    // 2 小数计算 结果一定是小数
    // 3 整数和小数一起计算 结果一定是小数
    // 4 小数直接参与计算结果可能不精确

    // 除法不能除以0
    // 取余数 运算数据必须全为整数
    // 获取余数正负 以第一个数字保持一致
    // 了解就行
    printf("%d\n", 10 % 3);
    printf("%d\n", -10 % 3);
    printf("%d\n", 10 % -3);

    //@隐式转换 小转大 显式转换 大转小
    num = (int)1.1;

    // 运算符

    // 自增自减运算符--++
    // a++ = a + 1 ，a-- = a -1

    // 赋值运算符 +=

    // 关系运算符 == != > >= < <=
    //  1 True 0 False

    // 逻辑运算符 && || !

    // 三元运算符 c = a > b ? a : b

    // 逗号运算符 (优先级最低)(i = 3 , ++i , i + 6);i = 10

    //@流程控制语句
    // 顺序结构(程序默认执行流程)
    // 分支结构 if switch
    // switch 中case 寻找过程是同时进行 穿透过程是从上往下
    // 循环结构
    // for(初始化语句; 条件判断语句; 条件控制语句;)
    // 循环体语句
    // while (结束条件)
    // break continue

    //@函数void(参数)无返回值
    //(函数名 函数体)
    // int sum(实际参数)
    // return(i)

    //@随机数
    // srand()种子 rand(time(NULL))
    // 任意范围取随机数  包头不包尾 包左不包右

    //@数组
    // 初始化 定义数组时 第一次给数组赋值int are[5]={1, 2, 3, 4 ,5 ,6};
    // 修改数组数据are[2] = 100;(2表示偏移量(从内存的角度叫法) are表示首地址)
    // 利用循环索引数组
    // 内存中的数组
    // 内存:内存在运行软件时，用来存储临时数据
    // 一个内存地址是一个字节(八个二进制)
    // 64位操作系统 最大内存地址是2的64次方
    // 变量的内存地址 int(4个字节) &(取地址运算符)格式化%p
    int a = 10;
    printf("%p", &a);
    // 数组内存是 长度*类型长度
    // 索引越界最小索引0 最大索引 长度 - 1

    // 内存地址 : 指针(数据名称* 变量名) = 内存地址

    //定义指针 将变量a的内存地址 赋值给ip
    int *ip = &a;//ip为变量a的地址 *ip 存储了地址中存储的数据


    // 指针运算 与数据类型相关
    // 野指针 内存未被分配的指针
    // 悬空指针空间已分配 但是被释放了
    // 没有类型的指针(void* p) 无法获取数据 无法计算 可以接受任意地址
    // 只能接收内存地址
    // 数组在退化

    //在函数中定义的变量在函数结束了会消失 
    //使用static关键字可以使变量保留

    // 二维数组
    // 2 表示数组数量
    // 4 表示每一个数组的数据数量
    int arr[2][4] =
        {
            {1, 3, 4, 3},
            {1, 2, 3, 4}};

    return 0;
}