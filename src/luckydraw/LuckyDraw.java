
package luckydraw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class LuckyDraw {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);
        boolean player;
        int i=1;
        int num;
        int price;
        int amount=0;
        ArrayList<Integer> arrNum = new ArrayList();
        ArrayList<Integer> arrPrice = new ArrayList();
        System.out.println("Lottery");
        do{
            player=false;
            System.out.println("\nPlayer:"+i);
            System.out.print("\nHow many number you bet :");
            int number=cin.nextInt();
            for(int j=1;j<=number;j++){
                System.out.print("\nNum"+j+" :");
                num=cin.nextInt();
                arrNum.add(num);
                System.out.print("Price:");
                price=cin.nextInt();
                arrPrice.add(price);
            }
            Random obj = new Random();
            int result = obj.nextInt(100);
            System.out.println("\nResult:"+result);
            boolean x=false;
            for(int k=0;k<arrNum.size();k++){
                if(result==arrNum.get(k)){
                    amount=arrPrice.get(k);
                    x=true;
                }
            }
            if(player==true){
                System.out.println("\nAmount:" + (amount*80));
                System.out.println("You Win"); 
            }else{
                System.out.println("You Lost");
            }
            System.out.print("Play again:");
            String con=cin.next();
            if(con.equalsIgnoreCase("y")){
                player=true;
                arrNum.clear();
                arrPrice.clear();
                i++;
            }else {
                player=false;
            }
        }while(player==true);
    }
}
