package com.example.myapplication;

public class FunctionJava {
    public static void main(String[] args) {
        print();

        String grade = getGrade();
        System.out.println("Grade is "+grade);

        boolean isRunning = isRunning();
        System.out.println("It is running "+ isRunning);

        printIt("hon");
    }

    private static void printIt(String hello_hon) {
        System.out.println("It is " + hello_hon);
    }

    public static  boolean isRunning(){
        return true;
    }

    public static String getGrade() {
        return "A";
    }

    public static void print(){
        System.out.println("Hey");
        System.out.println("Hi");
    }

}
