package com.dzq.dao;

public class HelloSpring {
    //定义变量 它的值通过spring框架注入
    private String who;
    /*
    定义打印方法
     */
    public  void print(){
        System.out.println("Hello,"+this.getWho()+"!");
    }
/*
获取who的值
 */
    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
