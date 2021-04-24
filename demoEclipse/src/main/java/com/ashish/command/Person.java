package com.ashish.command;

public class Person {


	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	private Integer pid;
	private String pname;
	private Integer age;
	private String padd;

	public Integer getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public Integer getAge() {
		return age;
	}

	public String getPadd() {
		return padd;
	}


	
	

}
