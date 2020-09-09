public class Student {

    // 学生类

    private String name = "张三";
    private int age = 10;
    private boolean male = false;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        if(num<100 && num >9){
            age = num;
        }else
            System.out.println("输入的年龄有误！！！");
    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }
}
