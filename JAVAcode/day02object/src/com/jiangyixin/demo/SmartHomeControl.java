package com.jiangyixin.demo;

public class SmartHomeControl {
    private static final SmartHomeControl SMART_HOME_CONTROL = new SmartHomeControl();

    public static SmartHomeControl getInstance() {
        return SmartHomeControl.SMART_HOME_CONTROL;
    }

    public void control(JD jd) {
        System.out.println(jd.getName() + "的状态为" + (jd.isStatus() ? "开着" : "关闭"));

        System.out.println("请选择开关");
        jd.press();
        System.out.println(jd.getName() + "的状态为" + (jd.isStatus() ? "开着" : "关闭"));
    }

    public void printAllStatus(JD[] jds) {
        for (JD jd : jds) {
            System.out.println(jd.getName() + "的状态为" + (jd.isStatus() ? "开着" : "关闭"));
        }
    }

}
