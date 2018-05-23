package virtualPet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet virtualPet = new VirtualPet("Grendel the Troll");

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("");

			System.out.println("Who dares cross my bridge?? Pay the toll or perish!");

			int selection = 0;

			while (selection < 1 || selection > 4) {
				System.out.println("1. Attack intruder.");
				System.out.println("2. Demand troll toll.");
				System.out.println("3. You can pass... if you solve this riddle.");
				System.out.println("4. I'd rather die than barter with a troll.");
				selection = input.nextInt();
			}

			if (selection == 1) {
				System.out.println("You attack the intruder...");
				int randomNum = ThreadLocalRandom.current().nextInt(1, 13);

				if (randomNum > 6) {
					System.out.println("You clobber the intruder and steal his coins.");
					virtualPet.getincreaseBloodLust();
					virtualPet.getincreaseTrollToll();
				} else {
					System.out.println("You are humilated and crawl back under your bridge.");
					virtualPet.getdecreaseHealth();
				}

			}
			if (selection == 2) {
				System.out.println("If you want to pass the bridge, it will be 50 coins!!!");
				int randomNum = ThreadLocalRandom.current().nextInt(1, 13);

				if (randomNum > 6) {
					System.out.println("The intruder quickly hands you his change purse.");
					virtualPet.getincreaseTrollToll();
					virtualPet.getdecreaseBloodLust();
				} else {
					System.out.println(
							"The intruder pushes you off the bridge and runs past. You drop some of your coins in the river.");
					virtualPet.getdecreaseTrollToll();
					virtualPet.getdecreaseHealth();
				}

			}
			if (selection == 3) {
				int randomNum = ThreadLocalRandom.current().nextInt(1, 13);

				if (randomNum > 6) {
					System.out.println("The intruder fails to answer your awesome riddle and pays you to cross.");
					virtualPet.getincreaseWit();
					virtualPet.getincreaseTrollToll();
					virtualPet.getincreaseHealth();
				} else {
					System.out.println("The intruder answers your riddle correctly and you reluctently let him cross.");
					virtualPet.getdecreaseWit();
				}

			}
			if (selection == 4) {
				System.out.println("Grendel cooks the intruder for his dinner!");
				System.exit(0);
			}
			System.out.println("");
			virtualPet.displayStats();
			virtualPet.tick();
		}

	}
}
