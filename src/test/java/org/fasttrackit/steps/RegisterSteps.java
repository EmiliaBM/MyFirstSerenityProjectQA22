package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class RegisterSteps {

        private CartPage cartPage;
        private HomePage homePage;
        private LoginPage loginPage;
        private AccountPage accountPage;
        private ProductsOnTheHomePage products;
        private ProductOnePage product1Page;
        private CheckOutPage checkOutPage;
        private RegisterPage registerPage;

        @Step
        public void navigateToRegister(){
            homePage.open();
            homePage.clickAccountLink();
            homePage.clickRegisterLink();
        }
        @Step
        public void enterRegisterCredentials(String firstName,String lastname, String password, String confPassword, String email){
            registerPage.registerFirstName(firstName);
            registerPage.registerLastName(lastname);
            registerPage.registerEmail(email);
            registerPage.registerPassword(password);
            registerPage.confirmPassword(confPassword);


        }
        @Step
        public void submitRegistration(){
            registerPage.setSubscribe();
            registerPage.registerAccount();
        }
        @Step
        public void checkRegisterMessage(String message){
            registerPage.getRegisterText(message);


        }

}
