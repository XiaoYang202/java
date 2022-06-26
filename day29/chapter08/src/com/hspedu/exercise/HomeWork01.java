package com.hspedu.exercise;

public class HomeWork01 {
    public static void main(String[] args) {
        Person person = new Person("yzz",22);
        System.out.println( person.sayInfo());
        Person.Student student = person.new Student("yzz",22,1321354,395);
        System.out.println(student.sayInfo());
    }
}


class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public String sayInfo(){
        return "个人信息 = " + " name = " +name +" age = " + age;
    }

    class Student extends Person{
        private int id;
        private double score;

        public Student(String name, int age, int id, double score) {
            super(name, age);
            this.id = id;
            this.score = score;
        }

        public String sayInfo(){
            return super.sayInfo() + " id =" + id + " score=" + score;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
}