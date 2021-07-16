package Test;

import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo() {
		System.out.println("older!");
	}
	
	@Test
	public void Demo1() {
		System.out.println("newer!");
	}

	@Test(groups= {"Smoke"})
	public void Demo2() {
		System.out.println("newest!");
	}
}
