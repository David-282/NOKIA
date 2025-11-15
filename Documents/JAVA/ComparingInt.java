import java.util.Scanner;
     public class ComparingInt{
     public static void main(String[]agrs){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the first integer: ");
     int firstNum = input.nextInt();
     int square = firstNum * firstNum;
     if (firstNum > 100){
     System.out.println("The number is greater than 100 ");}
     if (firstNum < 100){
     System.out.println("The number is less than 100 ");}
     if(firstNum == 100)
     System.out.println("The number is equal to 100 ");
     if (firstNum != 100){
     System.out.println("The number is not equal to 100 ");}
     if (square > 100){
     System.out .println("The Square is greater than 100 ");}
     if (square < 100) {  
     System.out.println("The Square is less than 100 ");}
     if(square == 100){
     System.out.println("The Square is equal to 100 ");}
     if (firstNum != 100){
     System.out.println("The Square is not equal to 100 ");}

}
}
