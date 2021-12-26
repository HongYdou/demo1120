package com.example.demo1120.designPattern.SingletonPattern;

public class SingletionDCL {
    //构造方法私有化
    private SingletionDCL(){}

    private static volatile SingletionDCL instance;

    public static SingletionDCL getInstance(){
        if (instance==null) {
            synchronized (SingletionDCL.class){
                if (instance==null) {
                    instance=new SingletionDCL();
                }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("SingletionDCL");
    }
}
