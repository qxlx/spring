package com.qxlx.main.domain;

/**
 * @author jiabaobao
 * @date 2023/7/19 8:58 AM
 */
public class Person {

	private String name;

	public Person() {
		System.out.println("person().....");
	}

	public void init() {
		System.out.println("init......");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
