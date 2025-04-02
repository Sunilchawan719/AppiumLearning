package test;

import org.testng.annotations.Test;
import pages.Page_ApiDemosApp;

public class AlertHandlingAutomationTest extends BaseTest {

    Page_ApiDemosApp oPage_ApiDemosApp;

    @Test
    public void SimpleAlertTest() throws InterruptedException {

        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);
        System.out.println("Performing Simple Alert test...");

        oPage_ApiDemosApp.button_App.click();
        System.out.println("App Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_AlertDialogs.click();
        System.out.println("AlertDialogs Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_OKCancelDialogWithMessage.click();
        System.out.println("OKCancelDialogWithMessage Button Clicked");
        Thread.sleep(2000);

        String AlertText = oPage_ApiDemosApp.text_AlertTitle.getText();
        System.out.println("Alert Title: " + AlertText);
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_AlertOk.click();
        System.out.println("OK Button Clicked");

        System.out.println("Simple Alert test completed.");

    }

    @Test
    public void SingleChoiceAlert() throws InterruptedException {

        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);
        System.out.println("Performing Single Choice Alert test...");

        oPage_ApiDemosApp.button_App.click();
        System.out.println("App Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_AlertDialogs.click();
        System.out.println("AlertDialogs Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_SingleChoiceList.click();
        System.out.println("SingleChoiceList Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.radioButton_StreetView.click();
        System.out.println("Street View Radio Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_AlertOk1.click();
        System.out.println("OK Button Clicked");
        Thread.sleep(2000);

        System.out.println("Single Choice Alert test completed.");
    }

    @Test
    public void HandlingEntryDialogTest() throws InterruptedException {

        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);
        System.out.println("Performing Handling Entry Dialog test...");

        oPage_ApiDemosApp.button_App.click();
        System.out.println("App Button Clicked");

        oPage_ApiDemosApp.button_AlertDialogs.click();
        System.out.println("AlertDialogs Button Clicked");

        oPage_ApiDemosApp.button_TextEntryDialog.click();
        System.out.println("TextEntryDialog Button Clicked");

        oPage_ApiDemosApp.input_Username.sendKeys("Sunil");
        System.out.println("Username Entered" + "Sunil");

        oPage_ApiDemosApp.input_Password.sendKeys("123456");
        System.out.println("Password Entered" + "123456");

        oPage_ApiDemosApp.button_Save.click();
        System.out.println("Save Button Clicked");

        Thread.sleep(2000);
        System.out.println("Handling Entry Dialog test completed.");

    }

    @Test
    public void HandlingRepeatAlarmTest() throws InterruptedException {

        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);
        System.out.println("Performing Handling Entry Dialog test...");

        oPage_ApiDemosApp.button_App.click();
        System.out.println("App Button Clicked");

        oPage_ApiDemosApp.button_AlertDialogs.click();
        System.out.println("AlertDialogs Button Clicked");

        oPage_ApiDemosApp.button_RepeatAlarm.click();
        System.out.println("Repeat Alarm Button Clicked");

        // Checking Monday to Friday
        selectCheckboxIfNotSelected(oPage_ApiDemosApp.checkbox_Monday, "Monday");
        selectCheckboxIfNotSelected(oPage_ApiDemosApp.checkbox_Tuesday, "Tuesday");
        selectCheckboxIfNotSelected(oPage_ApiDemosApp.checkbox_Wednesday, "Wednesday");
        selectCheckboxIfNotSelected(oPage_ApiDemosApp.checkbox_Thursday, "Thursday");
        selectCheckboxIfNotSelected(oPage_ApiDemosApp.checkbox_Friday, "Friday");

        // Unchecking Saturday and Sunday
        unselectCheckboxIfSelected(oPage_ApiDemosApp.checkbox_Saturday, "Saturday");
        unselectCheckboxIfSelected(oPage_ApiDemosApp.checkbox_Sunday, "Sunday");

        oPage_ApiDemosApp.button_OkOnRepeatAlarm.click();
        System.out.println("OK Button Clicked");
        Thread.sleep(2000);
        System.out.println("Handling Repeat Alarm test completed.");
    }
}
