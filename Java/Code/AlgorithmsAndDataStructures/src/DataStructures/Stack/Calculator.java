package DataStructures.Stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 利用栈来实现计算器的实现
 */
public class Calculator {

    public static void main(String[] args) {

        String s = "2+3*5-6+4*1";
//        System.out.println((int) '+');   // 43
//        System.out.println((int) '-');   // 45
//        System.out.println((int) '*');   // 42
//        System.out.println((int) '/');   // 47
//        System.out.println((int) '(');   // 40
//        System.out.println((int) ')');   // 41
//        System.out.println((char) 43);
//        System.out.println((char) 45);
//        System.out.println((char) 42);
//        System.out.println((char) 47);
//        System.out.println((char) 40);
//        System.out.println((char) 41);
//
//        System.out.println("-----------------");
//        Operator operator1 = new Operator('+');
//        Operator operator2 = new Operator('-');
//        Operator operator3 = new Operator('*');
//        Operator operator4 = new Operator('\\');
//        Operator operator5 = new Operator('(');
//        Operator operator6 = new Operator(')');
//
//        System.out.println(operator1.toString());
//        System.out.println(operator2.toString());
//        System.out.println(operator3.toString());
//        System.out.println(operator4.toString());
//        System.out.println(operator5.toString());
//        System.out.println(operator6.toString());
//
//        System.out.println(s.substring(0, 3));   // 左闭右开
//        System.out.println(s.length());
        Calculator calculator = new Calculator();
        int result = calculator.calculate(s);
        System.out.println(result);
    }

    private BasicStack numStack = new BasicStack(100);          // 数字栈
    private BasicStack operStack = new BasicStack(50);         // 字符栈

    /*
    1.准备一个数字栈和一个符号栈
    2.从头开始遍历字符串
    3.如果遇到数字，则入数字栈
    3.1如果遇到字符，若符号栈中为空，则直接入栈
                  若待入栈符号优先级小于等于栈中符号，则先计算，再将计算结果入数字栈，再将待入栈符号进符号栈
                  若待入栈符号优先级大于栈中符号，则直接入栈
    4.直到最终结果弹出
     */

    public int calculate(String str) {

        // 表达式校验
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        // 清洗过后不包含空格
        // 将字符串解析成数字和操作符
        ArrayList<Operator> oper_list = new ArrayList<>();
        ArrayList<Integer> data_list = new ArrayList<>();
        ArrayList<Object> list = new ArrayList<>();
         String word = "";
        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] >= 48 && (int) chars[i] <= 57) {
                word += chars[i];
            } else if (((int) chars[i] >= 40 && (int) chars[i] <= 43) || (int) chars[i] == 45 || (int) chars[i] == 47) {
                data_list.add(Integer.valueOf(word));
                list.add(Integer.valueOf(word));
                word = "";
                word += chars[i];

                Operator operator = new Operator(word.charAt(0));
                list.add(operator);
                oper_list.add(operator);
                word = "";
            }
            if (i == chars.length - 1) {
                data_list.add(Integer.valueOf(word));
                list.add(Integer.valueOf(word));
            }
        }
        System.out.println(data_list);
        System.out.println(oper_list);
        System.out.println(list);

        int i = 0, j = 0;   // i 数据表索引，j 字符表索引
        while (true) {
            if(i == data_list.size()){
                break;
            }
            // 1.取出一个数压入数据栈
            numStack.push(data_list.get(i));
            i++;
            // 2.取出一个操作符压入字符栈
            Operator now_oper = oper_list.get(j);
            j++;
            operStack.push(now_oper.getNum());        // 压入操作符的ASCII码值
            // 3.再次取出一个数压入数据栈
            numStack.push(data_list.get(i));
            i++;
            if(j < oper_list.size()){
                // 4.再次取出一个操作符 先与栈中的操作符作比较
                Operator wait_in_oper = oper_list.get(j);
                j++;
                // 4.1 如果待压入字符的优先级小于等于 已在栈中的操作符，则需要弹出栈中操作符，和数据栈中的两个数据，
                // 计算后，结果压入数据栈，再将待压入栈压进操作符栈
                if (wait_in_oper.getPriority() <= now_oper.getPriority()) {
                    int data_2 = numStack.pop();
                    int data_1 = numStack.pop();
                    operStack.pop();    // 弹出操作符
                    int val = deal(data_1, data_2, now_oper.getData());
                    numStack.push(val);
                    now_oper = wait_in_oper;
                    operStack.push(now_oper.getNum());
                } else {
                    // 4.2 如果待压入操作符的优先级大于 已在栈中的操作符，直接压入
                    operStack.push(wait_in_oper.getNum());
                }
            }

        }
        int data_2 = numStack.pop();
        int data_1 = numStack.pop();
        return deal(data_1, data_2, (char) operStack.pop());

    }


    public boolean check(String str) {
        // 表达式校验
        char[] chars = str.toCharArray();
        return true;
    }

    public int deal(int data1, int data2, char operator) {

        int val = switch (operator) {
            case '+' -> data1 + data2;
            case '-' -> data1 - data2;
            case '*' -> data1 * data2;
            case '/' -> data1 / data2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return val;
    }

}

class Operator {

    private char data;      // 操作符
    private int num;        // 对应整型数值
    private int priority;   // 优先级大小

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Operator(char oper) {
        char[] chars = new char[]{'+', '-', '*', '/', '(', ')' };
        if ("+-*/()".indexOf(oper) != -1) {
            if ("+-".indexOf(oper) != -1) {
                data = oper;
                num = (int) oper;
                priority = 1;
            } else if ("*/".indexOf(oper) != -1) {
                data = oper;
                num = (int) oper;
                priority = 2;
            } else if ("()".indexOf(oper) != -1) {
                data = oper;
                num = (int) oper;
                priority = 3;
            }
        } else
            throw new RuntimeException("操作符错误");
    }

    @Override
    public String toString() {
        return "Operator{" +
                "data=" + data +
                ", num=" + num +
                ", priority=" + priority +
                '}';
    }
}