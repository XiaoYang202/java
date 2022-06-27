package com.hspedu.poly.polyparameter;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager yzz = new Manager("yzz", 13000,200000);
        Test test = new Test();
        test.showEmpAnnual(tom);
        test.showEmpAnnual(yzz);
    }


    public void showEmpAnnual(Employee a){
        System.out.println(a.getAnnual());
    }
}
