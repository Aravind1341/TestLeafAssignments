package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Using Text Based xpath
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		
		//xpath - Younger to Elder Sibling
		driver.findElement(By.xpath("//i[@class = '_5dbd img sp_98fCI7IVTTz sx_336c7a']/preceding-sibling::input")).sendKeys("Abcd");
		
		//xpath - Grandfather to grandchild
		driver.findElement(By.xpath("//div[@class = 'uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name = 'lastname']")).sendKeys("xyz");
		
		//xpath - Elder to Younger Sibling
		driver.findElement(By.xpath("//div[text() = 'Mobile number or email address']/following-sibling::input")).sendKeys("9876543210");
		
		driver.findElement(By.id("password_step_input")).sendKeys("abcd@12");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectday = new Select(day);
		Select selectmonth = new Select(month);
		Select selectyear = new Select(year);
		
		selectday.selectByIndex(13);
		selectmonth.selectByVisibleText("Apr");
		selectyear.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@type = 'radio']/preceding-sibling::label[text() = 'Female']")).click();


		
	

	}

}
