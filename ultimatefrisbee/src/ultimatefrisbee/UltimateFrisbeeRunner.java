package ultimatefrisbee;

public class UltimateFrisbeeRunner {

	public static void main(String[] args) {
		UltimatePlayer one = new UltimatePlayer("John", "Doe", Position.CUTTER);
		Captain two = new Captain("Jane", "Doe", Position.HANDLER, true);
		Captain three = new Captain("Bread", "Doe", Position.CUTTER, false);
		UltimatePlayer four = new UltimatePlayer("Do Bird", "Doe", Position.HANDLER);
		Coach head = new Coach("Adeer", "Doe", "Head Coach");
		Coach assist = new Coach("Aname", "Mi", "Assistant Coach");
		
		UltimatePlayer[] players = {one, two, three, four};
		Coach[] coaches = {head, assist};
		
		UltimateTeam team = new UltimateTeam(players, coaches);
		
		System.out.println(team);
		
	}

}
