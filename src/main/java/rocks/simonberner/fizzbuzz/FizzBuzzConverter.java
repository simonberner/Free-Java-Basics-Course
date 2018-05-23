package rocks.simonberner.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz % 15 == 0) {
            return "FizzBuzz";
        } else if (toConvertToFizzBuzz % 3 == 0) {
            return "Fizz";
        } else if (toConvertToFizzBuzz % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(toConvertToFizzBuzz);

    }
}
