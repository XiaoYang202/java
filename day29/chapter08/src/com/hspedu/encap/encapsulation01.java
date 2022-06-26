package com.hspedu.encap;

public class encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("yzz");
        person.setAge(24);
        person.setSalary(20000);
        System.out.println(person.info());
        //要用快捷键alt需要先配置一下主类
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //public void setName
    //手写set和get方法太慢，可以使用快捷键，alt+ inset
    //然后根据要求完善代码，年龄在1-120，名字在2-6个字符

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法返回信息
    public String info() {
        return "信息为 name =" + name + " 年龄为 age = " + age + " 工资为 salary = " + salary;
    }
}
