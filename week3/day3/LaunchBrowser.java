package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
public static void main(String[] args) {
	//launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	
	//enter the user name as Demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//enter the password as crmsfa
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	//click on login button
	driver.findElement(By.className("decorativeSubmit")).click();
	 
	//print welcome note
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	//click on hyper link button
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//click on leads tap
	driver.findElement(By.linkText("Leads")).click();
	
	//click on create lead button
	driver.findElement(By.partialLinkText("Create")).click();
	
	//enter the company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
	
	//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
		
		//enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
		
		
		
		//locate the dropdown
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		//Select the value from dropdown using select class
		Select industryDroDown=new Select(industryDD);
		//select by text
		//industryDroDown.selectByVisibleText("Computer Software");
		//select by value
		//industryDroDown.selectByValue("IND_FINANCE");
		//select by index value
		industryDroDown.selectByIndex(1);
		
		//click on create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1="View Lead | opentaps CRM";
		
		String title = driver.getTitle();
		
		if(title1.equals(title)) {
			System.out.println("Create lead created successfully");
		}else {
			System.out.println("Create lead created not successfully");
		}
		
}
	}

