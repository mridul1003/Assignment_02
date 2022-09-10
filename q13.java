//Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//And any other input of age should print "ERROR".
import java.util.Scanner;
public class q13 {
    public static void main(String[] args){

        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        System.out.println("Enter your gender");
        Scanner sc1=new Scanner(System.in);
        char sex=sc1.next().charAt(0);

        System.out.println("Enter marital status");
        Scanner sc2=new Scanner(System.in);
        char ms=sc2.next().charAt(0);

        if(age<20 || age>60){
            System.out.println("ERROR");
        }
        else if(sex=='F' || age>=40 && age<=60 || sex=='f'){
            System.out.println("You may only work in urban areas");
        }
        else{
            System.out.println("You may work anywhere");
        }
    }
    
}