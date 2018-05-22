package virtualPet;

public class VirtualPet {

	// VirtualPet virtualPet = new VirtualPet("Grendel the Troll");

	public String petName = "Grendel The Troll";

	public void displayStats() {
		System.out.println("Grendel the Troll");
		System.out.println("Bloodlust : " + bloodLust);
		System.out.println("Health : " + health);
		System.out.println("Bridge Tolls Collected: " + trollToll);
		System.out.println("Wit: " + wit);
	}

	public int bloodLust = 0;
	public int trollToll = 0;
	// use currency for toll
	public int wit = 50;
	public int health = 100;

	public void tick() {
		bloodLust += 10;
		health -= 5;
		trollToll += 5;

		if (health < 0) {
			System.out.println("You crawl under your bridge and die!");
			System.exit(0);
		}
		if (bloodLust > 50) {
			System.out.println("You're a monster! Your strenghth begins to fade...");
			health -= 10;
		}
		if (wit > 75) {
			System.out.println("You use your cunning to collect more tolls.");
			trollToll += 15;
		}
		if (trollToll > 200) {
			System.out.println("Congratulations! You've collected enough tolls to retire!");
			System.exit(0);
		}
	}

	public VirtualPet() {

	}

	public VirtualPet(String string) {
	}

	public int getBloodLust() {
		return bloodLust;
	}

	public int getHealth() {
		return health;
	}

	private int getbloodLust() {
		return bloodLust;
	}

	public int getTrollToll() {
		return trollToll;
	}

	public int getincreaseBloodLust() {
		bloodLust += 10;
		return bloodLust;
	}
	
	public int getdecreaseBloodLust() {
		bloodLust -= 10;
		return bloodLust;
	}

	public int getincreaseTrollToll() {
		trollToll += 50;
		return trollToll;
	}

	public int getdecreaseTrollToll() {
		trollToll -= 25;
		return trollToll;
	}

	public int getdecreaseHealth() {
		health -= 25;
		return health;
	}

	public int getincreaseHealth() {
		health += 25;
		return health;
	}

	private int gettrollToll() {
		return trollToll;
	}

	public int getWit() {
		return wit;
	}

	public int getincreaseWit() {
		wit += 10;
		return wit;
	}

	public int getdecreaseWit() {
		wit -= 10;
		return wit;

	}

}
