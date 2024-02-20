package testFlow;

import Pages.LogIn;
import Pages.OpenNewAccount;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import testFlow.TestContextSetup;
import util.TextContextSetup;
import util.projectConfig;

import java.util.ArrayList;

public class Test_Parabank {
    TextContextSetup TextContext;

    @BeforeTest
    public void setup(){
        TextContext = new TextContextSetup();
        TextContext.base.InitializeDriver().get(" https://parabank.parasoft.com");
        TextContext.setup().getLoginPage().enterUsername("Chris");
        TextContext.setup().getLoginPage().enterPassword("123456");
        TextContext.setup().getLoginPage().clickLoginButton();
        if (TextContext.setup().getLoginPage().isError()){
            TextContext.setup().getLoginPage().enterUsername(projectConfig.Username);
            TextContext.setup().getLoginPage().enterPassword(projectConfig.Password);
            TextContext.setup().getRegister().enterFirstNameInInputBox(projectConfig.Username);
            TextContext.setup().getRegister().enterLastNameInInputBox(projectConfig.Password);
            TextContext.setup().getRegister().enterAddressInInputBox("BHU Lanka Road");
            TextContext.setup().getRegister().enterCityInInputBox("Varanasi");
            TextContext.setup().getRegister().enterStateInInputBox("Uttar Pradesh");
            TextContext.setup().getRegister().enterZipCodeInInputBox("232101");
            TextContext.setup().getRegister().enterPhoneNumberInInputBox("7275900001");
            TextContext.setup().getRegister().enterSSNInInputBox("456000212");
            TextContext.setup().getRegister().enterUsernameInInputBox("Rohit Sharma");
            TextContext.setup().getRegister().enterPasswordInInputBox("123456");
            TextContext.setup().getRegister().enterConfirmPasswordInInputBox("123456");
            TextContext.setup().getRegister().clickRegister();
        }
    }

    @Test(priority = 1)
    public void OpenNewAccount(){
        TextContext.setup().getOpennewaccount().clickonCreateNewAccount();
        TextContext.setup().getOpennewaccount().clickselect("SAVINGS");
        TextContext.setup().getOpennewaccount().ClickExistingAccount("20559");
        TextContext.setup().getOpennewaccount().clickopennewaccountbutton();
    }

    @Test(priority = 2)
    public void BillPay(){
        TextContext.setup().getBillpay().enterPayeeName("Rohit Sharma");
        TextContext.setup().getBillpay().enterPayeeAddress("BHU Lanka Road");
        TextContext.setup().getBillpay().enterPayeeCity("Varanasi");
        TextContext.setup().getBillpay().enterPayeeState("Uttar Pradesh");
        TextContext.setup().getBillpay().enterPayeeZipCode("232101");
        TextContext.setup().getBillpay().enterPayeePhoneNumber("7275900001");
        TextContext.setup().getBillpay().enterPayeeAccountNumber("20559");
        //TextContext.se
    }
}
