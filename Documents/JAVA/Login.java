import java.util.Scanner;
     public class Login{
     public static void main(String[]args){

     int pincode = 246801;
     String username = "Kabiyesi";

     Scanner door = new Scanner(System.in);
     System.out.print("Input Username: ");
     String user = door.nextLine();
     System.out.print("Input Pin Code: ");
     int pin = door.nextInt();

     if(user.equals(username) && pin == pincode){
     System.out.println("Login Sucessful");
     }
     else {
     System.out.println("Login Failed");
     }
}
}
