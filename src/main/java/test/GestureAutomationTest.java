package test;

import org.testng.annotations.Test;
import pages.Page_ApiDemosApp;

public class GestureAutomationTest extends BaseTest {
    Page_ApiDemosApp oPage_ApiDemosApp;

    @Test
    public void longPressTest() throws InterruptedException {
        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        System.out.println("Performing long press test...");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Views.click();
        System.out.println("Views Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_ExpandableLists.click();
        System.out.println("ExpandableLists Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_CustomAdapter.click();
        System.out.println("CustomAdapter Button Clicked");
        Thread.sleep(2000);

        // Performing Long Press on element
        LongPressAction(oPage_ApiDemosApp.button_CatNames);
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_SampleAction.click();
        System.out.println("Clicked on Sample Action");

        System.out.println("Long press test completed.");
    }

    @Test
    public void ScrollTest() throws InterruptedException {
        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        System.out.println("Performing scroll test...");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Views.click();
        System.out.println("Views Button Clicked");
        Thread.sleep(5000);

        // Performing Scroll on element
        scrollToElement(driver, "WebView3");
        System.out.println("Scroll is performed on WebView3");

        if (oPage_ApiDemosApp.button_WebView3.isDisplayed()) {
            System.out.println("WebView3 is displayed");
        } else {
            System.out.println("WebView3 is not displayed");
        }

        Thread.sleep(5000);
        scrollToElement(driver, "Animation");
        System.out.println("Scroll is performed on Animation");

        if (oPage_ApiDemosApp.button_Animation.isDisplayed()) {
            System.out.println("Animation is displayed");
        } else {
            System.out.println("Animation is not displayed");
        }

        oPage_ApiDemosApp.button_Animation.click();
        System.out.println("Clicked on Animation");

        System.out.println("Scroll test completed.");
    }

    @Test
    public void SwipeTest() throws InterruptedException {
        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        System.out.println("Performing swipe test...");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Views.click();
        System.out.println("Views Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Gallery.click();
        System.out.println("Gallery Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Photos.click();
        System.out.println("Photos Button Clicked");
        Thread.sleep(2000);

        // Performing Swipe on element
        SwipeAction(oPage_ApiDemosApp.button_ImageView5);
        Thread.sleep(4000);
        System.out.println("Swipe is performed on ImageView5");

        if (oPage_ApiDemosApp.button_ImageView5.isDisplayed()) {
            System.out.println("ImageView5 is displayed");
        } else {
            System.out.println("ImageView5 is not displayed");
        }

        System.out.println("Swipe test completed.");
    }

    @Test
    public void dragAndDropTest() throws InterruptedException {
        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        System.out.println("Performing drag and drop test...");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_Views.click();
        System.out.println("Views Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_DragAndDrop.click();
        System.out.println("DragAndDrop Button Clicked");
        Thread.sleep(2000);

        // Performing Drag and Drop on element
        try {
        DragAndDropAction(oPage_ApiDemosApp.button_DragDot1, oPage_ApiDemosApp.button_DragDot2);
        Thread.sleep(4000);
        System.out.println("Drag and Drop is performed");

        String droppedText = oPage_ApiDemosApp.text_DroppedText.getText();
        System.out.println("Dropped Text: " + droppedText);

        if (droppedText.equals("Dropped!")) {
            System.out.println("Drag and Drop action was successful.");
        } else {
            System.out.println("Drag and Drop action failed.");
        }

        System.out.println("Drag and drop test completed.");
        } catch (Exception e) {
            System.out.println("Drag and drop action failed: " + e.getMessage());
        }
    }

    @Test
    public void tapTest() throws InterruptedException {
        oPage_ApiDemosApp = new Page_ApiDemosApp(driver);

        System.out.println("Performing tap test...");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_TapAnimation.click();
        System.out.println("TapAnimation Button Clicked");
        Thread.sleep(2000);

        oPage_ApiDemosApp.button_ViewFlip.click();
        System.out.println("ViewFlip Button Clicked");
        Thread.sleep(2000);

        // Performing Tap on element
        TapAction(oPage_ApiDemosApp.button_Flip);
        Thread.sleep(4000);
        System.out.println("Tap is performed on Flip");

        System.out.println("Tap test completed.");
    }

}
