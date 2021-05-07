package cootiegame;

public class Cootie {
	private boolean body, head, antennae, tongue;
	private int legs, eyes;
	
	public Cootie() {
		reset();
	}
	
	public void reset() {
		body = false;
		head = false;
		antennae = false;
		tongue = false;
		legs = 0;
		eyes = 0;
	}
	
	public int roll() {
		return (int)(Math.random() * 6) + 1;
	}
	
	public String takeTurn() {
		int roll = roll();
		String out = "";
		if (roll == 1) {
			out = checkBody(roll);
		}else if (roll == 2) {
			out = checkHead(roll);
		}else if (roll == 3) {
			out = checkAntennae(roll);
		}else if (roll == 4) {
			out = checkEyes(roll);
		}else if (roll == 5) {
			out = checkTongue(roll);
		}else {
			out = checkLegs(roll);
		}
		return "You rolled a " + roll + "!\n" + out;
	}
	
	public boolean checkWin() {
		return body && head && antennae && (eyes == 2) && tongue && (legs == 6);
	}
	
	private String checkBody(int roll) {
		if (!body) {
			body = true;
			return "Your Cootie now has a Body!";
		}else {
			return "Too bad. Your Cootie already had a Body.";
		}
	}
	private String checkHead(int roll) {
		if (!body) {
			return "Darn! You can't get a Head until you have a Body!";
		}else if (!head) {
			head = true;
			return "Your Cootie now has a Head!";
		}else {
			return "Too bad. Your Cootie already had a Body.";
		}
	}
	private String checkAntennae(int roll) {
		if (!body || !head) {
			return "Darn! You can't get Antennae until you have a Head and a Body!";
		}else if (!antennae) {
			antennae = true;
			return "Your Cootie now has Antennae!";
		}else {
			return "Too bad. Your Cootie already had Antennae.";
		}
	}
	private String checkEyes(int roll) {
		if (!body || !head) {
			return "Darn! You can't get Eyes until you have a Head and a Body!";
		}else if (eyes < 2) {
			eyes++;
			return "Your Cootie now has " + eyes + " Eyes!";
		}else {
			return "Too bad. Your Cootie already had 2 Eyes.";
		}
	}
	private String checkTongue(int roll) {
		if (!body || !head) {
			return "Darn! You can't get a Tongue until you have a Head and a Body!";
		}else if (!tongue) {
			tongue = true;
			return "Your Cootie now has a Tongue!";
		}else {
			return "Too bad. Your Cootie already had a Tongue.";
		}
	}
	private String checkLegs(int roll) {
		if (!body || !head) {
			return "Darn! You can't get legs until you have a Head and a Body!";
		}else if (legs < 6) {
			legs++;
			return "Your Cootie now has " + legs + " Legs!";
		}else {
			return "Too bad. Your Cootie already had 6 Legs.";
		}
	}
	
}
