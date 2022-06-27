package com.hspedu.poly.polyarr;

public class PolyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("yzz1", 23);
        persons[1] = new Student("yzz2", 23, 395);
        persons[2] = new Teacher("yzz3", 25, 20000);

        //循环遍历数组调用say
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
//                Student student = (Student)persons[i];
//                student.study();亦可以用下面的一句运行
                ((Student)persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            }else{
                System.out.println("你输入的信息有误，请重新输入");
            }
        }

    }
}
