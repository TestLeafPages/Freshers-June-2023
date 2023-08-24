package week6.day4;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		//Action---->Interface
		//Actions -->class
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized","--incognito");
		//option.setHeadless(true);
		//launch  chrome browser
		ChromeDriver driver=new ChromeDriver(option);
		//Load the application url
		driver.get("https://www.myntra.com/");
		//maximize the browser
		//driver.manage().window().maximize();
		//add implicitly wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
System.out.println("browser launched");
//		WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
//	
//		WebElement partyWear = driver.findElement(By.xpath("(//a[text()='Party wear'])[1]"));
//		
//		Actions builder=new Actions(driver);
////		Thread.sleep(1000);
////		builder.moveToElement(kids).perform();
////		Thread.sleep(1000);
////		builder.click(partyWear).perform();
//		
//		builder.moveToElement(kids).pause(2000).click(partyWear).perform();
//		Thread.sleep(2000);
//		//WebElement scroll = driver.findElement(By.xpath("(//h3[text()='Wish Karo'])[1]"));
//		//builder.moveToElement(scroll).perform();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
//		//scroll.click();
	}
}
