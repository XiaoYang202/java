package com.hspedu.debug;

import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {
        int arr[] = {8,76,5,4,3,22,46,1,1456,46};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
