public class Phone {
    // 定义一个手机类
    String brand;   // 品牌
    double price;      // 价格
    String color;   // 颜色

    // 打电话的功能
    public void call(String name){
        System.out.printf("打电话给 %s\n",name);
    }

    public void send_msg(){
        System.out.println("群发短信");
    }
}
