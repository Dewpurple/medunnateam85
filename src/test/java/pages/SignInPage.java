package pages;

import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utilities.Driver;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;
    @FindBy(linkText = "Sign in")
    public WebElement signInMenuButton;
    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "password")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;
}