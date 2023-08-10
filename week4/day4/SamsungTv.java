package week4.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract  class SamsungTv implements SamsungDesign, AndroidTVDesign {
	
	public  void voiceRecognition() {
		System.out.println("Voice Recognition");
	}
	
	public abstract  void samsungGalaxy();

	
}
