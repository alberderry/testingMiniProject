package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
//import starter.screen.LoginScreen;
import starter.screen.FailRegisterScreen;

public class FailRegisterSteps {
//    @Steps
//    LoginScreen loginScreen;

    @Steps
    FailRegisterScreen failRegisterScreen;

    @When("New user click account")
    public void failAccount(){
        failRegisterScreen.failclickAccount();
}
    @When("New user click register")
    public void failuserClickRegisterLink(){
        failRegisterScreen.failclickRegisterLink();
    }

    @And("New user input name on name field")
    public void failinputNameField(){
        failRegisterScreen.failinputNameField();
    }

    @And("New user input email on email field")
    public void failinputEmailField(){
        failRegisterScreen.failinputEmailField();
    }

    @And("New user input password on password field")
    public void failinputPasswordField(){
        failRegisterScreen.failinputPassword();
    }

    @And("New user click register button")
    public void failclickRegisterButton(){
        failRegisterScreen.failclickRegisterButton();
    }

}
