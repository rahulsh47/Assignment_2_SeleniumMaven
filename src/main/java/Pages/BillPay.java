package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPay {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "a[href='/parabank/billpay.htm']")
    WebElement BillPay;
    @FindBy(css = "input[name='payee.name']") WebElement PayeeName;
    @FindBy(css = "input[name='payee.address.street']") WebElement PayeeAddress;
    @FindBy(css = "input[name='payee.address.city']") WebElement PayeeCity;

    @FindBy(css = "input[name='payee.address.state']") WebElement PayeeState;
    @FindBy(css = "input[name='payee.address.zipCode']") WebElement PayeeZipCode;
    @FindBy(id = "1b567ffd-06d0-443f-a5a6-e045fc91e21b") WebElement PayeePhoneNumber;
    @FindBy(name = "input[name='payee.accountNumber']") WebElement PayeeAccountNumber;
    @FindBy(css = "input[name='verifyAccount']") WebElement PayeeVerifyAccount;
    @FindBy(css = "input[name='amount']") WebElement AmountToBePaidByPayee;
    @FindBy(css = "select[name='fromAccountId']") WebElement FromAccountTobePaidByPayee;
    @FindBy(css = "input[value='Send Payment']") WebElement SendPayment;

    public BillPay(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBillPay(){
        wait.until(ExpectedConditions.visibilityOf(BillPay));
        BillPay.click();
    }

    public void enterPayeeName(String payeename){
        wait.until(ExpectedConditions.visibilityOf(PayeeName));
        PayeeName.sendKeys(payeename);
    }

    public void enterPayeeAddress(String payeeaddress){
        wait.until(ExpectedConditions.visibilityOf(PayeeAddress));
        PayeeAddress.sendKeys(payeeaddress);
    }

    public void enterPayeeCity(String payeecity){
        wait.until(ExpectedConditions.visibilityOf(PayeeCity));
        PayeeCity.sendKeys(payeecity);
    }

    public void enterPayeeState(String payeestate){
        wait.until(ExpectedConditions.visibilityOf(PayeeState));
        PayeeState.sendKeys(payeestate);
    }
    public void enterPayeeZipCode(String payeezipcode){
        wait.until(ExpectedConditions.visibilityOf(PayeeZipCode));
        PayeeZipCode.sendKeys(payeezipcode);
    }

    public void enterPayeePhoneNumber(String payeephonenumber){
        wait.until(ExpectedConditions.visibilityOf(PayeePhoneNumber));
        PayeePhoneNumber.sendKeys(payeephonenumber);
    }

    public void enterPayeeAccountNumber(String payeeaccountnumber){
        wait.until(ExpectedConditions.visibilityOf(PayeeAccountNumber));
        PayeeAccountNumber.sendKeys(payeeaccountnumber);
    }

    public void PayeeVerifyAccount(String verifyaccount){
        wait.until(ExpectedConditions.visibilityOf(PayeeVerifyAccount));
        PayeeVerifyAccount.sendKeys(verifyaccount);
    }

    public void enteramounttobepaid(String amounttobepaid){
        wait.until(ExpectedConditions.visibilityOf(AmountToBePaidByPayee));
        AmountToBePaidByPayee.sendKeys(amounttobepaid);
    }

    public void selectAccount(String fromaccounttobepaid){
        wait.until(ExpectedConditions.visibilityOf(FromAccountTobePaidByPayee));
        FromAccountTobePaidByPayee.sendKeys(fromaccounttobepaid);
    }

    public void clickSendPayment(String sendpayment){
        wait.until(ExpectedConditions.visibilityOf(SendPayment));
        SendPayment.sendKeys(sendpayment);
    }
}
