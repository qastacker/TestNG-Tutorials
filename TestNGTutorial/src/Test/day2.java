package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void trial() {
		System.out.println("yeah!");
	}
	
	@BeforeTest
	public void trial1() {
		System.out.println("yes it is!");
	}
	
	@BeforeSuite
	public void trialsuite() {
		System.out.println("I'm n front!");
	}
	
	@BeforeClass
	public void trialclass() {
		System.out.println("I'm up here");
	}

	@Test(groups= {"Smoke"})
	public void trial3() {
		System.out.println("No Never it is!");
	}
	
	@AfterTest
	public void trial2() {
		System.out.println("Definitly it is!");
	}
	
	@AfterSuite
	public void trialsuites() {
		System.out.println("I'm n Last!");
	}
	
	@AfterClass
	public void trialclasses() {
		System.out.println("I'm down here");
	}
	
	@Test
	public void trial4 () {
		System.out.println("may I think it is!");
	}


}
