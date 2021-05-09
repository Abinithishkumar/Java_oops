package com.jarvis;

public class Main {

    public static void main(String[] args){

        Student input = new Student();   // Here, input is an object
        input.name = "Tony Stark";
        input.age = 20;
        input.rollNumber = 001;

        input.print();

        Student input1 = new Student();
        input1.name = "Thor";
        input1.age = 26;
        input1.rollNumber = 0014;

        input1.print();

        PartTime bindhu = new PartTime();
        bindhu.age = 19;
        bindhu.partTime = true;
        bindhu.name = "Captain America";
        bindhu.rollNumber = 02;
        bindhu.print();


    }

}
