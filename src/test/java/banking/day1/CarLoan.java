package banking.day1;

import org.testng.annotations.Test;

public class CarLoan {

    @Test(groups = {"Smoke"})
    public void carLoanLogin()
    {
        System.out.println("Log-in into car loan");
    }
    @Test(priority = 10,groups = "Regression")
    public void carLoanLogout()
    {
        System.out.println("Logout from car loan banking");
    }

    @Test(groups = "Regression")
    public void carLoanCheckEligibility()
    {
        System.out.println("Logout from car loan eligibility");
    }

}

