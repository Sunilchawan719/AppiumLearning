package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page_ApiDemosApp {
    private AndroidDriver driver;

    public Page_ApiDemosApp(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
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


}
