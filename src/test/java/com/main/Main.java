package com.main;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.IndiumBase;

public class Main extends IndiumBase{

	public static void main(String[] args) throws AWTException, InterruptedException  {
		getDriver();
		IndiumBase b = new IndiumBase();		
		
//		b.loadURL("https://www.google.com/");
//		b.maxWindow();
//		WebElement search = driver.findElement(By.name("q"));
//		b.type(search, "Indium");
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		System.out.println("***Page1***");		
//		b.linkContainsIndium();
//		
//		WebElement page2 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[5]/div[2]/span[1]/div/table/tbody/tr/td[3]/a"));
//		b.nextPage(page2);
//		
//		System.out.println("***Page2***");
//		b.linkContainsIndium();
//
//		WebElement page3 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[5]/div[2]/span[1]/div/table/tbody/tr/td[4]/a"));
//		b.nextPage(page3);
//		 
//		System.out.println("***Page3 ***");
//		b.linkContainsIndium();  
		loadURL("https://www.snapdeal.com/");
		b.maxWindow();
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphonex", Keys.ENTER);
//		b.type(search, "iphonex");
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> lst = driver.findElements(By.xpath("//p[@class='product-title']"));
		System.out.println(lst.size());
	}

}
