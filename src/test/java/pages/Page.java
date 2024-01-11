package pages;

import org.openqa.selenium.By;

public class Page {

    public static final By PRIMARY_BUTTON = By.xpath("//a[@href='/add-primary-account']");
    public static final By PRIMARY_ACCOUNT_HEADING = By.xpath("//h2[contains(text(),'Create Primary Account Holder')]");
    public static final By EMAIL = By.id("email");
    public static final By TITLE = By.xpath("//option[@value='Mr.']");
    public static final By FIRSTNAME = By.id("firstName");
    public static final By LASTNAME = By.id("lastName");
    public static final By GENDER = By.xpath("//option[@value='MALE']");
    public static final By MARITAL_STATUS = By.xpath("//option[@value='SINGLE']");
    public static final By EMPLOYMENT_STATUS = By.id("employmentStatus");
    public static final By DATE_OF_BIRTH = By.id("dateOfBirth");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[@class='chakra-button css-jut409']");
    public static final By SIGNUP_ACCOUNT_HEADING = By.xpath("//h2[contains(text(),'Sign up your account')]");
    public static final By VERIFY_EMAIL = By.xpath("//h2[@class='chakra-heading css-18j379d'][2]");
    public static final By ACCOUNT_EXISTS_ERROR = By.xpath("//div[@class='chakra-alert__title css-tidvy5']");
}
