package banking.day1;

import org.testng.annotations.Test;

public class HousingLoan {


    @Test(groups = {"Smoke"})
    public void homeLoanLogin()
    {
        System.out.println("Log-in into housing loan page");
    }
    @Test(priority = 10)
    public void homeLoanLogout()
    {
        System.out.println("Logout from housing loan");
    }

    @Test(groups = "Regression")
    public void homeLoanCheckDocuments()
    {
        System.out.println(" Verifying loan documents...");
    }

}
