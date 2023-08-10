package week4.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Audi extends Car{
	public void openSunRoof() {
		System.out.println("Open Sun Roof");
	}
	public static void main(String[] args) {
//		ChromeDriver driver=new ChromeDriver();
//		List<String> obj=new ArrayList<String>();
//		NoSuchElementException
		Audi audi=new Audi();
		audi.applyBreak();
		audi.soundHorn();
		audi.turnOnAc();
		audi.openSunRoof();
	}
	
}
