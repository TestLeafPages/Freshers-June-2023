package week4.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TV extends SamsungTv {

	@Override
	public void faceAuthendication() {
	//	ChromeDriver driver=new  ChromeDriver();
	//	WebElement findElement = driver.findElement(By.id("hai"));
		System.out.println("Face Authendication");
		
	}

	@Override
	public void samsungGalaxy() {
		System.out.println("Samsung Galaxy");
		
	}
	public static void main(String[] args) {
	//	TV tv=new TV();
		//AndroidTVDesign tv =new TV();
		SamsungDesign tv =new TV();
		//SamsungTv tv=new SamsungTv();
		tv.faceAuthendication();
		//tv.samsungGalaxy();
		tv.voiceRecognition();
//		tv.enableWiFi();
//		tv.changeChennel();
//		tv.switchOnTv();
//		tv.decreseVolume();
		
		List<String> obj=new ArrayList<String>();
	}

	@Override
	public void enableWiFi() {
		// TODO Auto-generated method stub
		System.out.println("Wi-Fi");
	}

	@Override
	public void switchOnTv() {
		// TODO Auto-generated method stub
		System.out.println("Swiutch On Tv");
	}

	@Override
	public void changeChennel() {
		// TODO Auto-generated method stub
		System.out.println("Change chennel");
	}

	@Override
	public void increseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Imncrese Volume");
	}

	@Override
	public void decreseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Decrese Volume");
	}

}
