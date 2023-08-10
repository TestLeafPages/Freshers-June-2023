package week4.day4;

public class Mobile implements AndroidDesign {

	public void makeCAll() {
		System.out.println("Make call");
		
	}

	public void sendMessage() {
		System.out.println("Send Message");
		
	}

	public void playingGames() {
		System.out.println("Playing Games");
		
	}

	public void calendar() {
		System.out.println("Calendar");
		
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.calendar();
		mob.playingGames();
		mob.makeCAll();
		mob.sendMessage();
		
	}

}
