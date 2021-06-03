package com.online.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.online.qa.base.Base;
import com.online.qa.pages.homepage;

public class Homepagetest extends Base {

	homepage homepageobj;

	public Homepagetest() {
		super();
	}

	@BeforeClass
	public void setup() throws IOException {
		init();
		homepageobj = new homepage();
	}

	@Test(priority=1)
	public void addtocarkbrokoli() throws InterruptedException {
		homepageobj.clickbrockoli();
		
	}
	@Test(priority=2)
	public void addtocarkbrokolicolor() throws InterruptedException {
		String clr=homepageobj.verifycolor();
        System.out.println("Color value"+clr);
	
            
	}
	
	@Test(priority=4)
	public void Test4() throws InterruptedException {
		
        System.out.println("Test4 ecevuted");
	
            
	}
	
	@Test(priority=5)
	public void Test5() throws InterruptedException {
		
        System.out.println("Test5 ecevuted");
	
            
	}
	
	@Test(priority=3)
	public void Test3() throws InterruptedException {
		
        System.out.println("Test3 ecevuted");
	
            
	}
	
}
