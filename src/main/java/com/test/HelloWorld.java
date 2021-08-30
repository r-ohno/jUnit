package com.test;

public class HelloWorld {
	public static void main(String... args) {
		System.out.println(createEchoStr(args));
	}

	public static String createEchoStr(String... args) {
		StringBuilder sb = new StringBuilder("echo : ");
		for (String s : args) {
			sb.append(s).append(" ");
		}
		return sb.toString().trim();
	}
}
