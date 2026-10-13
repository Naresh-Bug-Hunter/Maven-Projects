package com.pageobjectmodel;
import com.base.Base_Class;
import com.interfaceelements.CheckoutInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.utility.FileReaderManager.getProperty;

public class CheckoutPage extends Base_Class implements CheckoutInterfaceElements {

        @FindBy(xpath = name_xpath)
        public static WebElement name;

        @FindBy(xpath = country_xpath)
        public static WebElement country;

        @FindBy(xpath = city_xpath)
        public static WebElement city;

        @FindBy(xpath = card_xpath)
        public static WebElement card;

        @FindBy(xpath = month_xpath)
        public static WebElement month;

        @FindBy(xpath = year_xpath)
        public static WebElement year;

        @FindBy(xpath = purchase_xpath)
        public static WebElement purchase;

        @FindBy(xpath = confirmation_xpath)
        public static WebElement confirmation;

        @FindBy(xpath = orderDetails_xpath)
        public static WebElement orderDetails;

        @FindBy(xpath = confirmationOK_xpath)
        public static WebElement confirmationOK;

        @FindBy(css = closeButton_css)
        public static WebElement closeButton;

        public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

        public static void completePurchase() {

        waitForElement(name, 10);
            passInput(name, getProperty("checkoutName"));
            passInput(country, getProperty("checkoutCountry"));
            passInput(city, getProperty("checkoutCity"));
            passInput(card, getProperty("checkoutCard"));
            passInput(month, getProperty("checkoutMonth"));
            passInput(year, getProperty("checkoutYear"));
            elementClick(purchase);
            waitForElement(confirmation, 10);
            System.out.println(getText(confirmation));
            takeScreenshot();
            waitForElementToBeClickable(confirmationOK, 10);
            elementClick(confirmationOK);
            waitForElementToBeClickable(closeButton, 10);
            elementClick(closeButton);
            System.out.println("Purchase completed successfully");
        }
}
