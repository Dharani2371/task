package org.test;

import org.testng.annotations.Test;

public class Testng {
	@Test(invocationCount = 3)
	private void tc1() {
		System.out.println("hi");

	}
	@Test(enabled = false)
	private void tc2() {
		System.out.println("hello");

	}
	@Test(priority = -1)
	private void tc3() {
	System.out.println("welcome");

	}

}
