package test;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Page_ApiDemosApp;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class BaseTest {

    Page_ApiDemosApp oPage_ApiDemosApp;
    public AndroidDriver driver;

    @BeforeClass
    public void LaunchApp() throws URISyntaxException, MalformedURLException {
        System.out.println("Launching the app...");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 2");   //Device Name - RZCWA12A1BJ, samsung SM-A346E
        options.setApp("C:\\Users\\Sunil\\Downloads\\ApiDemos-debug.apk");
        options.setAutomationName("UiAutomator2");

        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        System.out.println("Appium Driver is Successfully initialized");
    }

    public void LongPressAction(WebElement ele) {
        System.out.println("Performing long press action...");
        // Perform long press action
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
    }

    public void ScrollAction(WebElement ele, String direction) {
        System.out.println("Performing scroll action...");
        // Perform scroll action
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),
                "direction", direction));
    }

    public void SwipeAction(WebElement ele) {
        System.out.println("Performing swipe action...");
        // Perform swipe action
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(), "direction", "left", "percent", 0.75));
    }

    public void TapAction(WebElement ele) {
        System.out.println("Performing tap action...");
        // Perform tap action
        ((JavascriptExecutor) driver).executeScript("mobile: tapGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),
                "tapCount", 1));
    }

    public void DragAndDropAction(WebElement source, WebElement target) {
        System.out.println("Performing drag and drop action...");
        // Perform drag and drop action
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(), "toX", ((RemoteWebElement) target).getId(), "toY", 0.5));
    }

    public void selectCheckboxIfNotSelected(WebElement checkbox, String day) throws InterruptedException {
        String isChecked = checkbox.getAttribute("checked");
        if (isChecked == null || isChecked.equals("false")) {
            checkbox.click();
            Thread.sleep(500);  // Ensure UI updates
            System.out.println(day + " is selected");
        } else {
            System.out.println(day + " was already selected");
        }
    }

    public void unselectCheckboxIfSelected(WebElement checkbox, String day) {
        if (checkbox.isSelected()) {
            checkbox.click();
            System.out.println(day + " is deselected");
        } else {
            System.out.println(day + " was already deselected");
        }
    }

    @AfterClass
    public void CloseApp() {
        System.out.println("Closing the app...");
        driver.quit();
    }


}
