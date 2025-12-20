//calculating the area of circle using input from user
import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the radius of circle ");
    float radius = sc.nextFloat();
    // double area = (3.14*radius*radius);
    float area = (3.14f*radius*radius);
    System.out.println("The area of circle is: "+area);    
    }
}
