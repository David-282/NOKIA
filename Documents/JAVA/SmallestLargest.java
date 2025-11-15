import java.util.Scanner;
public class SmallestLargest{
public static void main(String[]args){
     Scanner enter = new Scanner(System.in);
     System.out.print("Enter the first integer: ");
     int numOne = enter.nextInt();
     System.out.print("Enter the second integer: ");
     int numTwo = enter.nextInt();
     System.out.print("Enter the third integer: ");
     int numThree = enter.nextInt();
     int sum = numOne + numTwo + numThree;
     int average = sum/3;
     int multiply = numOne * numTwo * numThree;
     System.out.printf("Sum of the numbers = %d%n ",sum);
     System.out.println("Average of number is  "+ average );
     System.out.println("The product of all the integer's is  "+ multiply);
     
     if (numOne > numTwo && numOne > numThree ){
     System.out.println("The Largest number is "+ numOne);}
       if (numTwo > numThree && numTwo > numOne ){
     System.out.println("The Largest number is "+ numTwo);}
      if (numThree > numTwo && numThree > numOne ){
     System.out.println("The Largest number is "+ numThree);}
     else{
     System.out.println("You entered the same number three times");}
     
     if (numOne < numTwo && numOne < numThree ){
     System.out.println("The Smallest number is "+ numOne);}
       if (numTwo < numThree && numTwo < numOne ){
     System.out.println("The Smallest number is "+ numTwo);}
      if (numThree < numTwo && numThree < numOne ){
     System.out.println("The Smallest number is "+ numThree);}
 else{
     System.out.println("You entered the same number three times");}
     

     
     
     
}
}
