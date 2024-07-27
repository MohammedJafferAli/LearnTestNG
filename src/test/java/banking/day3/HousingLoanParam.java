package banking.day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HousingLoanParam {


    @Test@Parameters({"URL"})
    public void homeLoanLogin(String url)
    {
        System.out.println("Launching "+ url);
        System.out.println("Log-in into housing loan page");
    }
    @Test(dependsOnMethods = "homeLoanCheckDocuments" )
    public void homeLoanLogout()
    {
        System.out.println("Logout from housing loan");
    }

    @Test(dependsOnMethods = "homeLoanLogin")
    public void homeLoanCheckDocuments()
    {
        System.out.println(" -> Verifying loan documents...");
    }

}
