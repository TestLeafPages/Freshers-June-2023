package week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");

		ChromeDriver driver=new ChromeDriver(options);
		//Load the application url
		driver.get("https://jqueryui.com/droppable/");

		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//locate frame element
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	   //controll move to frame
		driver.switchTo().frame(eleFrame);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions builder=new Actions(driver);
		
		builder.dragAndDrop(draggable, droppable).perform();
	
	
	
	}
}
