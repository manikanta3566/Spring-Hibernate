package com.practice.springAOP;

public class Account {
private String name;

public Account(String name) {
	this.name=name;
}

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Account [name=" + name + "]";
}

}
