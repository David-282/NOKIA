import java.util.Scanner;
     public class Temperature{
     public static void main(String[]args){
     Scanner word = new Scanner(System.in);
     System.out.print("Input Today's Temperature in your location: ");
     int temp = word.nextInt();
     if (temp <= 14){
     System.out.println("It is Cold today");}
    
     if (temp <= 30 && temp >= 15)
     {System.out.println("It is Warm today");}
     
else if(temp >= 31){
     System.out.print("It is Hot today");}

}
}
