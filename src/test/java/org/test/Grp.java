package org.test;

import org.testng.annotations.Test;

public class Grp {
	@Test(groups = "a")
	private void tc1() {
		System.out.println("1");

	}
	@Test(groups = "b")
	private void tc2() {
		System.out.println("2");

	}
	@Test(groups = "c")
	private void tc3() {
		System.out.println("3");
	}

}
