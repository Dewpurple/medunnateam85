package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminTestItemPage {
    public AdminTestItemPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//li[@class='dropdown nav-item']")
    public WebElement accountMenuButton;
    @FindBy(xpath="//*[text()='Sign in']")
    public WebElement aSignInButton;
    @FindBy(xpath="//input[@name='username']")
    public WebElement aUsernameButton;
    @FindBy(xpath="//input[@name='password']")
    public WebElement aPassword;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement aSubmitButton;
    @FindBy(xpath="//*[text()='Items&Titles']")
    public WebElement aItemsTitlesButton;
    @FindBy(xpath="(//*[text()='Test Item'])[1]")
    public WebElement testItemButton;

    @FindBy(id="c-test-item-heading")
    public WebElement testItemsHeader;

    @FindBy(xpath="//*[text()='Create a new Test Item']")
    public WebElement createTestItemButton;

    @FindBy(xpath="//input[@name='name']")
    public WebElement nameTextBox;
    @FindBy(xpath="//input[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath="//input[@name='price']")
    public WebElement priceTextBox;
    @FindBy(xpath="//input[@name='defaultValMin']")
    public WebElement defaultMinValueTextBox;

    @FindBy(xpath="//input[@name='defaultValMax']")
    public WebElement defaultMaxValueTextBox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveCreateTestbutton;
    @FindBy(xpath="(//*[text()='View'])[1]")
    public WebElement firstTestItemViewButton;
    @FindBy(xpath="(//*[contains(text(),'Test Item')])[2]")
    public WebElement firstTestItemHeader;
    @FindBy(xpath="//*[text()='Name']")
    public WebElement nameOfTestItem;
    @FindBy(xpath="//*[text()='Description']")
    public WebElement descriptionOfTestItem;
    @FindBy(xpath="//*[text()='Price']")
    public WebElement priceOfTestItem;
    @FindBy(xpath="//*[text()='Default Max. Value']")
    public WebElement defMaxValueOfTestItem;
    @FindBy(xpath="//*[text()='Default Min. Value']")
    public WebElement defMinValueOfTestItem;
    @FindBy(xpath="//*[text()='Created Date']")
    public WebElement createdDateOfTestItem;
    @FindBy(xpath="//input[@name='createdDate']")
    public WebElement createdDateTextBoxOfTestItem;
    @FindBy(xpath="(//*[text()='Edit'])[1]")
    public WebElement firstTestItemEditButton;
    @FindBy(xpath="(//*[text()='Delete'])[1]")
    public WebElement firstTestItemDeletebutton;
    @FindBy(xpath="//button[@id='jhi-confirm-delete-cTestItem']")
    public WebElement confirmDeleteButton;
    @FindBy(xpath="//*[contains(text(),'A Test Item is deleted with identifier')]")
    public WebElement deleteTestItemSuccesMessage;
    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement failedMessageForDeletingTestItem;
    //
    //*[contains(text(),'Internal server error.')]
    @FindBy(xpath = "//*[text()='»»']")
    public WebElement lastPage;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement succesMessageForTestCreated;

    @FindBy(xpath = "//*[contains(text(),'created')]")
    public WebElement createdMessage;
//*[@id="root"]/div/div/div[1]/div/div/div[1]

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement internalServerError;
}
