package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
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
		
		//Enter first name
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name= 'firstName']")).sendKeys("sa");
		
		//Click Find leads button
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		
		//Click on first resulting lead
		driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-cell-inner x-grid3-col-firstName')]/a[@class = 'linktext'])[1]")).click();
		
		//Verify title of the page
		String getTitle = driver.getTitle();
		String title = "View Lead | opentaps CRM";
		if(title.equals(getTitle)) {
			System.out.println("Title verification success. Title is "+ getTitle);
		}else {
			System.out.println("Title verification failed. Title present is " + getTitle);
		}
		
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		
		//Change the company name
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TestSelenium");
		String editedname = companyName.getAttribute("value");
		//System.out.println(editedname);
		
		//Click Update
		driver.findElement(By.name("submitButton")).click();
		
		//Confirm the changed name appears
		WebElement viewCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		String getCompNm[] = viewCompanyName.getText().split(" ");
		//int getLength = getCompNm.length;
		//int getCompanyNameIndex = getLength-2;
		String getEdtCompNm = getCompNm[0];
		
		if(editedname.equals(getEdtCompNm)) {
			System.out.println("Edited Name "+ editedname + " matched in the view screen " + getEdtCompNm);
		}else {
			System.out.println("Edited Name "+ editedname + " not matching in the view screen " + getEdtCompNm);
		}
		
		//Close the browser
		//driver.close();
		
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/

	}

}
