package junitlessons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.assertj.core.api.Assertions.*;
import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

public class C_Assertions {

    @Test
    public void TestOne() {
        int c = 5 * 5;

        //So our first assertion is using the Assert class from JUnit.
        //The first parameter is the ExpectedResult, the second parameter is the actual value.
        //So here I'm expecting our calculation above to be 25.
        // assertEquals(25, c);

        //We can also add a contextual message. JUnit will display this message upon failure
        //Creating good contextual messages can really speed up debugging
        // assertEquals(25, c, "contextual message on failure here");
        //We can use assertEquals for strings, ints, objects

        // ------- NEW in JUnit5 -------
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        assertAll("integer",
                () -> assertEquals(25, c),
                () -> assertEquals(25, c, "contextual message on failure here")
        );

        // ------- matchers with AssertJ -------
        /*
        Even though the assertion facilities provided by JUnit Jupiter are sufficient for many testing scenarios,
        there are times when more power and additional functionality such as matchers are desired or required.
         */
        assertThat("asdf").contains("d");
        assertThat("abc").startsWith("a");


        //JUnit4 then also gives us many other options

        //Assert.assertArrayEquals(); For comparing arrays and lists
        //Assert.assertFalse(); Checking something is false
        //Assert.assertNotEquals(); Doesn't matter what the value is along as its not this value
        //Assert.assertNotNull(); Isn't null
        //Assert.assertNotSame(); Same as NotEquals
        //Assert.assertSame(); Same as equals above
        //Assert.assertTrue(); Checking something is true
    }
}
