package week7.day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyIfTheElementIsDiabled {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node06o3d234c0p7ril27d1i1te9461077.node0");
	
	
}
}
