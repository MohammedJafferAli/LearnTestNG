package annotation.attributes;

import org.testng.Assert;
import org.testng.annotations.*;


public class ForTestAnnotation {

    @Test(priority = 1, groups = {"Sanity","Smoke","Regression"})
    public void login()
    {
        System.out.println("User log-in successfully");
    }

    @Test(priority = 2,groups = {"Smoke"})
    public void bbPlanValidation()
    {
        System.out.println("Broadband plans are displayed");
    }
    @Test(priority = 3)
    public void bbExtrasValidation()
    {
        Assert.assertTrue(false); //Added false to check the dependsOnMethod annotation attribute
        System.out.println("BB extras are displayed");
    }
    @Test(priority = 4,groups = {"Regression"})
    public void dvPlanValidation()
    {
        System.out.println("Digital Voice are displayed");
    }

    @Test(priority = 7, dependsOnMethods = {"bbExtrasValidation"})
    public void TVPlanValidation()
    {
        System.out.println("TV plans are displayed");
    }
    @Test(priority = 100,enabled = false)
    public void legalBitOnShopPage()
    {
        System.out.println(" Legal Bit...");
    }

    // After Annotations

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
    // After Annotations
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
}
