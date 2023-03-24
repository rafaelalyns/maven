package Tasks;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class LoginTask {
    private LoginPage loginPage;
    
    private WebDriver driver;
    
    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        
}
    public void efetuarLogin() {
        loginPage.getUsernameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }
}
