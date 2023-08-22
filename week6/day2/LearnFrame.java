package week6.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) throws InterruptedException {
	//launch  chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/frame.xhtml");
    //maximize the browser
	driver.manage().window().maximize();
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//controll move to frame
	driver.switchTo().frame(0);
	
	WebElement eleFrame1 = driver.findElement(By.id("Click"));
	eleFrame1.click();
	String text = eleFrame1.getText();
	System.out.println(text);
	
	//control move to main webpage
	driver.switchTo().defaultContent();

}
}
