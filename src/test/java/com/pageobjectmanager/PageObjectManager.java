package com.pageobjectmanager;

import com.pageobjectmodel.CheckoutPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.ProductPage;
import com.utility.FileReaderManager;

public class PageObjectManager {

    private FileReaderManager fileReaderManager;
    private static PageObjectManager pageObjectManager;
    private LoginPage loginPage;
    private ProductPage productPage;
    private CheckoutPage checkoutPage;

    public FileReaderManager getFileReaderManager(){
        if(fileReaderManager == null){
            fileReaderManager = new FileReaderManager();
        }
        return fileReaderManager;
    }

    public static PageObjectManager getPageObjectManager(){
        if(pageObjectManager == null){
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }

    public CheckoutPage getCheckoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }

}
