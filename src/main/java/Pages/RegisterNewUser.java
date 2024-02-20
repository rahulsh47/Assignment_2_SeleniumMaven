package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterNewUser {
    WebDriver driver;
    WebDriverWait wait;

    public RegisterNewUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href='register.htm']")
    WebElement Register;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement LastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement Address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement City;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement State;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement ZipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement PhoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement SSN;
    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement Username;
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement ConfirmPassword;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement RegisterButton;
//    By Register = By.cssSelector("a[href='register.htm']");

    public void enterFirstNameInInputBox(String firstname){
        wait.until(ExpectedConditions.visibilityOf(FirstName));
        FirstName.sendKeys(firstname);
    }

    public void enterLastNameInInputBox(String lastname){
        wait.until(ExpectedConditions.visibilityOf(LastName));
        LastName.sendKeys(lastname);
    }

    public void enterAddressInInputBox(String address){
        wait.until(ExpectedConditions.visibilityOf(Address));
        Address.sendKeys(address);
    }

    public void enterCityInInputBox(String city){
        wait.until(ExpectedConditions.visibilityOf(City));
        City.sendKeys(city);
    }

    public void enterStateInInputBox(String state){
        wait.until(ExpectedConditions.visibilityOf(State));
        State.sendKeys(state);
    }

    public void enterZipCodeInInputBox(String zipcode){
        wait.until(ExpectedConditions.visibilityOf(ZipCode));
        ZipCode.sendKeys(zipcode);
    }

    public void enterPhoneNumberInInputBox(String phonenumber){
        wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
        PhoneNumber.sendKeys(phonenumber);
    }

    public void enterSSNInInputBox(String ssn){
        wait.until(ExpectedConditions.visibilityOf(SSN));
        SSN.sendKeys(ssn);
    }

    public void enterUsernameInInputBox(String username){
        wait.until(ExpectedConditions.visibilityOf(Username));
        Username.sendKeys(username);
    }

    public void enterPasswordInInputBox(String password){
        wait.until(ExpectedConditions.visibilityOf(Password));
        Password.sendKeys(password);
    }

    public void enterConfirmPasswordInInputBox(String confirmpassword){
        wait.until(ExpectedConditions.visibilityOf(ConfirmPassword));
        ConfirmPassword.sendKeys(confirmpassword);
    }

    public void clickRegister(){
        RegisterButton.click();
    }
}
