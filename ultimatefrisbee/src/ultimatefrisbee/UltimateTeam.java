package ultimatefrisbee;

/*
 * Name: Joseph Liang
 * Date: 4/11/21
 * Purpose: Use the created class hierarchy to print out information about an ultimate frisbee team
 */

public class UltimateTeam {

	UltimatePlayer[] players;
	Coach[] coaches;
	
	public UltimateTeam(UltimatePlayer[] ps, Coach[] cs) {
		players = ps;
		coaches = cs;
	}
	
	public String getCutters() {
		String s = "";
		for (int i = 0; i < players.length; i++) {
			if (players[i].getPosition() == Position.CUTTER) {
				s += players[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public String getHandlers() {
		String s = "";
		for (int i = 0; i < players.length; i++) {
			if (players[i].getPosition() == Position.HANDLER) {
				s += players[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public String getPlayers() {
		String s = "";
		for (int i = 0; i < players.length; i++) {
			s += players[i].toString() + "\n";
		}
		return s;
	}
	
	public String getCoaches() {
		String s = "";
		for (int i = 0; i < coaches.length; i++) {
			s += coaches[i].toString() + "\n";
		}
		return s;
	}
	
	public String toString() {
		return "**TEAM**\n\n**COACHES**\n" + getCoaches() + "\n**PLAYERS**\n" + getPlayers() + "\n**CUTTERS**\n" + getCutters() + "\n**HANDLERS**\n" + getHandlers();
	}
	
}
