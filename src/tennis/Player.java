package tennis;

public class Player {
	
	private String name;
	
	private int score = 0;
	
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public void winBall() {
		score++;
	}
	
	
	public String getSoreDescription() {
		
		String description;
		switch (score) {
		
			case 0:  description = "love";
			break;
			
			case 1:  description = "fifteen";
			break;
			
			case 2:  description = "thirty";
			break;
			
			case 3:  description = "forty";
			break;
			
			default: description = "N/A";
			break;
		}
		
		return description;
	}
	 

}
