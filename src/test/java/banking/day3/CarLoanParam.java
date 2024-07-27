package banking.day3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoanParam {

    //Parameters URL get the value from day3 xml file
    @Parameters({"URL"})
    @Test
    public void carLoanLogin(String url)
    {
        System.out.println("Launching "+ url);
        System.out.println("Log-in into car loan");
    }
    @Test(dependsOnMethods = "carLoanCheckEligibility")
    public void carLoanLogout()
    {
        System.out.println("Logout from car loan banking");
    }

    @Test(dependsOnMethods = "carLoanLogin")
    public void carLoanCheckEligibility()
    {
        System.out.println(" -> You are eligible for car loan");
    }

    //This test method requires two parameters and run the same rest with different condition
    @Test(dataProvider = "getData")
    public void enterUserDetails(String firstName, int age)
    {
        System.out.println("->Enter your firstname : "+ firstName);
        System.out.println("->Enter your age : "+ age);
        if (age<18)
        {
            System.out.println("You are not eligible for loan...");
            Assert.assertTrue(false);
        } else if (age>18 && age<50)
        {
            System.out.println("Eligible but need to verify documents ");
        }
        else System.out.println("You exceeded the age limit ");

    }

    //This method will provide the data required for user details method
    @DataProvider
    public Object[][] getData()
    {
        Object[][] userData = new Object[3][2];//Creating object 3 sets of data(name & age)

        //Define the values - set 1
        userData[0][0] = "Mohammed";
        userData[0][1] = 28;

        //set 2
        userData[1][0] = "Jaffer";
        userData[1][1] = 17;

        //set 3
        userData[2][0] = "Thomas";
        userData[2][1] = 51;

        return userData;

    }


}

