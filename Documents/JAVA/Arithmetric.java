import java.util.Scanner;
     public class Arithmetric{
     public static void main(String[]args){
        Scanner key = new Scanner(System.in);
          System.out.print("Enter first interger: ");
          double numOne = key.nextDouble();
          System.out.print("Enter the second interger:  ");      
          double numTwo = key.nextDouble();
          double squareOne = numOne*numOne;
          System.out.println("The square of the first integer is " + squareOne);
          double squareTwo = numTwo*numTwo;
          System.out.println("The square of the second integer is " +  squareTwo);
           double sumSquare = squareOne + squareTwo;
           System.out.println("The sum of their squares is " + sumSquare);
           double diffSquare = squareOne - squareTwo;  
          System.out.println("The difference of their squares is " + diffSquare );
}
}

