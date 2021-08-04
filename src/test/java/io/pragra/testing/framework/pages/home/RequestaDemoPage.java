package io.pragra.testing.framework.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestaDemoPage {

    WebDriver driver ;

    @FindBy(id="email")  WebElement emailAddress;
    @FindBy(id="company")  WebElement companyName;
    @FindBy(id="first_name")  WebElement firstName;
    @FindBy(id="last_name")  WebElement lastName;
    @FindBy(id="00Nd0000007MFAl")  WebElement employeeCount;
    @FindBy(id="phone")  WebElement phone;
    @FindBy(id="country")  WebElement country;
    @FindBy(id="state")  WebElement state;
    @FindBy(id="description")  WebElement addtionalInformation;
    @FindBy(id="zipcode")  WebElement zipCode;
    @FindBy(id="btnSubmit")  WebElement submit;



}
