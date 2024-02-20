package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferFunds {
    WebDriver driver;
    WebDriverWait wait;

    public TransferFunds(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(css = "a[href='/parabank/transfer.htm']")
    WebElement TransferFunds;
    @FindBy(id = "amount") WebElement Amount;
    @FindBy(css = "#fromAccountId") WebElement FromAccount;
    @FindBy(css = "#toAccountId") WebElement ToAccount;
    @FindBy(css = "input[class='button']") WebElement TransferButton;

    public void ClickTransferFunds(){
        wait.until(ExpectedConditions.visibilityOf(TransferFunds));
        TransferFunds.click();
    }

    public void enteramount(String amount){
        wait.until(ExpectedConditions.visibilityOf(Amount));
        Amount.sendKeys(amount);
    }

    public void fromaccountId(String fromaccount){
        wait.until(ExpectedConditions.visibilityOf(FromAccount));
        FromAccount.sendKeys(fromaccount);
    }

    public void toaccountId(String toaccount){
        wait.until(ExpectedConditions.visibilityOf(ToAccount));
        ToAccount.sendKeys(toaccount);
    }

    public void clicktransferbutton(){
        wait.until(ExpectedConditions.visibilityOf(TransferButton));
        TransferButton.click();
    }
}
