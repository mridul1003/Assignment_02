//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

import java.util.*;
public class q8 {
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
        System.out.println("You are not allowed to give exams!");
    }
    else{
        System.out.println("Invalid no. of classes entered");
    }
}
}