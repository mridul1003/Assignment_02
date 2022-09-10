//Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1
import java.util.*;
public class q7 {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        double no=sc.nextDouble();

        if(no>0){
            System.out.println(no);
        }
        else if(no<0){
            System.out.println(-1*no);
        }
        else{
            System.out.println(0);
        }

    }
    
}