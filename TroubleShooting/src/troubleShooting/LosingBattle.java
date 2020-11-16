package troubleShooting;

public class LosingBattle {

	public LosingBattle() {
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life.\n");
		
		int hero_health = 200;
		int dead_trolls = 0;
		int troll_damage = 7;
		int hero_damage = 10;
		int troll_health = 10;
		int hero_experience = 0;
		
		while (hero_health != 0) {
			int hero_attack = hero_damage;
			int troll_attack = troll_damage;
			hero_health -= troll_damage;
			if (hero_attack >= troll_health) {
				dead_trolls ++;
				System.out.println("Your hero swings and defeats an evil troll");
				System.out.println("But your hero takes " + troll_attack + " damage points. \n");
				System.out.println("Your hero's health is now " + hero_health);
			if (dead_trolls % 10 == 0) {
				System.out.println("Your hero killed 10 trolls and gained experience.");
				hero_experience ++;
				if (hero_experience % 2 == 0) {
					System.out.println("Your hero has gained enough experience to gain more health.");
					hero_health += 5;
					System.out.println("Your hero's new health is now "+hero_health);
				}
			}
			}
		}
		System.out.println("Your hero fought valiantly and defeated " + dead_trolls + " trolls.");
		System.out.println("But your hero is dead...");
	}

	public static void main(String[] args) {
		new LosingBattle();

	}

}
