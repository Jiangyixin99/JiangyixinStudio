package com.jiangyixin.hello;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class SnakeGame extends JFrame implements ActionListener, KeyListener {
    private static final int TILE_SIZE = 20; // 每个格子的像素大小
    private static final int GRID_WIDTH = 30; // 网格宽度（格子数）
    private static final int GRID_HEIGHT = 20; // 网格高度（格子数）
    private Timer timer; // 游戏计时器
    private LinkedList<Point> snake; // 蛇的身体坐标
    private Point food; // 食物坐标
    private int direction = KeyEvent.VK_RIGHT; // 初始方向向右
    private boolean isGameOver = false; // 游戏结束标志
    private int score = 0; // 得分

    public SnakeGame() {
        // 初始化窗口
        setTitle("贪吃蛇游戏 - Java");
        setSize(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);

        // 初始化蛇（长度为3）
        snake = new LinkedList<>();
        snake.add(new Point(5, 5));
        snake.add(new Point(4, 5));
        snake.add(new Point(3, 5));

        // 生成第一个食物
        spawnFood();

        // 设置游戏循环（每100ms更新一次）
        timer = new Timer(100, this);
        timer.start();

        setVisible(true);
    }

    // 生成食物（随机位置）
    private void spawnFood() {
        Random rand = new Random();
        int x, y;
        do {
            x = rand.nextInt(GRID_WIDTH);
            y = rand.nextInt(GRID_HEIGHT);
        } while (snake.contains(new Point(x, y))); // 避免食物生成在蛇身上
        food = new Point(x, y);
    }

    // 处理键盘事件（改变方向）
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // 禁止直接反向移动（例如：当前向右时不能直接向左）
        if ((key == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT) ||
                (key == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT) ||
                (key == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN) ||
                (key == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP)) {
            direction = key;
        }
    }

    // 游戏逻辑更新
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            // 移动蛇头
            Point head = snake.getFirst();
            Point newHead = (Point) head.clone();

            switch (direction) {
                case KeyEvent.VK_UP:
                    newHead.y--;
                    break;
                case KeyEvent.VK_DOWN:
                    newHead.y++;
                    break;
                case KeyEvent.VK_LEFT:
                    newHead.x--;
                    break;
                case KeyEvent.VK_RIGHT:
                    newHead.x++;
                    break;
            }

            // 检测碰撞
            if (newHead.x < 0 || newHead.x >= GRID_WIDTH ||
                    newHead.y < 0 || newHead.y >= GRID_HEIGHT ||
                    snake.contains(newHead)) {
                isGameOver = true;
                timer.stop();
                repaint();
                return;
            }

            // 添加到蛇头
            snake.addFirst(newHead);

            // 检测是否吃到食物
            if (newHead.equals(food)) {
                score += 10;
                spawnFood();
            } else {
                snake.removeLast(); // 未吃到食物时移除蛇尾
            }

            repaint(); // 重绘界面
        }
    }

    // 绘制游戏界面
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 绘制背景
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // 绘制蛇
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE - 1, TILE_SIZE - 1);
        }

        // 绘制食物
        g.setColor(Color.RED);
        g.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE - 1, TILE_SIZE - 1);

        // 绘制得分和游戏结束提示
        g.setColor(Color.WHITE);
        g.drawString("得分: " + score, 10, 20);
        if (isGameOver) {
            g.drawString("游戏结束！按 R 重新开始", getWidth() / 2 - 80, getHeight() / 2);
        }
    }

    // 重启游戏（按 R 键）
    @Override
    public void keyReleased(KeyEvent e) {
        if (isGameOver && e.getKeyCode() == KeyEvent.VK_R) {
            isGameOver = false;
            score = 0;
            snake.clear();
            snake.add(new Point(5, 5));
            snake.add(new Point(4, 5));
            snake.add(new Point(3, 5));
            spawnFood();
            timer.start();
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new SnakeGame(); // 启动游戏
    }
}