package com.JavaDSA.Abstract;

public class Son extends Parent{
    @Override
    void friend() {
        System.out.println("Take friends name as input");
    }

    @Override
    void b_day() {
        System.out.println("Also print their birthdate !");
    }
}

