
public class Game {
	
	private int round;
	
	private int actPlayer;
	
	public int getRound() {
		
		return round;
		
	}

	public void setRound(int round) {
		
		this.round = round;
		
	}

	public int getActPlayer() {
		
		return actPlayer;
		
	}

	public void setActPlayer(int actPlayer) {
		
		this.actPlayer = actPlayer;
		
	}
	
	public static int randomNumber() {
		
		int random = (int)(Math.random()*16);
		
		return random;		
		
	}
	
	 public static void main(String[] args){
		 
	        System.out.println(randomNumber());
	    } 
}
