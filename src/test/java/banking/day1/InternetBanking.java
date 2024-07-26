package banking.day1;

import org.testng.annotations.Test;

public class InternetBanking {

    @Test(groups = {"Smoke"})
    public void internetBankLogin()
    {
        System.out.println("Log-in into internet banking");
    }
    @Test(priority = 10)
    public void internetBankLogout()
    {
        System.out.println("Logout from internet banking");
    }

    @Test(groups = "Regression")
    public void internetBankStatement()
    {
        System.out.println("Your statement....");
    }
}
