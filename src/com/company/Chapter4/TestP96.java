package com.company.Chapter4;

//4.4.6 运算符优先级是什么
public class TestP96 {
    public static void main(String[] args){
        byte a = 5;
        int b = 10;
        int c = a >> 2 + b >> 2;
        int d = a << 2 + b >>2;
        System.out.println(c);
        System.out.println(d);
    }
}

/*输出结果
0
5120
 */
