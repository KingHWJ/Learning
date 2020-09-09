package Demo3;
/*
内部类
1、成员内部类
2、局部内部类
3、匿名内部类
 */
public class Outer {
    int num = 30;
    // 成员内部类
    public class Inner{
        int num = 20;
        public void method(){
            int num = 10;
            System.out.println(num);    // 10
            System.out.println(this.num); // 20
            System.out.println(Outer.this.num); // 30
        }
    }
    Inner inner = new Inner();

    // 局部内部类（方法内部）
    public void method(){
        class Inner{
            /*
            从java 8 开始，只要局部变量事实不变，final关键字可以省略
            原因：
            1.new出来的对象在堆内存当中
            2.局部变量是跟着方法走的，在栈内存当中
            3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
            4.但是new出来的对象会再堆中持续存在，直到垃圾回收消失
             */
            int num = 1;
            public void method(){
                System.out.println(num);            // 1
                System.out.println(this.num);       // 1
                System.out.println(Outer.this.num); // 30
            }
        }
        Inner inner = new Inner();
        inner.method();
    }
}
