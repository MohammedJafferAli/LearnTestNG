package banking.day1;

import org.testng.annotations.Test;

public class MobileApp {

    @Test
    public void mobileAppLogin()
    {
        System.out.println("Log-in into internet banking");
    }
    @Test(priority = 10)
    public void mobileAppLogout()
    {
        System.out.println("Logout from internet banking");
    }

    @Test
    public void mobileAppStatement()
    {
        System.out.println("Your statement....");
    }

    @Test
    public void mobileAppVerifyUser()
    {
        System.out.println("Your statement....");
    }

}
