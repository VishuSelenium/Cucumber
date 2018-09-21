package com.cucum.FreeCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		String str = driver.getTitle();
		System.out.println(str);
		System.out.println(str);
		driver.close();
	}
	
}
