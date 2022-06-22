package com.hspedu.encap;

public class AccountText {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("yzz");
        account.setBalance(200000);
        account.setPwd("123233");
        account.showInfo();
        Account cln = new Account("cln", 20000, "123331");
        cln.showInfo();
    } 
}
