package com.example.myapplication;

public class IntroJava {
    public static void main(String[] args) {
        System.out.println("Hello World ");

        int love = 0;
        String msg = "love level is ";
        System.out.println(msg + love);

        love = 1;
        System.out.println(msg + love);

        love = 10;
        System.out.println(msg + love);

        //Boolean
        boolean isLove = true;
        if (isLove == true){
            System.out.println("love is " + isLove + ", Yes");
        }else{
            System.out.println("love is " + isLove + ", No");
        }

        //Charcater
        char i = 't';
        System.out.println(i);
    }
}
