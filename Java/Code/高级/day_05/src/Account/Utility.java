package Account;

import java.util.Scanner;

public class Utility {

    public static char choose(){
        Scanner sc = new Scanner(System.in);
        for(;;){
            char button = sc.next().charAt(0);
            if( button == '1' || button == '2' || button == '3' || button == '4' ){
                return button;
            }else{
                System.out.println("                  输入错误，请重新输入");
            }

        }
    }
}
