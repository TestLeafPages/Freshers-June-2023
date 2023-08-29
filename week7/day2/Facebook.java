package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//click on create new Account button
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	//enter first name
	By name = By.name("firstname");
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.);
	
	driver.findElement(name).sendKeys("Testleaf");
	
	//.sendKeys("TestLeaf");
    //enter mobile number
	driver.findElement(By.name("reg_email__")).sendKeys("997675");


}
}
