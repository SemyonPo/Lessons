package com.levelp.jb2;

public class MinFrom4 {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int ab = min(a,b);
        int cd = min(c,d);
        if (ab < cd){
            return ab;
        }else{
            return cd;
        }
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a<b){
            return a;
        }else{
            return b;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}

