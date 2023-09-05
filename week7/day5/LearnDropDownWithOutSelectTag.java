package week7.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownWithOutSelectTag {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node06o3d234c0p7ril27d1i1te9461077.node0");
	
driver.findElement(By.xpath("(//div[contains(@class,'ui-state-default ui-corner-right')])[1]")).click();
	
driver.findElement(By.xpath("//li[text()='India']")).click();
}
}
