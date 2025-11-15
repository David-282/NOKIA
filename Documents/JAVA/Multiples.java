import java.util.Scanner;
public class Multiples{
public static void main(String[]args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the first integrer: ");
     int firstNum = input.nextInt();
     System.out.print("Enter the second interger: ");
     int secondNum = input.nextInt();
     int tripled =  firstNum *  3;
     int doubled =  secondNum * 2;
     
     if (doubled % tripled == 0){
     System.out.println("The first number tripled is a multiple of the second number double"  );}
     else{
     System.out.println("The first number tripled is not a multiple of the second number double");}
     
}
}
