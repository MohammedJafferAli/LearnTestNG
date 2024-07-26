package banking.day1;

import org.testng.annotations.Test;

public class HousingLoan {


    @Test
    public void homeLoanLogin()
    {
        System.out.println("Log-in into internet banking");
    }
    @Test(priority = 10)
    public void homeLoanLogout()
    {
        System.out.println("Logout from internet banking");
    }

    @Test
    public void homeLoanCheckDocuments()
    {
        System.out.println("Logout from internet banking");
    }

}
