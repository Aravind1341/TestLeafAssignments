package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MVI Tech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Long Descriptions");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ababu1341@gmail.com");
		
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MVI Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("G Aravind");
		driver.findElement(By.name("submitButton")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.close();

	}

}
