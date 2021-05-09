package com.jarvis;

public class Main {

    public static void main(String[] args){

        Student input = new Student();   // Here, input is an object
        input.name = "Nithish Kumar";
        input.age = 20;
        input.rollNumber = 6002;

        input.print();

        Student input1 = new Student();
        input1.name = "Elakya";
        input1.age = 19;
        input1.rollNumber = 6001;

        input1.print();

        PartTime bindhu = new PartTime();
        bindhu.age = 19;
        bindhu.partTime = true;
        bindhu.name = "bindhu";
        bindhu.rollNumber = 02;
        bindhu.print();


    }

}
