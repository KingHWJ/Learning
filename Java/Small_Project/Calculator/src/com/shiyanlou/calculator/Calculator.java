package com.shiyanlou.calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    // 创建一个 窗口对象，程序的主窗体
    JFrame frame = new JFrame("Calculator");

    // 设置窗口出现的位置

    // 所需组件

    /*
    显示计算结果
    创建一个 JTextField 对象并初始化。用于显示操作和计算结果的文本框
    参数20 表明可以显示 20 列的文本内容
     */
    JTextField result_TextField = new JTextField("",20);

    // 清除按钮
    JButton clear_Button = new JButton("Clear");

    // 数字按钮
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    // 操作符按钮
    JButton button_Dian = new JButton(".");
    JButton button_jia = new JButton("+");
    JButton button_jian = new JButton("-");
    JButton button_cheng = new JButton("*");
    JButton button_chu = new JButton("/");

    // 等于按钮
    JButton button_dy = new JButton("=");



    public Calculator() {

        // 放置数字面板
        JPanel pan = new JPanel();

        pan.setLayout(new GridLayout(4,4,5,5)); // （行，列，长，宽）

        // 将计算器按钮添加到容器中
        pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(button_chu);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(button_cheng);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button_jian);
        pan.add(button0);
        pan.add(button_Dian);
        pan.add(button_dy);
        pan.add(button_jia);

        // 设置对象的边距
        pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        // 放置清除框等的面板
        JPanel pan2 = new JPanel();

        pan2.setLayout(new BorderLayout());
        pan2.add(result_TextField,BorderLayout.WEST);
        pan2.add(clear_Button,BorderLayout.EAST);

        // 窗体添加面板
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(pan2,BorderLayout.NORTH);
        frame.getContentPane().add(pan,BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
