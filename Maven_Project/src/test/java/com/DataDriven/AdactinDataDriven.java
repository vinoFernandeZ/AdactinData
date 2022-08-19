package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.Pom.Login;

public class AdactinDataDriven {
	
public static WebDriver driver; 
	
	public static  void BrowserLaunch() {
	
	System.setProperty("webdriver.edge.driver", "F:\\eclipse-workspace\\Maven_Project\\Edge\\msedgedriver.exe");
	 driver = new EdgeDriver();	
	 driver.get("http://adactinhotelapp.com/");
	}
	
public static  void LoginDetails() throws InterruptedException {
	
	String uname;
	String pwd;
	int count = PhotonDataDrive.getRowcount("C:\\Users\\SG\\Desktop\\Screenshot\\demo2.xlsx", "Sheet1");
	int colcount = PhotonDataDrive.getcolcount("C:\\Users\\SG\\Desktop\\Screenshot\\demo2.xlsx", "Sheet1");
	for(int i=1; i<=count;i++) {
	
		uname = PhotonDataDrive.getCellvalue("C:\\Users\\SG\\Desktop\\Screenshot\\demo2.xlsx", "Sheet1", i, 0);
		pwd = PhotonDataDrive.getCellvalue("C:\\Users\\SG\\Desktop\\Screenshot\\demo2.xlsx", "Sheet1", i, 1);


	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys(uname);
WebElement password = driver.findElement(By.id("password"));
password.sendKeys(pwd);
	driver.findElement(By.id("login")).click();	
	
	Thread.sleep(2000);
	driver.navigate().to("http://adactinhotelapp.com/");
	
	
	} 	
	
}	

public static void main(String[] args) throws InterruptedException {
	
	BrowserLaunch();
	LoginDetails();
	
	
}


}
