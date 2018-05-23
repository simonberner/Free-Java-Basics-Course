package junitlessons;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class B_CreatingATestFixture {
    //This method will be called before each test
    @BeforeEach
    public void SetUp() {
        System.out.println("I'm doing something to setup the system ready BEFORE each single test");
    }

    //This method will be called after each test
    @AfterEach
    public void Teardown() {
        System.out.println("I'm doing something to tidy up AFTER each single test");
    }

    @Test
    public void TestOne() {
        System.out.println("I'm a test1 doing some stuff");
    }

    @Test
    public void TestTwo() {
        System.out.println("I'm a test2 doing some stuff");
    }

    /**
     * The output of running with just the above code would be
     * <p>
     * I'm doing something to setup the system ready for the test
     * I'm a test doing some stuff
     * I'm doing something to tidy up after the test
     */

    //We can go one step further.
    //JUnit also has @BeforeClass and @AfterClass, these have to be static.
    @BeforeAll
    public static void SuiteSetUp() {
        System.out.println("@BeforeClass running before ALL tests: I'm doing something to setup the system ready for this test fixture");
    }

    //This method will be called after each test
    @AfterAll
    public static void SuiteTeardown() {
        System.out.println("@AfterClass running after ALL tests: I'm doing something to tidy up after this test fixture");
    }

    /**
     * The output of running with just the above code would be
     *
     * I'm doing something to setup the system ready for this test fixture
     * I'm doing something to setup the system ready for the test
     * I'm a test doing some stuff
     * I'm doing something to tidy up after the test
     * I'm doing something to tidy up after this test fixture
     */
}
