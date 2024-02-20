package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewAccount {
    WebDriver driver;
    WebDriverWait wait;

    public OpenNewAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href='/parabank/openaccount.htm']")
    WebElement CreateNewAccount;
    @FindBy(css = " #type") WebElement AccountType;
    @FindBy(css = "#fromAccountId") WebElement ExistingAccount;
    @FindBy(css = "input[class='button']") WebElement OpenNewAccountButton;

    @FindBy(css = ".input.ng-pristine.ng-valid.ng-not-empty.ng-touched")
    WebElement Select;

    @FindBy(css = "#fromAccountId")
    WebElement Select2;

    public void clickonCreateNewAccount(){
        wait.until(ExpectedConditions.visibilityOf(CreateNewAccount));
        CreateNewAccount.click();
    }

//    public void selectaccounttype(String accounttype){
//        wait.until(ExpectedConditions.visibilityOf(AccountType));
//        AccountType.sendKeys(accounttype);
//    }

    public void selectexistingaccounttype(String existingaccount){
        wait.until(ExpectedConditions.visibilityOf(ExistingAccount));
        ExistingAccount.sendKeys(existingaccount);
    }

    public void clickopennewaccountbutton(){
        wait.until(ExpectedConditions.visibilityOf(OpenNewAccountButton));
        OpenNewAccountButton.click();
    }

    public void ClickExistingAccount(String string2){
        Select existingAccount = new Select(Select);
        existingAccount.selectByVisibleText(string2);
    }

    public void clickselect(String string){
        Select s1 = new Select(Select);
        s1.selectByVisibleText(string);
    }
}
