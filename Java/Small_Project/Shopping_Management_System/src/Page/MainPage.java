package Page;

import ScannerGet.ScannerString;

// 主程序人口
public class MainPage {
    public static void main(String[] args) {

        mainPage();
//        goodsManagePage();

    }

    /**
     * 主窗口界面，调用函数
     */
    public static void mainPage() {
        System.out.println("************************************");
        System.out.println("");
        System.out.println("            1.商品维护");
        System.out.println("");
        System.out.println("            2.前台收银");
        System.out.println("");
        System.out.println("            3.商品管理");
        System.out.println("");
        System.out.println("************************************");
        System.out.print("请选择，输入数字或者按0退出：");
        do {
            String num = new ScannerString().getNum();
            if(num.matches("[0-3]")){
                switch (num) {
                    case "1":
                        goodsManagePage();
                        break;
                    case "2":
                        counterLoginPage();
                        break;
                    case "3":
                        goodsDealPage();
                        break;
                    case "0":
                        System.out.println("----------------");
                        System.out.println("您已经退出系统了！");
                        System.exit(1);
                }
            }else{
                System.out.println("！您输入有误");
                System.out.print("请重新输入或按0退出：");
            }
        }
        while (true);
    }

    /**
     * 商品维护界面
     */
    public static void goodsManagePage() {
        System.out.println("执行显示商品维护菜单");
        System.out.println("商超购物管理系统>>商品维护");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("            1.添加商品");
        System.out.println("            2.更改商品");
        System.out.println("            3.删除商品");
        System.out.println("            4.显示所有商品");
        System.out.println("            5.查询商品");
        System.out.println("");
        System.out.println("************************************");
        System.out.println("请选择，输入数字或者按0返回上一级菜单：");
    }


    /**
     * 前台登录功能
     */
    public static void counterLoginPage(){
        System.out.println("欢迎使用商超购物管理系统");
        System.out.println("");
        System.out.println("1.登录系统");
        System.out.println("");
        System.out.println("2.退出");
        System.out.println("");
        System.out.println("****************************");

    }

    public static void goodsDealPage(){
        System.out.println("执行商品管理");
        System.out.println("");
        System.out.println("");
        System.out.println("商超购物管理系统>>商品管理");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("            1.列出当日卖出商品列表");
        System.out.println("");
        System.out.println("            2.售货员管理");
        System.out.println("");
        System.out.println("************************************");
        System.out.println("请选择，输入数字或者按0返回上一级菜单：");
    }
}
