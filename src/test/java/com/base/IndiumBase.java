package com.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiumBase {
	
public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver_win32\\chromedriver.exe");
		//C:\Users\Bharath\eclipse-workspace\Adactin\Driver\chromedriver_win32
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void loadURL(String url) {
		driver.get(url);

	}
	
	public void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static void type(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public void linkContainsIndium() throws InterruptedException {
		List<WebElement> ele = driver.findElements(By.xpath("//h3[@class = 'LC20lb DKV0Md']"));
		System.out.println("No.Of.Elements:" + ele.size());
		System.out.println("Link contains Indium Text");
		System.out.println("=========================");
		for(int i =0; i<ele.size();i++)
		{
			WebElement data = ele.get(i);
			String name = data.getText();
			//System.out.println(name);
			if(name.contains("Indium"))
				
			{
				System.out.println(name);
			}
		}
		
		Thread.sleep(2000);

	}
	
	public void nextPage(WebElement element) {
		
		element.click();

	}
}
