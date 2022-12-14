package com.cg.project;

import org.junit.Test;
import org.junit.Assert;


public class MainTest {

	@Test
	public void test1() {
		System.out.println();
		Assert.fail();
	}

	@Test
	public void test2() {
		System.out.println("test2() pass");
	}
	@Test
	public void test3() {
		System.out.println("test3() pass");
	}

	@Test
	public void test4() {
		System.out.println();
		Assert.fail();
	}

	@Test
	public void test5() {
		System.out.println();
		Assert.fail();
	}

}