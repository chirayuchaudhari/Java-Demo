package Basics;

public class MainClass {

	public static void main(String[] args) {
		Player p=new Player(2, "Kunal Patil", 23, "9158865602", "kunalpatil@gmail.com", "Cricket");
		System.out.println(p.getPlayerId());
		System.out.println(p.getPlayerName());
		System.out.println(p.getPlayerAge());
		System.out.println(p.getPlayerMob());
		System.out.println(p.getPlayerEmail());
		System.out.println(p.getGameType());
		
		System.out.println("==================");
		
		p.setPlayerId(1);
		p.setPlayerName("Chirayu Chaudhari");
		p.setPlayerAge(25);
		p.setPlayerMob("8788652662");
		p.setPlayerEmail("chirayuchaudhari@gmail.com");
		p.setGameType("Boxing");
		System.out.println(p.getPlayerId());
		System.out.println(p.getPlayerName());
		System.out.println(p.getPlayerAge());
		System.out.println(p.getPlayerMob());
		System.out.println(p.getPlayerEmail());
		System.out.println(p.getGameType());
	}

}
