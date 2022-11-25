package Basics;


public class Player {
	
		private int playerId;
		private String playerName;
		private int playerAge;
		private String playerMob;
		private String playerEmail;
		private String gameType;
		
		public int getPlayerId() {
			return playerId;
		}
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}
		public String getPlayerName() {
			return playerName;
		}
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		public int getPlayerAge() {
			return playerAge;
		}
		public void setPlayerAge(int playerAge) {
			this.playerAge = playerAge;
		}
		public String getPlayerMob() {
			return playerMob;
		}
		public void setPlayerMob(String playerMob) {
			this.playerMob = playerMob;
		}
		public String getPlayerEmail() {
			return playerEmail;
		}
		public void setPlayerEmail(String playerEmail) {
			this.playerEmail = playerEmail;
		}
		public String getGameType() {
			return gameType;
		}
		public void setGameType(String gameType) {
			this.gameType = gameType;
		}
		
		public void player()
		{
			
		}
		
		public Player(int playerId, String playerName, int playerAge, String playerMob, String playerEmail,
				String gameType) {
			super();
			this.playerId = playerId;
			this.playerName = playerName;
			this.playerAge = playerAge;
			this.playerMob = playerMob;
			this.playerEmail = playerEmail;
			this.gameType = gameType;
		}	
}
