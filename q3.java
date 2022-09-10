//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        System.out.print("Enter number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        if(num1>10){
            int pay=(num1*90);
            System.out.print(pay);
        }
        else{
            int pay=(num1*100);
            System.out.print(pay);
        }


    }
    
}