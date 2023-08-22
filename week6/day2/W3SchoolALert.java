package week6.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolALert {
public static void main(String[] args) throws InterruptedException {
	//launch  chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/frame.xhtml");
    //maximize the browser
	driver.manage().window().maximize();
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	driver.switchTo().alert().accept();
	
	System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

}
}
