package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test0() {
		String ret = HelloWorld.createEchoStr("test");

		assertEquals("echo : test", ret);
	}

	@Test
	void test1() {
		String ret = HelloWorld.createEchoStr("Hello", "World");

		assertEquals("echo : Hello World", ret);
	}

}
