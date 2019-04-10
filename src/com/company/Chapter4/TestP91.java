package com.company.Chapter4;

//4.4.3 值传递与引用传递有哪些区别
public class TestP91 {
    public static void testPassParameter(StringBuffer ss1, int n){
        ss1.append(" World");   //引用
        n = 8;  //值
    }

    public static void main(String[] args){
        int i = 1;
        StringBuffer s1 = new StringBuffer("Hello");
        testPassParameter(s1,i);
        System.out.println(s1);
        System.out.println(i);
    }
}


/*输出结果
Hello World
1
 */
