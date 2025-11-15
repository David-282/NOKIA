import java.util.Scanner;
     public class SperatingDigits{
     public static void main(String[]args){
     Scanner word = new Scanner(System.in);
     System.out.print("Input one number consisting of five digits: ");
     int digits = word.nextInt();
     int divOne = digits/10000;
     int divTwo = (digits/1000) % 10;
     int divThree = (digits/100) % 10;
     int divFour = (digits/10) % 10;
     int divFive = digits % 10;
     System.out.printf("%d   %d   %d   %d   %d",divOne,divTwo,divThree,divFour,divFive);

}
}
