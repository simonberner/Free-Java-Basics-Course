package junitlessons;

import org.junit.jupiter.api.Test;
import rocks.simonberner.fizzbuzz.FizzBuzzConverter;

public class FizzBuzzAppTest {

    @Test
    public void logTheFirstHundredFizzBuzzes() {

        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        // The assertion is missing!
        // How do it test if the output is correct? Which oracle to use? What to assert?
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzConverter.convert(i));
        }
    }
}
