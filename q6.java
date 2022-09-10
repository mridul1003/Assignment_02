//Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.*;
public class q6{
public static void main(String[] args){

	System.out.print("Enter age 1 ");
	Scanner sc1= new Scanner(System.in);
	int age1 =sc1.nextInt();
	
	System.out.print("Enter age 2 ");
	Scanner sc2= new Scanner(System.in);
	int age2=sc2.nextInt();
	
	System.out.print("Enter age 3 ");
	Scanner sc3= new Scanner(System.in);
	int age3 =sc3.nextInt();

    //checking for largest
    if(age1>age2){
        if(age1>age3){
        System.out.println(age1+" is the greatest");
    }
        else{
            System.out.println(age3+" is the greatest");
        }
}
    else if(age2>age3){
        System.out.println(age2+" is the greatest");
    }
    else{
        System.out.println(age3+" is the greatest");
    }
	
    //checking the least
    if(age1<age2){
        if(age1<age3){
        System.out.println(age1+" is the least");
    }
        else{
            System.out.println(age3+" is the least");
        }
}
    else if(age2<age3){
        System.out.println(age2+" is the least");
    }
    else{
        System.out.println(age3+" is the least");
    }
	

	
}
}