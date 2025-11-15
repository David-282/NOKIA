import java.util.Scanner;
     public class Circle{
     public static void main(String[]args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     int radius = input.nextInt();
     int diameterOne = 2 * radius;
     double pie = 3.14159;
     double circum = 2* (pie * radius);
     double areaOne = pie * (radius * radius);
     System.out.printf("The diameter of the circle is %d, the area is %f, and finally the circumference is %f",diameterOne,areaOne,circum);
}
}
