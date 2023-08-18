package com.interswitch.maven;

import java.time.LocalDateTime;

public class RunUpper {
    public static void main(String[] args) {
        UpperLowerCase ulcase = new UpperLowerCase();
        System.out.printf( "%s to %s\n", "Hello world", ulcase.wordToUpperCase("Hello World"));
        System.out.printf( "%s to %s\n", "Hello world", ulcase.wordToLowerCase("Hello World"));

        System.out.println("New Go-Home feature by " + "Backbone Team suggested at" + LocalDateTime.now());

    }

}
