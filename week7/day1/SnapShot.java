package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapShot {
public static void main(String[] args) throws IOException  {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml");
	//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);

	File destination=new File("./Images/001.jpg");
	
	FileUtils.copyFile(screenshotAs, destination);
	
}
}
