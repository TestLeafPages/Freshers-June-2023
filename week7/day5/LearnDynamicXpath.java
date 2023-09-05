package week7.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnDynamicXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node06o3d234c0p7ril27d1i1te9461077.node0");
	Thread.sleep(3000);
	
	WebElement ele = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
	ele.click();
	Thread.sleep(3000);
	List<WebElement> eleOptions = driver.findElements(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));

	for (int i = 1; i <=eleOptions.size(); i++) {
		
		//String text = eleOptions.get(i).getText();
		String text = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li)["+i+"]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//li[text()='"+text+"']")).click();
		Thread.sleep(3000);
		ele.click();
	}

	



}
}
