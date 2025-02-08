package com.jiangyixin.demo;

public class Test {
    public static void main(String[] args) {
        // 目标 面向对象实现智能家居控制系统
        // 角色 设备 (风扇 灯 空调 落地窗)
        // 命令 (打开 关闭)
        // 遥控器 (可以控制设备的开关)
        // 智能控制系统 控制调用设备的开和关
        // 定义一个父类 家电
        JD[] jds = new JD[4];
        jds[0] = new Air("美的空调", false);
        jds[1] = new Lamp("灯", false);
        jds[2] = new TV("小米电视", false);
        jds[3] = new WashMachine("海尔洗衣机", false);

        // 定义一个开关的功能
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        smartHomeControl.control(jds[0]);
        smartHomeControl.printAllStatus(jds);
    }
}
