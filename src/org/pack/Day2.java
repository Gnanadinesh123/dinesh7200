package org.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\EmployeeDetailsnew\\Selenium\\Driver\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement userName=w.findElement(By.name("username"));
		userName.sendKeys("9876543210");
		WebElement password=w.findElement(By.name("password"));
		password.sendKeys("9876543210");
		
	}

}
