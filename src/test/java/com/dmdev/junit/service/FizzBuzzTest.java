package com.dmdev.junit.service;

import com.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ifThreeDividedByThreePrintFizz(){
        assertEquals("Fizz", FizzBuzz.printFizz(3));
    }

    @Test
    void ifFiveDividedByFivePrintBuzz(){
        assertEquals("Buzz", FizzBuzz.printBuzz(5));
    }

    @Test
    void ifFifteenDividedByThreeAndFive(){
        assertEquals("FizzBuzz", FizzBuzz.printFizzBuzz(15));
    }
}
