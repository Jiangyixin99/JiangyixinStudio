package com.jiangyixin.innerclass2;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 搞清楚匿名内部类的使用场景
        // 创建一个登录窗口
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null);// 居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口时退出程序

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);

        // 给按钮添加一个点击事件
        btn.addActionListener((ActionEvent e) -> {
            System.out.println("登录按钮被点击了");
        });

        win.setVisible(true);
    }

}
