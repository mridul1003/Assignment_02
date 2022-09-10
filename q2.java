//Take two int values from user and print greatest among them.
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        System.out.print("Enter number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.print("Enter number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc1.nextInt();

        if(num1>num2){
            System.out.print(num1+" is the greatest");
        }
        else if(num2>num1){
            System.out.print(num2+" is the greatest");
        }
        else{
            System.out.print(" Both values are equal");
        }


    }
    
}