package week7.day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
public static void main(String[] args) throws InterruptedException {
	//launch  chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.myntra.com/");
    //maximize the browser
	driver.manage().window().maximize();
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
	
	WebElement tShirt = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]"));
	
	
	Actions builder=new Actions(driver);
	builder.moveToElement(kids).pause(2000).click(tShirt).perform();
	//builder.moveToElement(kids).perform();
	
	//builder.click(tShirt).perform();


}
}
