package com.hspedu.modifier;

public class test02 {
    public static void main(String[] args) {

    }
            public void say{
        A a = new A();
        //在同一个包下，不能访问private，其他都行
        System.out.println("n1 = " + a.n1 + " n2="  +a.n2 + " n3 = " + a.n3 );
    }
}
