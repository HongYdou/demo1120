package com.example.demo1120.Bean;

public class Student {

    private String name;

    private Integer age;

    private String iphone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iphone='" + iphone + '\'' +
                '}';
    }

    public static Student init(String name, Integer age, String iphone){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setIphone(iphone);
        return student;
    }

    public Student in(String name, Integer age, String iphone){
        this.name=name;
        this.age=age;
        this.iphone=iphone;
        return this;
    }
}
