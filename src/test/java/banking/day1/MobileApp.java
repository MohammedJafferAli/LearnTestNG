package banking.day1;

import org.testng.annotations.Test;

public class MobileApp {

    @Test(groups = {"Smoke"})
    public void mobileAppLogin()
    {
        System.out.println("Log-in into Mobile app banking");
    }
    @Test(priority = 10)
    public void mobileAppLogout()
    {
        System.out.println("Logout from Mobile app banking");
    }

    @Test(groups = "Regression")
    public void mobileAppStatement()
    {
        System.out.println("Your statement....");
    }

    @Test
    public void mobileAppVerifyUser()
    {
        System.out.println(" Authenticate Mobile app user ...");
    }

}
