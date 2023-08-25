package week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");

		ChromeDriver driver=new ChromeDriver(options);
		//Load the application url
		driver.get("https://jqueryui.com/selectable/");

		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//locate frame element
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	   //controll move to frame
		driver.switchTo().frame(eleFrame);
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions builder=new Actions(driver);
		
		//builder.click(ele1).click(ele2).click(ele3).click(ele4).click(ele5).perform();
	
	//builder.clickAndHold(ele1).clickAndHold(ele5).release().perform();
	
	builder.keyDown(Keys.CONTROL)
	  .click(ele1)
	  .click(ele2)
	  .click(ele3)
	  .click(ele4)
	  .keyUp(Keys.CONTROL).perform();
	
	}
}
