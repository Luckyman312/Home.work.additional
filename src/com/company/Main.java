package com.company;

import java.util.Random;

//Generate Random Age
public class Main {

    public static void main(String[] args) {
    generateRandomAge();
        System.out.println(generateRandomAge());
    }
    public static int generateRandomAge (){
        Random r = new Random();
        int random = r.nextInt(100)+1;
        return  random;
    }
}
