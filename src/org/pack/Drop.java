package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\EmployeeDetailsnew\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.toolsqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement day = driver.findElement(By.id("Selenium Commands"));
	
	Select s= new Select(day);
	s.selectByIndex(2);
}
}
