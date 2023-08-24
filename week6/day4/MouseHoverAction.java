package week6.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) {
		//Action---->Interface
		//Actions -->class
		//launch  chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.flipkart.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//close  lo0gin popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions builder=new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		//WebElement tShirt = driver.findElement(By.xpath("(//a[contains(text(),'T-Shirts')])[1]"));
		builder.moveToElement(fashion).perform();
		 driver.findElement(By.xpath("(//a[contains(text(),'T-Shirts')])[1]")).click();
		
		
	}
}
