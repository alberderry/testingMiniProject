//package starter.stepdefinitions;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import org.junit.Assert;
//import starter.screen.LoginScreen;
//import starter.screen.RegisterScreen;
//
//public class RegisterSteps {
//    @Steps
//    LoginScreen loginScreen;
//
//    @Steps
//    RegisterScreen registerScreen;
//
//
//    @When("New user click register link")
//    public void userClickRegisterLink(){
//        registerScreen.clickRegisterLink();
//    }
//
//    @And("New user input name on name field")
//    public void inputNameField(){
//        registerScreen.inputNameField();
//    }
//
//    @And("New user input email on email field")
//    public void inputEmailField(){
//        registerScreen.inputEmailField();
//    }
//
//    @And("New user input password on password field")
//    public void inputPasswordField(){
//        registerScreen.inputPassword();
//    }
//
//    @And("New user confirm password")
//    public void confirmPassword(){
//        registerScreen.confirmPassword();
//    }
//
//    @And("New user click register button")
//    public void clickRegisterButton(){
//        registerScreen.clickRegisterButton();
//    }
//
//    @Then("New user see success message {string}")
//    public void seeSuccessRegister(String message){
//        Assert.assertEquals(message, registerScreen.getSuccessMessage());
//    }
//}
