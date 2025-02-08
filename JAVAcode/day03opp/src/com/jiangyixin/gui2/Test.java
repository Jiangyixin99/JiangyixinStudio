package com.jiangyixin.gui2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test {
    public static void main(String[] args) {
        // 创建主窗口
        JFrame frame = new JFrame("登录界面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // 居中显示

        // 设置面板和布局
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4行2列，间距10
        // 点击画布使窗口成为焦点 为面板添加鼠标点击事件监听器
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 让窗口成为焦点
                frame.requestFocus();
            }
        });

        frame.add(panel);

        // 设置标签和输入框
        JLabel userLabel = new JLabel("用户名:");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("密码:");
        JPasswordField passwordText = new JPasswordField();

        // 设置按钮
        JButton loginButton = new JButton("登录");
        JButton cancelButton = new JButton("取消");

        // 美化组件
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 设置边距
        panel.setBackground(Color.WHITE); // 设置面板背景色

        userLabel.setForeground(Color.BLUE); // 设置标签文字颜色
        passwordLabel.setForeground(Color.BLUE);

        userText.setFont(new Font("宋体", Font.PLAIN, 14)); // 设置字体
        passwordText.setFont(new Font("宋体", Font.PLAIN, 14));

        loginButton.setFont(new Font("宋体", Font.BOLD, 14)); // 设置按钮字体
        cancelButton.setFont(new Font("宋体", Font.BOLD, 14));

        loginButton.setBackground(Color.BLUE); // 设置按钮背景色
        loginButton.setForeground(Color.WHITE);
        cancelButton.setBackground(Color.LIGHT_GRAY);
        cancelButton.setForeground(Color.BLACK);

        // 添加组件到面板
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(loginButton);
        panel.add(cancelButton);

        // 添加按钮点击事件
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals("admin") && password.equals("123456")) {
                    JOptionPane.showMessageDialog(frame, "登录成功！");
                } else {
                    JOptionPane.showMessageDialog(frame, "用户名或密码错误！");
                }
            }
        });
        // 按键事件 监听用户键盘上下左右四个按键的事件
        // 给窗口整体绑定按键事件
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP -> System.out.println("用户点击了向上");
                    case KeyEvent.VK_DOWN -> System.out.println("用户点击了向下");
                    case KeyEvent.VK_LEFT -> System.out.println("用户点击了向左");
                    case KeyEvent.VK_RIGHT -> System.out.println("用户点击了向右");
                    default -> {
                    }
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // 关闭窗口
            }
        });

        // 显示窗口
        frame.setVisible(true);

    }
}