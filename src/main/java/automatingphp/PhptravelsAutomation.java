package automatingphp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhptravelsAutomation {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://phptravels.com/demo/%20...");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Sign up")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.id("inputFirstName")).sendKeys("Amal");
			Thread.sleep(4000);
			driver.findElement(By.id("inputLastName")).sendKeys("Joy");
			driver.findElement(By.id("inputLastName")).sendKeys("Joy");
			driver.findElement(By.id("inputEmail")).sendKeys("amal11@gmail.cxo");
			driver.findElement(By.id("inputPhone")).sendKeys("894850680");
			driver.findElement(By.id("inputPhone")).sendKeys("894850680");
			driver.findElement(By.id("inputCompanyName")).sendKeys("ABC");
			driver.findElement(By.id("inputAddress1")).sendKeys("3 SUMMERSEAT ");
			
			
			

			
		
			
			
			
		
			
		}

	}



