package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductOneSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class ProductOneTest {
    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps

    private ProductOneSteps productOneSteps;

    @Test
    public void addOneProductToCart(){
        productOneSteps.navigateToHomePage();
        productOneSteps.navigateToSalePage();
        productOneSteps.AddOneProductToCart();

    }
}
