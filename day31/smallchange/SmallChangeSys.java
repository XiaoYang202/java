package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //化繁为简
        //1.先显示菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        //2.编辑零钱通明细

        String details = "--------------零钱通明细-------------";
        //3.完成收益入账，定义新变量
        //4.完成消费，定义新变量，保存消费原因
        //5.退出
        String note = "";
        double money = 0;
        double balance = 0;
        Date date = null;//这一行引入java.util.Date,表示日期
        SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于格式化日期(年月日时分），引用形式为ymd.format(date)
        do {
            System.out.println("\n===============零钱通菜单===========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.print("请选择（1-4）：");
            key = scanner.next();
            //使用switch分支
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    //money范围的校验
                    money = scanner.nextDouble();
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + ymd.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("请输入消费金额");
                    //money范围的校验
                    money = scanner.nextDouble();
                    //消费说明
                    System.out.print("请输入消费说明");
                    note = scanner.next();

                    balance -= money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前日期
                    details += "\n\t" + note + "\t-" + money + "\t" + ymd.format(date) + "\t" + balance;
                    break;
                case "4":
                    //定义一个变量来接受y/n
                    //建议一段代码只实现一个功能
                    String choice ="";

                    while(true){
                        System.out.println("确定要退出吗，请输入y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }if("y".equals(choice)){
                    loop = false;
                }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
        System.out.println("----------退出零钱通系统----------");
    }
}
