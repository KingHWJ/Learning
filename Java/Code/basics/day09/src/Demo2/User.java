package Demo2;

public class User {
    private String name;
    private double left;

    public User(){

    }

    public User(String name,double left){
        this.name = name;
        this.left = left;
    }

    public void show(){
        System.out.printf("我是%s，我的钱包余额有%.2f元\n",name,left);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLeft(double left){
        this.left = left;
    }

    public String getName(){
        return name;
    }

    public double getLeft(){
        return left;
    }
}
