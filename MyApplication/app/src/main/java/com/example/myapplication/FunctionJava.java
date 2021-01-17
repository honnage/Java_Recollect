package com.example.myapplication;

public class FunctionJava {
    public static void main(String[] args) {
        print();
      
        runSomtiong();
        String grade = getGrade();
        System.out.println("Grade is "+grade);

        boolean isRunning = isRunning();
        System.out.println("It is running "+ isRunning);
    }

    public static  boolean isRunning(){
        return true;
    }


    public static String getGrade() {
        return "A";
    }


    private static void runSomtiong() {

    }

    public static void print(){
        System.out.println("Hey");
        System.out.println("Hi");
    }

}
