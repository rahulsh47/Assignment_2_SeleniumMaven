package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    LogIn login;

    RegisterNewUser register;
    BillPay billpay;
    OpenNewAccount opennewaccount;
    RegisterNewUser registernewuser;
    RequestLoan requestloan;
    TransferFunds transferfunds;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
        login = new LogIn(driver);
        billpay = new BillPay(driver);
        opennewaccount = new OpenNewAccount(driver);
        registernewuser = new RegisterNewUser(driver);
        requestloan = new RequestLoan(driver);
        transferfunds = new TransferFunds(driver);
    }
    public LogIn getLoginPage(){  return login; }

    public RegisterNewUser getRegister(){ return register ;}
    public BillPay getBillpay(){ return billpay ;}
    public OpenNewAccount getOpennewaccount(){ return opennewaccount ;}
    public RequestLoan getRequestloan(){ return requestloan ;}
    public TransferFunds getTransferfunds(){ return transferfunds ;}
}
