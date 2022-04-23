package com.orange.stedef;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;

import com.orange.utils.BaseClass;

public class Hooks extends BaseClass {
	
	@Before
	public void sample1()
	{
		launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void sample2() {
		closeBrowser();
		
	}

}
