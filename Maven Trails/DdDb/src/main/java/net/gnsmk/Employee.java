package net.gnsmk;

public class Employee {
	String name = "empty regestry";
	String phone = "0000";
	String age = "00";

	public void setPhone(String temp) {
		phone = temp;
	}

	public void setName(String temp) {
		name = temp;
	}

	public void setAge(String temp) {
		age = temp;
	}

	@Override
	public String toString() {
		return "{" + phone + "::" + name + "::" + age + "}";
	}
}