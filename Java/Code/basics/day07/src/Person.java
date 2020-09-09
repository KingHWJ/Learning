public class Person {

    String name = "王建林";

    // this 可以解决重名分不开的局面
    // this.name 是自己的名字
    // 谁调用的方法，谁就是this，即当前对象的引用
    public void show(String name){
        System.out.println(name + "你好，我是" + this.name);
        System.out.println(this);
    }
}
