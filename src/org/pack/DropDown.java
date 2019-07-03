package org.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\EmployeeDetailsnew\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement day = driver.findElement(By.id("month"));
		Select s = new Select(day);
		s.selectByVisibleText("Feb");

		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		
		for(int i=0; i<op.size(); i++) {
			WebElement we = op.get(i);
			String text = we.getText();
			System.out.println(text);
		}
		
		for(WebElement we :op) {
			String att= we.getAttribute("value");
			System.out.println(att);
		}
		
	}

}
