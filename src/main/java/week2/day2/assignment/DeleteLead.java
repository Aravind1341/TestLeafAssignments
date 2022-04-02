package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
				
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
				
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("99");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();		
		Thread.sleep(2000);
		
		//Capture lead ID of First Resulting lead
		WebElement eleLead = driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-partyId')]/a[@class='linktext'])[1]"));
		String Lead = eleLead.getText();
		System.out.println(Lead);
		
		//Click First Resulting lead
		eleLead.click();
		
		//Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Lead);
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String leadList = driver.findElement(By.className("x-paging-info")).getText();
		if(leadList.equals("No records to display")) {
			System.out.println("Deleted Successfully");
		}else {
			System.out.println("Not Deleted");
		}
		
		
		//Close the browser (Do not log out)
		driver.close();
		
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/

	}

}
