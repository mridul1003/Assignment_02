//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
public class q11 {
    public static void main(String[] args){
        System.out.println("Enter the character");
        Scanner sc=new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if(alpha>='A' && alpha <='Z'){
            System.out.println("Uppercase");
        }
        else if(alpha>='a' && alpha <='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Not an alphabet");
        }


    }
    
}