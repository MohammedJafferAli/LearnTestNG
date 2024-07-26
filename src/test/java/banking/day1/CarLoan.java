package banking.day1;

import org.testng.annotations.Test;

public class CarLoan {

    @Test
    public void carLoanLogin()
    {
        System.out.println("Log-in into internet banking");
    }
    @Test(priority = 10)
    public void carLoanLogout()
    {
        System.out.println("Logout from internet banking");
    }

    @Test
    public void carLoanCheckEligibility()
    {
        System.out.println("Logout from internet banking");
    }

}

