package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void TrialCaseFirst() {
		System.out.println("Good!");
	}
	
	@Test(groups= {"Smoke"})
	public void TrialCaseSecond() {
		System.out.println("Bit!");
	}

	@BeforeMethod
	public void TrialCases() {
		System.out.println("This one is for the right work things to do!");
	}
	
	@Test
	public void TrialCaseThird() {
		System.out.println("Bitter!");
	}
}
