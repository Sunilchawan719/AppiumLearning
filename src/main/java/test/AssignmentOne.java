package test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.testng.Assert.assertTrue;

public class AssignmentOne {

    @Test
    public void qaTestApp() throws InterruptedException, URISyntaxException, MalformedURLException {
        // Set up Android Driver
        //Appium Code > Appium Server > Mobile

        //To Start Appium Service
        /* AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Sunil\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
        .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start(); */

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 2");   //Device Name - RZCWA12A1BJ, samsung SM-A346E
        options.setApp("C:\\Users\\Sunil\\Downloads\\QATestApp-1.1.apk");
        options.setAutomationName("UiAutomator2");

        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        System.out.println("Appium Driver is Successfully initialized");

        // Perform test actions
        //Appium Will Support Only Xpath, ID, ClassName, AccessibilityId , AndroidUIAutomator
        driver.findElement(By.id("com.qatestapp:id/emailTextField1")).sendKeys("helloworld@gmail.com");
        driver.findElement(AppiumBy.id("com.qatestapp:id/passwordTextField")).sendKeys("testing1234");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.qatestapp:id/LoginButton\"]")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("com.qatestapp:id/nameTextField")).sendKeys("Sunil");
        driver.findElement(AppiumBy.id("com.qatestapp:id/emailTextField")).sendKeys("sunil.chawan@healthgraph.in");
        driver.findElement(AppiumBy.id("com.qatestapp:id/phoneNumberTextField")).sendKeys("8867129876");
        driver.findElement(AppiumBy.id("com.qatestapp:id/subscribeCheckbox")).click();
        boolean bCancellButton = driver.findElement(By.id("com.qatestapp:id/button1")).isDisplayed();
        assertTrue(bCancellButton, "Cancel Button is displayed");
        driver.findElement(AppiumBy.id("com.qatestapp:id/button2")).click();

        // Close the driver properly
        driver.quit();
        //  service.stop();

    }
}
