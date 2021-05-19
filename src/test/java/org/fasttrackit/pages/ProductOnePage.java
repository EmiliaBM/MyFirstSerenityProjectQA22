package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductOnePage extends PageObject {

    @FindBy (css = "img[alt='Blue']")
    private WebElementFacade SelectColour;

    @FindBy (css = "a[name='xl'] > .swatch-label")
    private WebElementFacade SelectSize;

    @FindBy (css = ".product-shop button[title='Add to Cart']")
    private WebElementFacade AddToCart;

    @FindBy (css = "input#qty")
    private WebElementFacade quantity;

    public void setSelectColour (){
        clickOn(SelectColour);
    }
    public void setSelectSize() {
        clickOn(SelectSize);
    }
    public void AddToCart (){
        clickOn(AddToCart);
    }
    public void SelectQuantity(){
        clickOn(quantity.selectByIndex(1));
    }
}
