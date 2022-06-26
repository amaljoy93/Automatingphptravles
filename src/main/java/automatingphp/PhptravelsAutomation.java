package automatingphp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhptravelsAutomation {

	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://phptravels.org/register.php");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputFirstName")));
			
			driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Amal");
			driver.findElement(By.id("inputLastName")).sendKeys("Joy");
			driver.findElement(By.id("inputEmail")).sendKeys("amal11@gmail.cxo");
			driver.findElement(By.id("inputPhone")).sendKeys("894850680");
			driver.findElement(By.id("inputCompanyName")).sendKeys("ABC");
			driver.findElement(By.id("inputAddress1")).sendKeys("3 SUMMERSEAT ");
			driver.findElement(By.id("inputCity")).sendKeys("Dublin ");
			WebElement element = driver.findElement(By.id("inputCountry"));
			Select  a = new Select(element);
			a.selectByValue("IE");
			driver.findElement(By.id("inputNewPassword1")).sendKeys("livelon&prosper");
			driver.findElement(By.id("inputNewPassword2")).sendKeys("livelon&prosper");
			
			
			
			
			

			
		
			
			
			
		
			
		}

	}



