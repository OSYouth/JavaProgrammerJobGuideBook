package com.company.Chapter4;

//4.4.8 ++i与i++有什么区别
public class TestP98 {
    public static void main(String[] args){
        int i = 1;
        System.out.println(i+++i++);
        System.out.println("i="+i);
        System.out.println(i++ + ++i);
        System.out.println("i="+i);
        System.out.println(i+++i+++i++);
        System.out.println("i="+i);
    }
}

/*输出结果
3
i=3
8
i=5
18
i=8
 */