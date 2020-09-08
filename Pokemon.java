import java.util.*;

public class Pokemon{
    public static void main(String[] args) {
        System.out.println("The Pokemon trainer assistance");
        System.out.println("Select the throw style");
        System.out.println("1.Poke Ball");
        System.out.println("2.Ultra Ball");
        System.out.println("3.Ultra Ball, Razz Berry");
        System.out.println("4.Ultra Ball, Razz Berry, Curveball");
        System.out.print("Enter: ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        double captureRate = 0;
        double pokeball = 1, ultraball = 2, razzBerry = 1.2, curveBall=1.4;
        double pickachuCaptureRate = 0.2;
        switch (menu) {
            case 1:captureRate = pickachuCaptureRate*pokeball;
                break;
            case 2:captureRate = pickachuCaptureRate*ultraball;
                break;
            case 3:captureRate = pickachuCaptureRate*ultraball*razzBerry;
                break;
            case 4:captureRate = pickachuCaptureRate*ultraball*razzBerry*curveBall;
                break;
            default:System.out.println("Error!! wrong input");
                break;
        }
        System.out.print("The capture rate of Pickachu is "+captureRate*100+" %");
        
    }
}