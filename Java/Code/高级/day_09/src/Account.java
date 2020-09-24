public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取钱方法
    public void withDraw(double amount){
        if(amount > this.balance){
            System.out.println("对不起，余额不足！");
        }else{
            System.out.println("取款成功！");
            this.balance -= amount;
        }
    }

    // 存钱方法
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("存款成功！");

    }

    // 查询余额
    public void show(){
        System.out.println("目前余额为：" + this.balance);
    }
}
