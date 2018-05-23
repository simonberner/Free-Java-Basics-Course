package junitlessons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import rocks.simonberner.fizzbuzz.FizzBuzzConverter;

public class FizzBuzzTest {

    /*
    TDD FizzBuzz in Java with JUnit - Lets Code: https://www.youtube.com/watch?v=DWQgJqzkhvk
    Description: http://wiki.c2.com/?FizzBuzzTest
    Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
    For numbers which are multiples of both three and five print “FizzBuzz”
     */

    // With these test methods, we get a decent unit test coverage of the FizzBuzzConverter class

    @Test
    public void fizzBuzzConverterLeavesNormalNumbersAlone() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        assertEquals("1", fizzBuzz.convert(1));

    }

    @Test
    public void fizzBuzzConverterMultiplesOfThree() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        assertEquals("Fizz", fizzBuzz.convert(3));


    }

    @Test
    public void fizzBuzzConverterMultiplesOfFive() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        assertEquals("Buzz", fizzBuzz.convert(5));


    }

    @Test
    public void fizzBuzzConverterMultiplesOfBothThreeAndFive() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        assertEquals("FizzBuzz", fizzBuzz.convert(15));


    }

}
