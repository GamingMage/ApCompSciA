package ultimatefrisbee;

public class UltimateFrisbeeRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Test 1\nStudent Response:");
		Person me = new Person("Mr.", "Rakow");
		System.out.println(me);
		System.out.println("Expected Response:");
		System.out.println("Rakow, Mr.");
		if(me.toString().equals("Rakow, Mr."))
			System.out.println("Test 1 Passed\n");
		else
			System.out.println("Test 1 Failed\n");
		
		System.out.println("Test 2\nStudent Response:");
		UltimatePlayer up1 = new UltimatePlayer("First1", "Last1", Position.CUTTER);
		System.out.println(up1);
		System.out.println("Expected Response:");
		System.out.println("Last1, First1\n\tJersey #: 1\n\tPosition: CUTTER");
		if(up1.toString().equals("Last1, First1\n\tJersey #: 1\n\tPosition: CUTTER"))
			System.out.println("Test 2 Passed\n");
		else
			System.out.println("Test 2 Failed\n");
		
		System.out.println("Test 3\nStudent Response:");
		UltimatePlayer up2 = new UltimatePlayer("First2", "Last2", Position.HANDLER);
		System.out.println(up2);
		System.out.println("Expected Response:");
		System.out.println("Last2, First2\n\tJersey #: 2\n\tPosition: HANDLER");
		if(up2.toString().equals("Last2, First2\n\tJersey #: 2\n\tPosition: HANDLER"))
			System.out.println("Test 3 Passed\n");
		else
			System.out.println("Test 3 Failed\n");
		
		System.out.println("Test 4\nStudent Response:");
		UltimatePlayer up3 = new UltimatePlayer("First3", "Last3", Position.HANDLER);
		System.out.println(up3);
		System.out.println("Expected Response:");
		System.out.println("Last3, First3\n\tJersey #: 3\n\tPosition: HANDLER");
		if(up3.toString().equals("Last3, First3\n\tJersey #: 3\n\tPosition: HANDLER"))
			System.out.println("Test 4 Passed\n");
		else
			System.out.println("Test 4 Failed\n");
		
		System.out.println("Test 5\nStudent Response:");
		System.out.println(up2.getPosition());
		System.out.println("Expected Response:");
		System.out.println("HANDLER");
		if(up2.getPosition().toString().equals("HANDLER"))
			System.out.println("Test 5 Passed\n");
		else
			System.out.println("Test 5 Failed\n");
		
		System.out.println("Test 6\nStudent Response:");
		Captain c1 = new Captain("First4", "Last4", Position.HANDLER, true);
		System.out.println(c1);
		System.out.println("Expected Response:");
		System.out.println("Last4, First4\n\tJersey #: 4\n\tPosition: HANDLER\n\tCaptain: offense");
		if(c1.toString().equals("Last4, First4\n\tJersey #: 4\n\tPosition: HANDLER\n\tCaptain: offense"))
			System.out.println("Test 6 Passed\n");
		else
			System.out.println("Test 6 Failed\n");
		
		System.out.println("Test 7\nStudent Response:");
		Captain c2 = new Captain("First5", "Last5", Position.CUTTER, false);
		System.out.println(c2);
		System.out.println("Expected Response:");
		System.out.println("Last5, First5\n\tJersey #: 5\n\tPosition: CUTTER\n\tCaptain: defense");
		if(c2.toString().equals("Last5, First5\n\tJersey #: 5\n\tPosition: CUTTER\n\tCaptain: defense"))
			System.out.println("Test 7 Passed\n");
		else
			System.out.println("Test 7 Failed\n");
		
		System.out.println("Test 8\nStudent Response:");
		Coach coach1 = new Coach("First6", "Last6", "Head Coach");
		System.out.println(coach1);
		System.out.println("Expected Response:");
		System.out.println("Last6, First6\n\tRole: Head Coach");
		if(coach1.toString().equals("Last6, First6\n\tRole: Head Coach"))
			System.out.println("Test 8 Passed\n");
		else
			System.out.println("Test 8 Failed\n");
		
		System.out.println("Test 9\nStudent Response:");
		Coach coach2 = new Coach("First7", "Last7", "Assistant Coach");
		System.out.println(coach2);
		System.out.println("Expected Response:");
		System.out.println("Last7, First7\n\tRole: Assistant Coach");
		if(coach2.toString().equals("Last7, First7\n\tRole: Assistant Coach"))
			System.out.println("Test 9 Passed\n");
		else
			System.out.println("Test 9 Failed\n");
		
		UltimatePlayer[] myUPS = {up1, up2, up3, c1, c2};
		Coach[] myCS = {coach1, coach2};
		UltimateTeam myUT = new UltimateTeam(myUPS, myCS);
		
		System.out.println("Test 10\nStudent Response:");
		System.out.println(myUT.getCutters());
		System.out.println("Expected Response:");
		System.out.println("**CUTTERS**\nLast1, First1\n\tJersey #: 1\n\tPosition: CUTTER\nLast5, First5\n\tJersey #: 5\n\tPosition: CUTTER\n\tCaptain: defense");
		if(myUT.getCutters().toString().equals("**CUTTERS**\nLast1, First1\n\tJersey #: 1\n\tPosition: CUTTER\nLast5, First5\n\tJersey #: 5\n\tPosition: CUTTER\n\tCaptain: defense"))
			System.out.println("Test 10 Passed\n");
		else if(myUT.getCutters().toString().equals("**CUTTERS**\nLast1, First1\n\tJersey #: 1\n\tPosition: CUTTER\nLast5, First5\n\tJersey #: 5\n\tPosition: CUTTER\n\tCaptain: defense\n"))
			System.out.println("Test 10 Passed\n");
		else
			System.out.println("Test 10 Failed\n");
		 
		System.out.println("Test 11\nStudent Response:");
		System.out.println(myUT.getHandlers());
		System.out.println("Expected Response:");
		System.out.println("**HANDLERS**\nLast2, First2\n\tJersey #: 2\n\tPosition: HANDLER\nLast3, First3\n\tJersey #: 3\n\tPosition: HANDLER\nLast4, First4\n\tJersey #: 4\n\tPosition: HANDLER\n\tCaptain: offense");
		if(myUT.getHandlers().toString().equals("**Handlers**\nLast2, First2\n\tJersey #: 2\n\tPosition: HANDLER\nLast3, First3\n\tJersey #: 3\n\tPosition: HANDLER\nLast4, First4\n\tJersey #: 4\n\tPosition: HANDLER\n\tCaptain: offense"))
			System.out.println("Test 11 Passed\n");
		else if(myUT.getHandlers().toString().equals("**HANDLERS**\nLast2, First2\n\tJersey #: 2\n\tPosition: HANDLER\nLast3, First3\n\tJersey #: 3\n\tPosition: HANDLER\nLast4, First4\n\tJersey #: 4\n\tPosition: HANDLER\n\tCaptain: offense\n"))
			System.out.println("Test 11 Passed\n");
		else
			System.out.println("Test 11 Failed\n");
		
		System.out.println("Test 12\nStudent Response:");
		System.out.println(myUT);
	}

}
