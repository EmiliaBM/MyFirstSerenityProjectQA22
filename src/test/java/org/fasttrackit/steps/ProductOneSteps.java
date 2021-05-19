package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductOnePage;
import org.fasttrackit.pages.SalePage;


public class ProductOneSteps {

    private CartPage cartPage;
    private HomePage homePage;
    private SalePage salePage;
    private ProductOnePage productOnePage;

    @Step

    public void navigateToHomePage(){
        homePage.open();
        homePage.clickSaleCategory();
        homePage.clickOnViewAllSales();
    }

    public void navigateToSalePage(){
        salePage.clickOnTheProductName();
    }

    public void AddOneProductToCart(){
        productOnePage.setSelectColour();
        productOnePage.setSelectSize();
        productOnePage.SelectQuantity();
        productOnePage.AddToCart();
    }
    @Step

    public void checkUserIsOnCartPage(String message){
        cartPage.verifyWelcomeMessageCart(message);
    }
}
