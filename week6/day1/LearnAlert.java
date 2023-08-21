package week6.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	//launch  chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01vnjt03z3e6d414yp26alvm8r1437142.node0");
    //maximize the browser
	driver.manage().window().maximize();
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	Thread.sleep(3000);
	//control move to an alert
	Alert simpleAlert = driver.switchTo().alert();
	//accept the alert
	//simpleAlert.accept();
	simpleAlert.dismiss();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Alert prompt = driver.switchTo().alert();
	prompt.sendKeys("Hello");
	prompt.accept();

	
	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	driver.switchTo().alert().accept();
	
	


}
}
