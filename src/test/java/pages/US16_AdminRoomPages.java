package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US16_AdminRoomPages {
    public US16_AdminRoomPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='username']")
    public WebElement US16_UsernameTextbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement US16_PasswordTextbox;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement US16_LastSignInButton;

    @FindBy(xpath ="//*[text()='Administration']" )
    public WebElement US16_AdminButton;

    @FindBy(xpath = "//*[.='Items&Titles']")
    public WebElement US16_itemsTitles;

    @FindBy(xpath = "(//*[text()='Room'])[1]")
    public WebElement US16_roomButton;

    @FindBy(xpath = "//*[.='Rooms']")
    public WebElement US16_VerifyRoomsPage;

    @FindBy(xpath = "//*[text()='Create a new Room']")
    public WebElement US16_createANewRoomButton;

    @FindBy(xpath = "//*[text()='Create or edit a Room']")
    public WebElement US16_VerifyCreateANewRoomButton;

    @FindBy(xpath = "//*[@id='room-roomNumber']")
    public WebElement US16_roomNumberBox;

    @FindBy(xpath = "//*[@id='room-status']")
    public WebElement US16_clickStatusBox;

    @FindBy(xpath = "//*[@id='room-price']")
    public WebElement US16_priceTextBox;

    @FindBy(xpath = "//*[@id=\"room-description\"]")
    public WebElement US16_description;

    @FindBy(xpath = "//*[@id=\"room-createdDate\"]")
    public WebElement US16_createdDateTextBox;

    @FindBy(xpath = "//*[@id=\"room-createdDate\"]")
    public WebElement US16_createdDateTextBoxforActions;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement US16_SaveButton_on_CreateRoom_Page;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement US16_toasted_Saved_message_Room;

    @FindBy(xpath = "//*[text()='Created Date']")
    public WebElement US16_CreatedDateOnRoomspage;

    @FindBy(xpath = "//*[@id='room-createdDate']")
    public WebElement US16_Select_DateOnRoomspage;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> US16_allRows;

    @FindBy(xpath = "//span/span[.='Edit']")
    public List<WebElement> US16_editElements;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[3]/span/span")
    public WebElement US16_deleteWebElements;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[1]/h5/span")
    public WebElement US16_confirm_delete_operation_WebElements;

    @FindBy(xpath = "//*[@id=\"jhi-confirm-delete-room\"]/svg/path")
    public WebElement US16_confirm_2_deleteWebElements;

    @FindBy(xpath = "//*[@id=\"jhi-confirm-delete-room\"]")
    public WebElement US16_confirmJS_2_deleteWebElements;

    @FindBy(xpath = " //*[@id=\"room-roomType\"]")
    public WebElement US16_RoomTypes;

    @FindBy(tagName = "select")
    public WebElement US16_RoomTypSlct;

        @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]/div/form/div[1]/div/div")
    public WebElement US16_invalid_RM_Feedbacks;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement US16_invalid_RM_Feedbacks2;

    @FindBy(tagName = "select")
    public WebElement US16_roomTypesSelect;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement US16_statusCheckBox;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement US16_invalid_Price_Feedbacks;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement US16_invalid_Price_FeedbacksEmpty;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement US16_descriptionTextBox;

    @FindBy(id = "jhi-confirm-delete-room")
    public WebElement US16_deleteConfirm;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement US16_Edit;

    @FindBy(xpath = "//*[text()='Create or edit a Room']")
    public WebElement US16_Create_or_edit_RoomVerify;

    @FindBy(xpath = "//*[@id=\"room-roomNumber\"]")
    public WebElement US16_Create_or_edit_Room_page_RoomNumber;


}
