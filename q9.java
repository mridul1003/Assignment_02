//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.*;
public class q9 {
    public static void main(String[] args){
    System.out.println("Enter the no. of classes held");
    Scanner sc=new Scanner(System.in);
    double hclasses=sc.nextDouble();

    System.out.println("Enter the no. of classes attended");
    Scanner sc1=new Scanner(System.in);
    double aclasses=sc1.nextDouble();

    double per=(aclasses/hclasses)*100;
    if(per>=75.0 && per<100){
        System.out.println("Your attendance is "+per);
        System.out.println("You are allowed to give exams!");
    }
    else if(per<75.0){
        System.out.println("Your attendance is "+per);
        System.out.println("Do you have a medical leave? Press capital 'Y' for yes and capital 'N' for no.");

        Scanner sc2=new Scanner(System.in);
        String ans=sc2.nextLine(); 
        if(ans=="Y"){
            System.out.println("You are allowed to give exams!");
        }
        else{
        System.out.println("You are not allowed to give exams!");
    }}
    else{
        System.out.println("Invalid no. of classes entered");
    }
}
}