package DataStructures.Queue;

import java.util.Scanner;

// 数组实现环形队列
public class CircleArrayQueue {

    private int max_size;
    private int front;        // 头指针，初始为0
    private int rear;         // 尾指针，初始为0，默认指向最后一个元素的后一个位置
    private int[] arrayQueue; // 存储数据

    public CircleArrayQueue(int arrayMaxSize) {
        max_size = arrayMaxSize;
        arrayQueue = new int[max_size];
    }

    // 判断队列是否满了 约定空出一个空间，
    public boolean isFull() {
        return (rear + 1) % max_size == front;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    // 添加数据
    public void add(int data) {
        if (isFull()) {
            System.out.println("队列已满，无法添加数据~");
        }
        arrayQueue[rear] = data;
        // 移动指针 必须考虑取模，如果只是r + 1，则有可能越界
        rear = (rear + 1) % max_size;
    }

    // 取一个数
    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取出数据~");

        }
        // 先把front 对应的值保留到一个临时变量，一定要存储，否则无法返回
        // 将front 右移，考虑取模，否则越界
        // 将临时变量返回
        int temp = arrayQueue[front];
        front = (front + 1) % max_size;
        return temp;
    }

    // 展示队列全部数据
    public void show() {
        if (isEmpty()) {
            System.out.println("队列为空，没有数据~");
            return;
        }
        // 遍历从front开始
        // 环形结构，i 超出数组长度，取模会跳到前面
        for (int i = front; i < front + size(); i++) {
            System.out.printf("array[%d] = %d", i % max_size, arrayQueue[i % max_size]);
            System.out.println("");
        }
    }

    // 显示当前队列头部数据
    public void showHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有头部数据~");
        }
        System.out.println("当前头部数据为：" + arrayQueue[front]);
    }

    // 当前数据有效个数
    public int size() {
        // (max_size - front)  + (0 + rear)
        return (max_size - front + rear) % max_size;
    }

    public static void main(String[] args) {

        CircleArrayQueue arrayQueue = new CircleArrayQueue(5);
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
                        System.out.println("取出一个数：" + num);
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
