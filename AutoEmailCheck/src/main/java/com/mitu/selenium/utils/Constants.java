package com.mitu.selenium.utils;

public class Constants {
    public final static String URL = "https://beta.gorilladesk.com/auth/login";
    public final static String REPORT_PATH = "src/reports/TestReport.html";
    public final static String CHROME_DRIVER_PATH = "src/main/resources/chromedriver";

    public final static String USERNAME = "nlsoft";
    public final static String PASSWORD = "Ahihi123";

    public final static String SearchCharacter = "111242";

    //Element locators
    public final static String usernameXpath = "//*[@id=\"login-form\"]/section/div[1]/input";
    public final static String passwordXpath = "//*[@id=\"login-form\"]/section/div[2]/input";
    public final static String loginXpath = "//*[@id=\"login-form\"]/section/div[3]";

    public final static String closePopupXpath = "//*[@id=\"smsChargeFailed\"]/div/div[1]/div[2]";

    public final static String calendarXpath = "//*[@id=\"header_v2\"]/div/div[1]/div[2]";
    public final static String customerXpath = "//*[@id=\":r0:\"]/div/div/div[1]/ul/li[3]/a/p";
    public final static String searchXpath = "//*[@id="wrapper-customer-list"]/div[2]/div/div[1]/div[1]/div[2]/input";
    public final static String searchResultXpath = "//*[contains(text(), 'Test auto trigger')]";

    public final static String jobNameXpath = "//*[@id=\"customer_detail_layout\"]/div[1]/div[2]/div[3]/a[2]";
    public final static String newButtonXpath = "//*[@id=\"customer_detail_layout\"]/div[2]/div/div/div[1]/div[4]";

    public final static String oneHourXpath = "//*[@id=\"show_list_services\"]/div[2]/ul/li[3]";

    public final static String assignButtonXpath = "//*[@id=\"show_list_schedule_job_preview\"]/div";
    public final static String scrollViewXpath = "/html/body/div[6]/div/div/div[2]/div[2]/div/div[1]";

    public final static String qaXpath = "//*[@id=\"show_list_schedule_job_preview\"]/li[2]";

    public final static String saveButtonXpath = "/html/body/div[6]/div/div/div[2]/div[3]/div";

    public final static String unconfirmedXpath = "//*[contains(text(), 'Unconfirmed')]";

    public final static String completeXpath = "//*[contains(text(), 'Completed')]";
    public final static String confirmXpath = "/html/body/div[8]/div/div/div[2]/div[2]/div[3]/div";


}
