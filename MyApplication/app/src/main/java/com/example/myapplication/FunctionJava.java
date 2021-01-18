package com.example.myapplication;

public class FunctionJava {
    public static void main(String[] args) {
        print();

        String grade = getGrade();
        System.out.println("Grade is "+grade);

        boolean isRunning = isRunning();
        System.out.println("It is running "+ isRunning);

        //Function with single arguments
        printIt("hon");
        int count = 0;
        count(count++);
        count(count++);
        count(count++);
        count(count++);

        //Function with multiple arguments
        int combinedValue = combine(2,3, "after combined");
        System.out.println("Return is " + combinedValue);
    }

    public static int combine(int a, int b, String msg) {
        int output = a + b;
        System.out.println(msg );

        return output;
    }

    public static void count(int count) {
        System.out.println(count);
    }

    private static void printIt(String hon) {
        System.out.println("It is " + hon);
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
