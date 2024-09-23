package com.iutblagnac.r303trace;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(hello());
        System.out.println(hello("Pierre"));
        System.out.println(hello("Hello Pierre !"));
    }

    public static String hello() {
        return  "Hello World!" ;
    }

    public static String hello(String param) {
        return  param ;
    }
}
