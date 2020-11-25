package DataStructures.Queue;

import java.util.Scanner;

// 数组实现队列
public class ArrayQueue {

    private int max_size;
    private int front;        // 头指针，取数用
    private int rear;         // 尾指针，存数用
    private int[] arrayQueue; // 存储数据

    public ArrayQueue(int arrayMaxSize) {
        max_size = arrayMaxSize;
        arrayQueue = new int[max_size];
        front = -1;
        rear = -1;
    }

    // 判断队列是否满了
    public boolean isFull() {
        if (rear == max_size - 1) {
            return true;
        }
        return false;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    // 添加数据
    public void add(int data) {
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加数据~");
//            System.out.println("队列已满，无法添加数据~");
        }
        rear++;     // 尾指针后移
        arrayQueue[rear] = data;
    }

    // 取一个数
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取出数据~");
//            System.out.println("队列已满，无法添加数据~");
        }
        front++;    // 头指针后移
        return arrayQueue[front];
    }

    // 展示队列全部数据
    public void show() {
        for (int i = 0; i < arrayQueue.length; i++) {
            System.out.printf("array[%d] = %d\n", i, arrayQueue[i]);
        }
    }

    // 显示当前队列头部数据
    public void showHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有头部数据~");
        }
        System.out.println("当前头部数据为：" + arrayQueue[front + 1]);
    }

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);
        a:
        {
            while (true) {
                System.out.println("-----------------");
                System.out.println("(a)添加数据");
                System.out.println("(g)取出数据");
                System.out.println("(h)显示当前头部数据");
                System.out.println("(s)显示全部");
                System.out.println("(e)退出");
                System.out.println("\n请输入：");
                Scanner scanner = new Scanner(System.in);
                char button = scanner.next().charAt(0);
                switch (button) {
                    case 'a':
                        System.out.print("请输入数据：");
                        arrayQueue.add(scanner.nextInt());
                        break;
                    case 'g':
                        int num = arrayQueue.get();
                        System.out.println("取出一个数："+num);
                        break;
                    case 'h':
                        arrayQueue.showHead();
                        break;
                    case 's':
                        arrayQueue.show();
                        break;
                    case 'e':
                        System.out.println("已退出");
                        break a;
                }

                // switch表达式新特性
                /*
                    每一个->后面只允许接一个表达式、一个代码块、或者一个throw语句
                switch (button) {
                    case 'a' ->  System.out.print("请输入数据：");
                    case 'b' ->  System.out.print("请输入数据：");
                    case 'c' ->  System.out.print("请输入数据：");
                    case 'd' ->  System.out.print("请输入数据：");
                }
                 */

            }
        }
    }
}
