package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page_ApiDemosApp {
    private AndroidDriver driver;

    public Page_ApiDemosApp(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
    public WebElement button_Accessibility;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")
    public WebElement link_AccessibilityNodeProvider;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.\"]")
    public WebElement text_AccessibilityNodeProvider;

    @FindBy(xpath = "//android.widget.LinearLayout/android.view.View")
    public WebElement buttonColor_AccessibilityNodeProvider;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")
    public WebElement link_AccessibilityNodeQuerying;

    @FindBy(xpath = "(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])")
    public List<WebElement> checkboxList_AccessibilityNodeQuerying;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Take out Trash\"]")
    public WebElement text_TaskTakeoutTrash;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Do Laundry\"]")
    public WebElement text_TaskDoLaundry;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Conquer World\"]")
    public WebElement text_TaskConquerWorld;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Nap\"]")
    public WebElement text_TaskNap;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Do Taxes\"]")
    public WebElement text_TaskDoTaxes;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Abolish IRS\"]")
    public WebElement text_TaskAbolishIRS;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Task Tea with Aunt Sharon\"]")
    public WebElement text_TaskTeawithAuntSharon;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Custom View\"]")
    public WebElement link_CustomView;

    @FindBy(xpath = "(//android.view.View[@text=\"Off\"])[1]")
    public WebElement box_underCustomViewBox1;

    @FindBy(xpath = "(//android.view.View[@text=\"Off\"])[2]")
    public WebElement box_underCustomViewBox2;

    /// //////////////////////////////////////////////////////
    //Gesture handling Xpath
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    public WebElement button_Views;

    @AndroidFindBy(accessibility = "Expandable Lists")
    public WebElement button_ExpandableLists;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
    public WebElement button_CustomAdapter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cat Names\"]")
    public WebElement button_CatNames;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample action\"]")
    public WebElement button_SampleAction;

    @AndroidFindBy(accessibility = "WebView3")
    public WebElement button_WebView3;

    @AndroidFindBy(accessibility = "Animation")
    public WebElement button_Animation;

    @AndroidFindBy(accessibility = "Gallery")
    public WebElement button_Gallery;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Photos\"]")
    public WebElement button_Photos;

    @AndroidFindBy(xpath = "//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[3]")
    public WebElement button_ImageView5;

    @AndroidFindBy(accessibility = "Drag and Drop")
    public WebElement button_DragAndDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement button_DragDot1;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    public WebElement button_DragDot2;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement text_DroppedText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
    public WebElement button_TapAnimation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"View Flip\"]")
    public WebElement button_ViewFlip;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Flip\"]")
    public WebElement button_Flip;

    //Alert Dialog handling Xpath
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
    public WebElement button_App;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")
    public WebElement button_AlertDialogs;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK Cancel dialog with a message\"]")
    public WebElement button_OKCancelDialogWithMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]")
    public WebElement text_AlertTitle;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement button_AlertOk;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Single choice list\"]")
    public WebElement button_SingleChoiceList;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Street view\"]")
    public WebElement radioButton_StreetView;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement button_AlertOk1;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Text Entry dialog\"]")
    public WebElement button_TextEntryDialog;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/username_edit\"]")
    public WebElement input_Username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/password_edit\"]")
    public WebElement input_Password;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement button_Save;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Repeat alarm\"]")
    public WebElement button_RepeatAlarm;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Monday\"]")
    public WebElement checkbox_Monday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Tuesday\"]")
    public WebElement checkbox_Tuesday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Wednesday\"]")
    public WebElement checkbox_Wednesday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Thursday\"]")
    public WebElement checkbox_Thursday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Friday\"]")
    public WebElement checkbox_Friday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Saturday\"]")
    public WebElement checkbox_Saturday;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Every Sunday\"]")
    public WebElement checkbox_Sunday;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement button_OkOnRepeatAlarm;

}
