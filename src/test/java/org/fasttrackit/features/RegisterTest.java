package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private LoginTest loginTest;
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerNewAccount() {
        registerSteps.navigateToRegister();

        registerSteps.enterRegisterCredentials("Bogdan", "BM",
                "Parola17","Parola17","bogdan.n.babalau@gmail.com");

        registerSteps.submitRegistration();

        registerSteps.checkRegisterMessage("There is already an account with this email address. If you are sure that it is your email address," +
                " click here to get your password and access your account.");
    }

}
