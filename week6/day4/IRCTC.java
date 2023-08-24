package week6.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) {
		//launch  chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.irctc.co.in/nget/train-search");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //to get current window control
		String parentWindow = driver.getWindowHandle();
        //Print current Active Web Page i.e parent Window
		String title = driver.getTitle();
		System.out.println(title);
		//click on flight link
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("childWindow size = "+childWindow.size());
		
		List<String> openedWindows=new ArrayList<String>(childWindow);
		
		driver.switchTo().window(openedWindows.get(1));
		
		 //Print current Web Page i.e child Window
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	}
}
