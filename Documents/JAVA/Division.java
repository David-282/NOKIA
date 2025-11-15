import java.util.Scanner;
     public class Division{
     public static void main(String[]args){
     Scanner key = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int num = key.nextInt();
     if (num % 3 == 0){
     System.out.printf("%d is divisible by 3.",num );}
else{
     System.out.printf("%d is not divisible by 3%n",num);
}

}

} 
