package com.jarvis;

public class PartTime extends Student {   // extends is for importing student clss

    boolean partTime;

    @Override
    public void print() {
        super.print();

        if(partTime){
            System.out.println(name+" is PartTime student");
        }else{
            System.out.println("not a partTime student");
        }


    }
}
