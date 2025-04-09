import com.aventstack.extentreports.MediaEntityBuilder;
import com.mitu.selenium.utils.Constants;
import com.mitu.selenium.utils.ScreenshotUtil;
import com.mitu.selenium.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class EmailCheck extends BaseTest {

    @Test()
    public void login() throws IOException {
        test = extent.createTest("Login Test");
        driver.get(Constants.URL);

        Utils.sleep(5);

        test.info("Nhập Username");
        WebElement usernameTf = driver.findElement(By.xpath(Constants.usernameXpath));
        usernameTf.sendKeys(Constants.USERNAME);

        test.info("Nhập Password");
        WebElement passwordTf = driver.findElement(By.xpath(Constants.passwordXpath));
        passwordTf.sendKeys(Constants.PASSWORD);

        test.info("Nhấn nút Login");
        WebElement loginButton = driver.findElement(By.xpath(Constants.loginXpath));
        loginButton.click();

        Utils.sleep(5);

        try {
            ScreenshotUtil.captureScreenshot(driver, "login");
            test.info("Login Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("./screenshots/login.png").build());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    @Test(priority = 1)
    public void openCalendar() {
        test = extent.createTest("Open Calendar Test");

        try {
            driver.findElement(By.xpath(Constants.closePopupXpath)).click();
            Utils.sleep(1);
            test.info("Đóng popup đòi tiền");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        test.info("Mở Calendar");
        WebElement calendar = driver.findElement(By.xpath(Constants.calendarXpath));
        calendar.click();
        Utils.sleep(1);

        WebElement customer = driver.findElement(By.xpath(Constants.customerXpath));
        customer.click();
///html/body/div[1]/div/div[4]/div/div[2]/form/input
        Utils.sleep(3);
        WebElement searchTf = driver.findElement(By.xpath(Constants.searchXpath));
        searchTf.sendKeys(Constants.SearchCharacter);
        Utils.sleep(3);

        WebElement element = driver.findElement(By.xpath(Constants.searchResultXpath));
        element.click();

        Utils.sleep(2);

        test.pass("Calendar Opened");

        try {
            ScreenshotUtil.captureScreenshot(driver, "calendar");
            test.info("Calendar Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("./screenshots/calendar.png").build());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    @Test(priority = 2)
    public void createNewJob() {
        test = extent.createTest("New Job Test");

        WebElement jobName = driver.findElement(By.xpath(Constants.jobNameXpath));
        jobName.click();
        Utils.sleep(1);
        test.info("Tạo job mới");

        WebElement newButton = driver.findElement(By.xpath(Constants.newButtonXpath));
        newButton.click();
        Utils.sleep(1);

        WebElement oneHour = driver.findElement(By.xpath(Constants.oneHourXpath));
        oneHour.click();
        Utils.sleep(1);

        test.info("Mở Assign");
        WebElement assignButton = driver.findElement(By.xpath(Constants.assignButtonXpath));
        assignButton.click();
        Utils.sleep(2);

        WebElement scrollableDiv = driver.findElement(By.xpath(Constants.scrollViewXpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 300;", scrollableDiv);

        Utils.sleep(1);

        WebElement qaButton = driver.findElement(By.xpath(Constants.qaXpath));
        qaButton.click();
        Utils.sleep(1);

        WebElement saveButton = driver.findElement(By.xpath(Constants.saveButtonXpath));
        saveButton.click();
        Utils.sleep(3);

        test.info("Mở Unconfirmed");
        WebElement unconfirmed = driver.findElement(By.xpath(Constants.unconfirmedXpath));
        unconfirmed.click();
        Utils.sleep(1);

        test.info("Click complete");
        WebElement complete = driver.findElement(By.xpath(Constants.completeXpath));
        complete.click();
        Utils.sleep(1);

        test.info("Nhấn Confirm");
        WebElement confirm = driver.findElement(By.xpath(Constants.confirmXpath));
        confirm.click();

        try {
            ScreenshotUtil.captureScreenshot(driver, "confirmed");
            test.info("Confirmed Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("./screenshots/confirmed.png").build());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        Utils.sleep(3);
        test.info("Tất cả các bước đều xong");
    }
}
