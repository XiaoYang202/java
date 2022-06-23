package com.import01;//必须放在类的最上面，一个类只能有一句

//建议需要什么类就用什么类，不要一口气全调用

//import java.util.Scanner;//表示只引入java.util下面的Scanner类
//import  java.util.*;//表示将java.util 包下面的所有类都引入

import java.util.Arrays;

public class yinru {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9,99,66,44};
        //比如对其进行排序
        //传统方法是自己编写排序
        //系统提供了相关的类，可以方便Arrays的完成

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
