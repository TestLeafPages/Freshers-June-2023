package week6.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
	public static void main(String[] args) {
		//launch  chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01atv6rfwzuler4wku4rvj1dv6442956.node0");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//to verify current webpage
		String title = driver.getTitle();
		System.out.println(title);
		//to store current window
		String parentWindow = driver.getWindowHandle();
		
		//click on open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
        // to get size off opened window
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("childWindows size --"+childWindows.size());
		
		//Create an empty List, converted set into list
		List<String> openedWindow=new ArrayList<String>(childWindows);
		
		//controll move to child window
		driver.switchTo().window(openedWindow.get(1));
		
		//control move to parent window
	//	driver.switchTo().window(parentWindow);
		driver.switchTo().window(openedWindow.get(0));
		//to verify second webpage
		String title2 = driver.getTitle();
		System.out.println(title2);




	}
}
