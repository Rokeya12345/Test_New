package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();		
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
driver.get("https://www.zoopla.co.uk/");
driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();
driver.findElement(By.id("input-email-address")).sendKeys("rokeyahassan.nyc@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("Zoopla12");
driver.findElement(By.xpath("//button[@data-testid='signin-button']")).click();

	}

}
