package com.company.Chapter4;

public class Test {
    static {
        System.out.println("hello world111");
    }
    static  public void main(String[] args){
        System.out.println("hello world!");
        for(int i = 0; i <args.length; i++){
            System.out.println(args[i]);
        }
    }
}
