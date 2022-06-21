package com.newone;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.quackit.com/html/html_editors/scratchpad/preview.cfm?example=/html/codes/html_popup_window_code");
		driver.findElement(By.linkText("Open a popup window")).click();
		String parentWindowTitle = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String currentWindow : allWindows) {
			if(!parentWindowTitle.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowTitle);
		//System.out.println(parentWindowTitle);
		//driver.quit();
	}

}