package Account;

import java.util.Scanner;

public class FamilyAccount {

    public static void main(String[] args) {
        for(;;){
            System.out.println("----------------家庭收支记账软件----------------");
            System.out.println("                  1.收支明细");
            System.out.println("                  2.登记收入");
            System.out.println("                  3.登记支出");
            System.out.println("                  4.退   出");
            System.out.println("");
            System.out.print("                  请选择<1-4>:");

            char button = Utility.choose();
            if(button == '1'){
                System.out.println("");
            }
            System.out.println(button);
        }


    }
}
