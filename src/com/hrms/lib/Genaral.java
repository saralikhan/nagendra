package com.hrms.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class  Genaral extends Global {
	public void lunchapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gateway\\Downloads\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
			
		}
		
	public void openapp() throws Exception {
		driver.findElement(By.name(login_name)).sendKeys(ln);
		//driver.findElement(By.name(password)).sendKeys(pw);
		driver.findElement(By.name(login_bt)).click();
		a= driver.switchTo().alert();
		a.accept();
		driver.findElement(By.name(password)).sendKeys(pw);
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void addemp() {
		ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(PIM))).perform();
		driver.findElement(By.linkText(add_empl)).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name(frist_name)).sendKeys(FN);
		driver.findElement(By.name(last_name)).sendKeys(LN);
		fileinput=driver.findElement(By.name(photo));
		fileinput.sendKeys(path);
		driver.findElement(By.id(save)).click();
		driver.findElement(By.xpath(back)).click();
		Reporter.log(frist_name);
		
	}
	public void selectemp() throws Exception {
		 printlist= new Select(driver.findElement(By.name(select)));
		 List<WebElement> droplist=printlist.getOptions();
		 for(WebElement d1:droplist) {
			 
		 System.out.println(d1.getText());
		 Thread.sleep(1000);
		
		 }
		st=new Select(driver.findElement(By.name(s_emp)));
		st.selectByIndex(2);
		//for(int i=1;i<=10;i++) {
			//driver.findElement(By.xpath(checkbox)).click();
			
			
		}
		
	}
	


