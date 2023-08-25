package week6.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) {
		//Action---->Interface
		//Actions -->class
		//launch  chrome browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
				
		ChromeDriver driver=new ChromeDriver(options);
		//Load the application url
		driver.get("https://www.ajio.com/");
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//hover on men
		WebElement men = driver.findElement(By.xpath("//a[text()='MEN']"));
		
		//click on  shirts
		
		WebElement shirts = driver.findElement(By.xpath("(//a[text()='Shirts'])[1]"));
	
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		builder.click(shirts).perform();
	
	}
}
