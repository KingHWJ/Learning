package DataStructures.Stack;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

// 利用数组模拟栈
public class BasicStack {
    public static void main(String[] args) {

        Random rad = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要创建的栈的大小：");
        int size = scanner.nextInt();
        BasicStack stack = new BasicStack(size);
        while (true) {
            System.out.println("\n（1）栈是否为空");
            System.out.println("（2）栈是否已满");
            System.out.println("（3）入栈");
            System.out.println("（4）出栈");
            System.out.println("（5）显示全部");
            System.out.println("（6）退出\n");

            System.out.print("请输入功能：");
            char num = scanner.next().charAt(0);
            switch (num) {
                case '1':
                    System.out.println(stack.isEmpty());
                    break;
                case '2':
                    System.out.println(stack.isFull());
                    break;
                case '3':
                    System.out.print("请输入要入栈的数：");
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case '4':
                    System.out.println(stack.pop());
                    break;
                case '5':
                    stack.show();
                    break;
                case '6':
                    System.exit(0);
            }

        }

    }

    private int max_size;
    private int top = -1;       // 顶部指针
    private int[] stack;

    public BasicStack(int max_size) {
        this.max_size = max_size;
        stack = new int[this.max_size];
    }

    // 判断栈是否已满
    public boolean isFull() {
        return this.top == this.max_size - 1;
    }

    // 判断栈是否已空
    public boolean isEmpty() {
        return top == -1;
    }

    // 入栈
    public void push(int data) {
        if (isFull()) {
            System.out.println("栈已满");
            return;
        }
        top++;
        stack[top] = data;
    }

    // 出栈
    public int pop() {
        if (isEmpty()) {
//            System.out.println("栈为空");
            throw new RuntimeException("栈为空");
        }
        int val = stack[top];
        top--;
        return val;
    }

    // 遍历输出
    public void show() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return;
        }
        for (int i = max_size - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}



