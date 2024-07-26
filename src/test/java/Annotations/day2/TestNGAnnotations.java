package Annotations.day2;

/*
Create methods for every annotations in testng to know how each annotation control the execution
* */

import org.testng.annotations.*;
//* represent importing all the methods in the annotations class

public class TestNGAnnotations {

    //The order of writing the methods inside a class in a sequence is optional
    //When no priority testcases are specified all the test methods in a class execute them in alphabet order

    @Test
    public void bbPlanValidation()
    {
        System.out.println("Broadband plans are displayed");
    }
    @Test
    public void bbExtrasValidation()
    {
        System.out.println("BB extras are displayed");
    }
    @Test
    public void dvPlanValidation()
    {
        System.out.println("Digital Voice are displayed");
    }


    @BeforeMethod
    public void performServiceCheck()
    {
        System.out.println("Displaying eligible products");
    }
    @BeforeSuite
    public void installAppOnSimulator()
    {
        System.out.println("App installed on IOS device");
    }
    @BeforeTest
    public void loginToApp()
    {
        System.out.println("Login successful");
    }

    @BeforeClass
    public void navigateToShop()
    {
        System.out.println("Successfully navigated to shop page");
    }
    @Test
    public void TVPlanValidation()
    {
        System.out.println("TV plans are displayed");
    }

    @AfterSuite
    public void uninstallAppOnSimulator()
    {
        System.out.println("App uninstalled successfully");
    }
    @AfterTest
    public void logOutFromApp()
    {
        System.out.println("Logout successful");
    }

//AfterClass and AfterMethod methods removed to see the order of execution. As there are no compulsion to write after method for every before method
}
