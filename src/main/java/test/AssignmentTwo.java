package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page_ApiDemosApp;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AssignmentTwo {

    Page_ApiDemosApp oPage_ApiDemosApp;

    @Test
    public void apiDemosAppTest() throws URISyntaxException, MalformedURLException, InterruptedException {

        AndroidDriver driver = null;

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 2");   //Device Name - RZCWA12A1BJ, samsung SM-A346E
        options.setApp("C:\\Users\\Sunil\\Downloads\\ApiDemos-debug.apk");
        options.setAutomationName("UiAutomator2");

        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        System.out.println("Appium Driver is Successfully initialized");

        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        // Perform test actions
        oPage_ApiDemosApp.button_Accessibility.click();
        Thread.sleep(5000);
        oPage_ApiDemosApp.link_AccessibilityNodeProvider.click();
        Thread.sleep(5000);
        String AccessibilityNodeProviderText = oPage_ApiDemosApp.text_AccessibilityNodeProvider.getText();
        System.out.println("AccessibilityNodeProviderText: " + AccessibilityNodeProviderText);
        Assert.assertEquals(AccessibilityNodeProviderText, "Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.", "AccessibilityNodeProviderText After clicking on AccessibilityNodeProvider is matched" + AccessibilityNodeProviderText);
        boolean elementsVisble = oPage_ApiDemosApp.buttonColor_AccessibilityNodeProvider.isDisplayed();
        if (elementsVisble) {
            System.out.println("ColorBoxesUnderAccessibilityNodeProvider is displayed");
        } else {
            System.out.println("ColorBoxesUnderAccessibilityNodeProvider is not displayed");
        }
        driver.navigate().back();

        Thread.sleep(5000);
        oPage_ApiDemosApp.link_AccessibilityNodeQuerying.click();
        Thread.sleep(5000);
        int TotalCheckboxUnderAccessibilityNodeQueryingSize = oPage_ApiDemosApp.checkboxList_AccessibilityNodeQuerying.size();
        System.out.println("TotalCheckboxUnderAccessibilityNodeQueryingSize: " + TotalCheckboxUnderAccessibilityNodeQueryingSize);
        Assert.assertEquals(TotalCheckboxUnderAccessibilityNodeQueryingSize, 7, "TotalCheckboxUnderAccessibilityNodeQueryingSize is matched" + TotalCheckboxUnderAccessibilityNodeQueryingSize);
        for (int i = 0; i < TotalCheckboxUnderAccessibilityNodeQueryingSize; i++) {
            oPage_ApiDemosApp.checkboxList_AccessibilityNodeQuerying.get(i).click();
        }
        Thread.sleep(5000);
        String TaskTakeoutTrash = oPage_ApiDemosApp.text_TaskTakeoutTrash.getText();
        System.out.println("TaskTakeoutTrash: " + TaskTakeoutTrash);
        Assert.assertEquals(TaskTakeoutTrash, "Take out Trash", "TakeoutTrash is matched" + TaskTakeoutTrash);
        String TaskDoLaundry = oPage_ApiDemosApp.text_TaskDoLaundry.getText();
        System.out.println("TaskDoLaundry: " + TaskDoLaundry);
        Assert.assertEquals(TaskDoLaundry, "Do Laundry", "TaskDoLaundry is matched" + TaskDoLaundry);
        String TaskConquerWorld = oPage_ApiDemosApp.text_TaskConquerWorld.getText();
        System.out.println("TaskConquerWorld: " + TaskConquerWorld);
        Assert.assertEquals(TaskConquerWorld, "Conquer World", "TaskConquerWorld is matched" + TaskConquerWorld);
        String TaskNap = oPage_ApiDemosApp.text_TaskNap.getText();
        System.out.println("TaskNap: " + TaskNap);
        Assert.assertEquals(TaskNap, "Nap", "TaskNap is matched" + TaskNap);
        String TaskDoTaxes = oPage_ApiDemosApp.text_TaskDoTaxes.getText();
        System.out.println("TaskDoTaxes: " + TaskDoTaxes);
        Assert.assertEquals(TaskDoTaxes, "Do Taxes", "TaskDoTaxes is matched" + TaskDoTaxes);
        String TaskAbolishIRS = oPage_ApiDemosApp.text_TaskAbolishIRS.getText();
        System.out.println("TaskAbolishIRS: " + TaskAbolishIRS);
        Assert.assertEquals(TaskAbolishIRS, "Abolish IRS", "TaskAbolishIRS is matched" + TaskAbolishIRS);
        String TaskTeawithAuntSharon = oPage_ApiDemosApp.text_TaskTeawithAuntSharon.getText();
        System.out.println("TaskTeawithAuntSharon: " + TaskTeawithAuntSharon);
        Assert.assertEquals(TaskTeawithAuntSharon, "Tea with Aunt Sharon", "TaskTeawithAuntSharon is matched" + TaskTeawithAuntSharon);
        driver.navigate().back();

        Thread.sleep(5000);
        oPage_ApiDemosApp.link_CustomView.click();
        Thread.sleep(5000);
        boolean box1Visible = oPage_ApiDemosApp.box_underCustomViewBox1.isDisplayed();
        if (box1Visible) {
            System.out.println("box1 is displayed under customView");
        } else {
            System.out.println("box2 is not displayed");
        }

        boolean box2Visible = oPage_ApiDemosApp.box_underCustomViewBox2.isDisplayed();
        if (box2Visible) {
            System.out.println("box2 is displayed under customView");
        } else {
            System.out.println("box2 is not displayed");
        }
        // Close the driver properly
        driver.quit();

    }
}
