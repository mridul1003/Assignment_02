//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
import java.util.*;
public class q4 {
    public static void main(String[] args){
        System.out.print("Enter Salary");
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();

        System.out.print("Enter years of service");
        Scanner sc1=new Scanner(System.in);
        double yos=sc1.nextDouble();

        if(yos>5){
            double bonus=(0.05*salary);
            System.out.print("Your bonus is "+bonus);
        }
        else{
            double bonus=0;
            System.out.println("Sorry you do not have any pending bonuses.");
        }
    }
    
}