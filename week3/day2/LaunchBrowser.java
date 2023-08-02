package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//launch the chrome browser
	ChromeDriver driver= new ChromeDriver();
	//load the application url
	driver.get("https://www.facebook.com/");
	//maximize the browser
	driver.manage().window().maximize();
	
}
}
