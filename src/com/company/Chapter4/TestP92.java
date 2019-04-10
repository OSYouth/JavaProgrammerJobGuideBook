package com.company.Chapter4;

//4.4.3 值传递与引用传递有哪些区别
public class TestP92 {
    public static void changeStringBuffer(StringBuffer ss1, StringBuffer ss2){
        ss1.append(" World");
        ss2 = ss1;
    }

    public static void main(String[] args){
        Integer a = 1;
        Integer b = a;
        b ++;
        System.out.println(a);
        System.out.println(b);

        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        changeStringBuffer(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}



/*输出结果
1
2
Hello World
Hello
 */
