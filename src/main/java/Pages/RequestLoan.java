package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestLoan {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "a[href='/parabank/requestloan.htm']")
    WebElement ClickRequestLoan;
    @FindBy(css = "#amount") WebElement LoanAmount;
    @FindBy(css = "#downPayment") WebElement DownPayment;
    @FindBy(css = "#fromAccountId") WebElement FromAccount_Loan;
    @FindBy(css = "input[value='Apply Now']") WebElement ApplyNow;

    public RequestLoan(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRequestLoan(){
        wait.until(ExpectedConditions.visibilityOf(ClickRequestLoan));
        ClickRequestLoan.click();
    }

    public void enterLoanAmount(String loanamount){
        wait.until(ExpectedConditions.visibilityOf(LoanAmount));
        LoanAmount.sendKeys(loanamount);
    }

    public void enterDownPayment(String downpayment){
        wait.until(ExpectedConditions.visibilityOf(DownPayment));
        DownPayment.sendKeys(downpayment);
    }

    public void loanFromAccount(String loanfromaccount){
        wait.until(ExpectedConditions.visibilityOf(FromAccount_Loan));
        FromAccount_Loan.sendKeys(loanfromaccount);
    }

    public void clickApplyNow(String applynow){
        wait.until(ExpectedConditions.visibilityOf(ApplyNow));
        ApplyNow.click();
    }
}
