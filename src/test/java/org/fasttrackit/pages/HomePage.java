package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy (css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy (css = ".level0.nav-5.parent > .has-children.level0")
    private WebElementFacade saleCategory;

    @FindBy (css = ".level0.nav-5.parent > .level0 > .level1.view-all > .level1")
    private WebElementFacade viewAllSales;

    public void clickAccountLink(){
        clickOn(accountLink);
    }
    public void clickLogInLink(){
        clickOn(logInLink);
    }
    public void clickRegisterLink(){
        clickOn(registerLink);
    }

    public void clickSaleCategory(){
        clickOn(saleCategory);
    }
    public void clickOnViewAllSales(){
        clickOn(viewAllSales);
    }


}
