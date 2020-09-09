public class Pay {
    public static void main(String[] args) {
        Order ord1 = new Order();
        ord1.id = 11231314144L;
        ord1.user = "hwj";
        ord1.GetPassword("255555");
    }
}


class Order{
    // 订单类
    long id;        // 订单id
    String user;    // 用户
    double amt;     // 金额
    String password = "abcdefg";    // 支付密码

    public void GetPassword(String password){

        this.password = password;

    }

}
