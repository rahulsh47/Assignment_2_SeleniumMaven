package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class LogIn {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "input[name='username']")
    WebElement Username;

    @FindBy(css = "input[name='password']")
    WebElement Password;

    @FindBy(css = "input[value='Log In']")
    WebElement LoginButton;

    @FindBy(css = "a[href='register.htm']")
    WebElement RegisterButton;

    @FindBy(css = ".error")
    WebElement Error;
    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(Username));
        Username.sendKeys(username);
    }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(Password));
        Password.sendKeys(password);
    }
    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(LoginButton));
        LoginButton.click();
    }
    public void clickRegisterButton(String resigterbutton){
        wait.until(ExpectedConditions.visibilityOf(RegisterButton));
        RegisterButton.click();
    }
    public boolean isError(){
        try {
            String Result = "An internal error has occurred and has been logged.";
            return Result.equals(Error.getText());
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
