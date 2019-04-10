package com.company.Chapter4;

//4.4.7 Math类中round、ceil、floor方法的功能各是什么
public class TestP97 {

    public static void main(String[] args) {
        float m = 6.4f;
        float n = -6.4f;
        System.out.println("Math.round(" + m + ")=" + Math.round(m));
        System.out.println("Math.round(" + n + ")=" + Math.round(n));
        System.out.println("Math.ceil(" + m + ")=" + Math.ceil(m));
        System.out.println("Math.ceil(" + n + ")=" + Math.ceil(n));
        System.out.println("Math.floor(" + m + ")=" + Math.floor(m));
        System.out.println("Math.floor(" + n + ")=" + Math.floor(n));
    }
}

/*输出结果
Math.round(6.4)=6
Math.round(-6.4)=-6
Math.ceil(6.4)=7.0
Math.ceil(-6.4)=-6.0
Math.floor(6.4)=6.0
Math.floor(-6.4)=-7.0
 */
