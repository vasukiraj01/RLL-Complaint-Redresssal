package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ComplaintTest {
  static WebDriver webdriver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Softwares\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestHome() {
		
		//Admin Login
	
		webdriver.get("http://localhost:4202/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("typeEmailX")).sendKeys("admin@gamil.com");
		webdriver.findElement(By.id("typePasswordX")).sendKeys("admin");
		webdriver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/div/form/button")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//alert dismiss
		webdriver.switchTo().alert().dismiss();

	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	//Add New Customer
	
	webdriver.findElement(By.xpath("//*[@id=\"navbarCollapse1\"]/div/div[1]/li/a")).click();
	webdriver.findElement(By.xpath("/html/body/app-root/app-core/nav/div/div[1]/div/div[1]/li/ul/div/li[2]/a")).click();
	webdriver.findElement(By.id("fullName")).sendKeys("Adam Smith");
	webdriver.findElement(By.id("phone")).sendKeys("9443655456");
	webdriver.findElement(By.id("email")).sendKeys("adam@gmail.com");
	webdriver.findElement(By.id("password")).sendKeys("123");
	webdriver.findElement(By.xpath("//*[@id=\"role\"]")).sendKeys("customer");
	webdriver.findElement(By.xpath("//*[@id=\"role\"]")).click();
	webdriver.findElement(By.id("address")).sendKeys("130,Chetpet,Chemmai,");
	//webdriver.findElement(By.xpath("/html/body/app-root/app-create-user/div/div/div/form/div[2]/div/div[3]/ng-multiselect-dropdown/div/div[1]/span")).sendKeys("phone");
	webdriver.findElement(By.xpath("/html/body/app-root/app-create-user/div/div/div/form/div[2]/div/div[3]/ng-multiselect-dropdown/div/div[1]/span")).click();
	webdriver.findElement(By.xpath("/html/body/app-root/app-create-user/div/div/div/form/div[2]/div/div[3]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")).click();
	webdriver.findElement(By.xpath("/html/body/app-root/app-create-user")).click();
	
	webdriver.findElement(By.xpath("/html/body/app-root/app-create-user/div/div/div/form/div[3]/div/div/div[1]/button")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	webdriver.switchTo().alert().dismiss();
	
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//Navigate to Customer Part
	webdriver.findElement(By.xpath("//*[@id=\"navbarCollapse1\"]/div/div[1]/li/a")).click();
	webdriver.findElement(By.xpath("//*[@id=\"navbarCollapse1\"]/div/div[1]/li/ul/li[1]/a")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//Delete The Customer
	webdriver.findElement(By.xpath("/html/body/app-root/app-user-list/div/div/table/tbody/tr/td[9]/button")).click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	//Dismiss Alert Message
	webdriver.switchTo().alert().dismiss();
	
	//Close the Web Driver
	webdriver.close();
	}
	


}