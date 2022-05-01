package com.hrms.lib;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Global {
	//test data
	public WebDriver driver;
	Alert a;
	Robot r;
	Actions ac;
	WebElement fileinput;
	Select printlist;
	Select st;
	
	public String ln="nareshit";
	public String pw="nareshit";
	public String LN="maahi";
	public String FN="nagendra";
	
	

	public String path="E:\\Download//WhatsApp Image 2021-10-19 at 5.27.32 PM.jpeg";
	
	

	public String url="http://183.82.103.245/nareshit/login.php";
	public String login_name="txtUserName";
	public String password="txtPassword";
	public String login_bt="Submit";
	public String PIM="PIM";
	public String add_empl="Add Employee";
	public String last_name="txtEmpLastName";
	public String frist_name="txtEmpFirstName";
	public String photo="photofile";
	public String save="btnEdit";
	public String back="/html/body/div[5]/input";
	public String select="loc_code";
	public String s_emp="loc_code";
	
	
	
	
	
	

}
