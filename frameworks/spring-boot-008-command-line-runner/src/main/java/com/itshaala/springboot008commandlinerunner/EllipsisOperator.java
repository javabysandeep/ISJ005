package com.itshaala.springboot008commandlinerunner;

//@SpringBootApplication
public class EllipsisOperator {

    public static void main(String[] args) {
        //    SpringApplication.run(SpringBoot008CommandLineRunnerApplication.class, args);
        System.out.println(add(100, 200));
        System.out.println(add(100, 200, 300));
        System.out.println(add(100, 200, 300, 500));
        System.out.println(add("abc", "xyz", "pqr", " " + " "));
    }

    //ellipsis operator ...
    public static int add(int... numbers) {
        //array of integers
        int result = 0;
        for (int temp : numbers) {
            result += temp;
        }
        return result;
    }

    public static String add(String... strings) {
        //array of integers
        String result = "";
        for (String temp : strings) {
            result += temp;
        }
        return result;
    }

}

