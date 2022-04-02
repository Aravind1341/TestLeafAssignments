package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("77");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(2000);
		WebElement eleLead = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-firstName')]/a[@class = 'linktext'])[1]"));
		String lead = eleLead.getText();
		System.out.println(lead);
		
		eleLead.click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement eleTitle = driver.findElement(By.xpath("//div[text() = 'Duplicate Lead']"));
		String titleGet = eleTitle.getText();
		String duplicateLeadTitle = "Duplicate Lead";
		if(duplicateLeadTitle.equals(titleGet)) {
			System.out.println("Title verification success. Title is "+ titleGet);
		}else {
			System.out.println("Title verification failed. Title present is " + titleGet);
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement eleDuplicateLead = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicateLead = eleDuplicateLead.getText();
		System.out.println(duplicateLead);
		
		if(lead.equals(duplicateLead)) {
			System.out.println("Duplicate lead created with same lead name");
		}else {
			System.out.println("Duplicate lead created with different name" + duplicateLead);
		}
		
		driver.close();
		
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/

	}

}
