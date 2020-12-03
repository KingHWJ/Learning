package DataStructures.Stack;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        String s = "70*3+20/4-2*7+42"; // 243
//        String s = "10-2*3+200"; // 204
        System.out.printf("%s = %d", s, calculatorTest.calculate(s));
    }

    public int calculate(String s) {

        BasicStack numStack = new BasicStack(15);
        BasicStack operStack = new BasicStack(15);

        int index = 0;      // 字符串索引
        int data1 = 0;      // 数字1
        int data2 = 0;      // 数字2
        int res = 0;        // 数字计算结果
        int oper = 0;       // 操作符
        char word = ' ';
        String nums = "";

        while (true) {
            // 取一个字符
            word = s.substring(index, index + 1).charAt(0);
            // 若是字符
            if (checkChar(word)) {
                if (operStack.isEmpty()) {
                    operStack.push(word);
                } else {
                    //即便优先级小于栈中的，计算后，再插入，如果还是小于栈中的，还是要先计算再入栈
                    while (true) {
                        if(operStack.isEmpty()){
                            operStack.push(word);
                            break;
                        }
                        if (priority(word) > priority(operStack.peak())) {
                            operStack.push(word);
                            break;
                        }
                        data2 = numStack.pop();
                        data1 = numStack.pop();
                        oper = operStack.pop();
                        res = deal(data1, data2, oper);
                        numStack.push(res);
                    }
                }
            } else {
                // 若是数字，若不是个位数
//                numStack.push(word - 48);  // 目前只考虑一位数
                // 只有在后面吗一个字符是操作符，或到字符尽头，才进压栈
                // 判断下一位是不是数字
                nums += word;
                // 针对最后一个数
                if (index == s.length() - 1) {
                    numStack.push(Integer.parseInt(nums));
                } else {
                    // 如果后面是操作符
                    if (checkChar(s.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(nums));
                        nums = "";
                    }
                }
            }
            index++;
            if (index >= s.length()) {
                break;
            }
        }

        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            data2 = numStack.pop();
            data1 = numStack.pop();
            oper = operStack.pop();
            res = deal(data1, data2, oper);
            numStack.push(res);
        }
        return numStack.pop();
    }

    // 判断是不是一个运算符
    public boolean checkChar(char oper) {
        return oper == '+' || oper == '-' || oper == '*' || oper == '/';
    }

    // 返回运算符的优先级
    public int priority(int oper) {
        if (oper == '+' || oper == '-') {
            return 1;
        } else if (oper == '*' || oper == '/') {
            return 2;
        } else
            return -1;
    }

    // 计算
    public int deal(int data1, int data2, int operator) {
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
