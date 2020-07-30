/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assume.assumeFalse;

import com.testtt.Library;

public class LibraryTest {

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(5000);
	}

	@Test
	public void test2() throws InterruptedException {
	}

	@Test
	public void test3() throws InterruptedException {
		Thread.sleep(100);
		Assert.fail("successful failure");
	}

	@Test
	public void test4() {
		assumeFalse(true);
	}

	@Ignore
	@Test
	public void test5() throws InterruptedException {
	}
	
	@Test
	public void test6() {
		throw new RuntimeException();
	}

}
