package com.jiangyixin.javabean;

//工具类
public class VerifyCode {
    // 工具类私有构造器
    private VerifyCode() {
    }

    // 创建验证码工具
    public static String getcode(int n) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // 生成1-4之间的随机数
            int num = (int) (Math.random() * 3 + 1);

            switch (num) {
                case 1 -> code.append((int) (Math.random() * 10));

                case 2 -> code.append((char) (Math.random() * 26 + 'A'));

                case 3 -> code.append((char) (Math.random() * 26 + 'a'));

            }
        }
        return code.toString();
    }

}
