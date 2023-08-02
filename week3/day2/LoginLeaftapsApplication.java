package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftapsApplication {
public static void main(String[] args) {
	//launch the chrome browser
	ChromeDriver driver= new ChromeDriver();
	//load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	
}
}
