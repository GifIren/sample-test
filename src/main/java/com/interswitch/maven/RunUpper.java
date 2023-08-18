package com.interswitch.maven;

public class RunUpper {
    public static void main(String[] args) {
        UpperLowerCase ulcase = new UpperLowerCase();
        System.out.printf( "%s to %s\n", "Hello world", ulcase.wordToUpperCase("Hello World"));
        System.out.printf( "%s to %s\n", "Hello world", ulcase.wordToLowerCase("Hello World"));

    }

}
