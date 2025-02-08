package com.jiangyixin.javabean;

//

public class Test {
    public static void main(String[] args) {
        Student jiangyixin = new Student();
        jiangyixin.setName("江一欣");
        jiangyixin.setAge(18);
        jiangyixin.setSex('男');
        jiangyixin.setMath(80);
        jiangyixin.setChinese(70);
        // 创建算法对象
        StudentOperator operator = new StudentOperator(jiangyixin);
        // 调用算法对象中的方法
        operator.printTotalScore();
        System.out.println(VerifyCode.getcode(5));

    }
}
