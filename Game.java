import java.util.*;
public class Game {
    public static void main(String [ ] args) {
		int monHP = 100;
		int attack=0;
		int weapon;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Monster Life:"+monHP);
		System.out.println("Choose your weapon?");
		System.out.println("1.Sword");
		System.out.println("2.Gun");
		System.out.println("3.Magic");
		System.out.print("Choose:");
		weapon = keyboard.nextInt();
		if (weapon == 1)
			attack= 15;
		else if (weapon == 2)
			attack = 18;
		else if (weapon == 3)
			attack = 24;
		else
			attack = 0;

		monHP = monHP-attack;
		System.out.println("Your hit: " + attack + "and monster life: " + monHP);

	}

}
