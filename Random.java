import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 2);
        System.out.print("Enter guess number (1 is head, 0 is tail): ");
        int number2 = input.nextInt();

        if (number1 == number2)
        System.out.println("Hoorayy You are win");

        else if (number1 == 1)
        System.out.println("Boo You are Wrong, the corrct is Head");

        else if (number1 == 0)
        System.out.println("Boo You are Wrong, the corrct is Tail");


        
    }
    
}