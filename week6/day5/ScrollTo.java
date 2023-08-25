package week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollTo {
	public static void main(String[] args) {
		//Action---->Interface
		//Actions -->class
		//launch  chrome browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
				
		ChromeDriver driver=new ChromeDriver(options);
		//Load the application url
		driver.get("https://www.flipkart.com/");
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
		
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			 WebElement eleScroll = driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
				Actions builder=new Actions(driver);
				builder.scrollToElement(eleScroll).perform();
				
		}
		
		 WebElement eleScroll = driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
			Actions builder=new Actions(driver);
			builder.scrollToElement(eleScroll).perform();
		
	   
	
	}
}
