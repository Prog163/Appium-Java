import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class firstClass {

    @Test
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus_4_API_29");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10.1");
        caps.setCapability("appPackage", "com.android.joom");
        caps.setCapability("appActivity", "com.google.android.joom.activities.MainActivity");
        caps.setCapability("noReset", "true");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        driver.findElement(new By.ByXPath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        driver.findElement(new By.ById("00000000-0000-0028-ffff-ffff00000142\n")).click();
        driver.findElement(new By.ById("00000000-0000-0028-ffff-ffff0000018d\n")).click();



        driver.findElement(By.id("com.android.vending:id/search_box_text_input")).sendKeys("Google");


    }

}
