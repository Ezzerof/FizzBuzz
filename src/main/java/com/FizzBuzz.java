package com;

import java.util.ArrayList;

public class FizzBuzz {

    public static String printFizzBuzz(int num){
        String result = "";
        if (num % 3 == 0 && num % 5 == 0)
            result = "FizzBuzz";
        return result;
    }

    public static String printFizz(int num){
        String result = "";
        if (num % 3 == 0)
            result = "Fizz";
        return result;
    }

    public static String printBuzz(int num){
        String result = "";
        if (num % 5 == 0)
            result = "Buzz";
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(100);
        int count = 1;

        //Adding values to Array
        for( int i = 1; i < 101; i++){
            list.add(i);
        }

        while (count != list.size()){

            if ("Fizz" == printFizz(count))
                System.out.print(count + " = " + printFizz(count) + "\n");

            if ("Buzz" == printBuzz(count))
                System.out.print(count + " = " + printBuzz(count) + "\n");

            if ("FizzBuzz" == printFizzBuzz(count))
                System.out.print(count + " = " + printFizzBuzz(count) + "\n");

            count++;
        }
    }
}
