package week7.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownWithSelectTag {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node06o3d234c0p7ril27d1i1te9461077.node0");
	
	WebElement eleDropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dropDownOptions=new Select(eleDropDown);
//	
//	dropDownOptions.selectByIndex(1);
//	
	//to get all the options from dropdown
	List<WebElement> options2 = dropDownOptions.getOptions();
	
	for (int i = 0; i < options2.size(); i++) {
		System.out.println(options2.get(i).getText());
	}
	int size = options2.size();
	//Select random value from dropdown
	dropDownOptions.selectByIndex(size-3);
	
	System.exit(0);
	
}
}
