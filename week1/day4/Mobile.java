package week1.day4;

public class Mobile {
 protected void sendMessage() {
	 System.out.println("Send Message");
 }
   void takePhoto() {
	 System.out.println("take Photo");
 }
 public void makeCall() {
	 System.out.println("makeCall");
 }
 private void hiddenFolders() {
	 System.out.println("hiddenFolders");
 }
 public static void main(String[] args) {
	 Mobile mob=new Mobile();
	 mob.sendMessage();
	 mob.takePhoto();
	 mob.hiddenFolders();
	 mob.makeCall();
}
}
