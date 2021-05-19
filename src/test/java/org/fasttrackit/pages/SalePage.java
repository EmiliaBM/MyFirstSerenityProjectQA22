package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SalePage extends PageObject {

    @FindBy(css = ".product-info  a[title='Slim fit Dobby Oxford Shirt']")
    private WebElementFacade FirstProduct;

    public void clickOnTheProductName(){
        clickOn(FirstProduct);
    }
}
