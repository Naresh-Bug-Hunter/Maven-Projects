package com.runner;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class Runner_Class extends Base_Class {

    public static void main(String[] args) {

        launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validateLogin();
        PageObjectManager.getPageObjectManager().getProductPage().addSonyVaioToCart();
        PageObjectManager.getPageObjectManager().getProductPage().verifyCart();
        PageObjectManager.getPageObjectManager().getCheckoutPage().completePurchase();
        PageObjectManager.getPageObjectManager().getLoginPage().logout();
        driver.quit();
    }
}
