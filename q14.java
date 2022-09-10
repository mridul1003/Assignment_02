//A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one.
import java.util.Scanner;
//import java.lang.Math;
public class q14 {
    public static void main(String[] args){
        int sum=0,dig=0;
        System.out.println("Enter a 4 digit number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=0;i<4;i++){
            dig=num%10;
            sum=sum*10+dig;
            num=num/10;
        }
        System.out.println(sum);
    }
    
}