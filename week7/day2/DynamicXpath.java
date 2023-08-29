package week7.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://erail.in/");

	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	//enter the values in from station
	WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	fromStation.clear();
	fromStation.sendKeys("MAS",Keys.ENTER);
	//enter the values in to station
	WebElement toStation = driver.findElement(By.id("txtStationTo"));
	toStation.clear();
	toStation.sendKeys("MDU",Keys.ENTER);
	
	//click on sort on date
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	//Get the train name
	List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
	System.out.println("Train Size : "+trainName.size());			
	Thread.sleep(3000);
	for (int i = 2; i <= trainName.size(); i++) {
		
	
	String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
	System.out.println(text);
	}
}
}
