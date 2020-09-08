
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length:");
        length = input.nextInt();
        System.out.print("Enter width:");
        width = input.nextInt();
        area = length*width;
        System.out.println("The area of regtangle is "+area);
    }

}