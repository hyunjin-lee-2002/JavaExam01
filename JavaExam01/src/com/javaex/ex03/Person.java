package com.javaex.ex03;

public class Person {
    
    private String name;
    private String hp;
    private String company;
    
    public Person() {}

    public Person(String name, String hp, String company) {
        this.name = name;
        this.hp = hp;
        this.company = company;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public String toString() {
        return "이름: " + name + ", 핸드폰: " + hp + ", 회사: " + company;
    }

 
    public void showInfo() {
    	System.out.println("--------------------------------------");
        System.out.println("이  름: " + name);
        System.out.println("핸드폰: " + hp);
        System.out.println("회  사: " + company);
        System.out.println("--------------------------------------");
    }
}
