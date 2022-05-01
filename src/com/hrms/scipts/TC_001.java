package com.hrms.scipts;

import org.testng.annotations.Test;

import com.hrms.lib.Genaral;

public class TC_001 {
	@Test
	public void TC_001() throws Exception {
	Genaral obj= new Genaral();
	obj.lunchapplication();
	obj.openapp();
	obj.addemp();
	obj.selectemp();
	
	
	

}
	
}