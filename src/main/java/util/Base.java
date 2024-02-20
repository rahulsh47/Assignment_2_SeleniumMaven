package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    WebDriver driver;


    public WebDriver InitializeDriver(){
        if (driver == null){
            if (projectConfig.browser.equals("Chrome")){
                driver = new ChromeDriver();
            }else if (projectConfig.browser.equals("Firefox")){
                driver = new FirefoxDriver();
            }else if(projectConfig.browser.equals("Edge")){
                driver = new EdgeDriver();
            }
        }
        return  driver;
    }
}
