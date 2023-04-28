//package starter.screen;
//
//import com.github.javafaker.Faker;
//import io.appium.java_client.MobileBy;
//import net.thucydides.core.annotations.Step;
//import org.openqa.selenium.By;
//import test.automation.pageobject.BasePageObject;
//
//public class RegisterScreen extends BasePageObject {
//    public String name = createRandomName();
//
//    public String password = "password123";
//
//    private By registerLink(){
//        return MobileBy.id("textViewLinkRegister");
//    }
//
//    private By nameField(){
//        return MobileBy.id("textInputEditTextName");
//    }
//
//    private By emailField(){
//        return MobileBy.id("textInputEditTextEmail");
//    }
//
//    private By passwordField(){
//        return MobileBy.id("textInputEditTextPassword");
//    }
//
//    private By confirmPasswordField(){
//        return MobileBy.id("textInputEditTextConfirmPassword");
//    }
//
//    private By registerButton(){
//        return MobileBy.id("appCompatButtonRegister");
//    }
//
//    private By successMessage(){
//        return MobileBy.id("snackbar_text");
//    }
//
//    @Step
//    public void clickRegisterLink(){
//        onClick(registerLink());
//    }
//
//    @Step
//    public void inputNameField(){
//        onType(nameField(), createRandomName());
//    }
//
//    public void inputEmailField(){
//        onType(emailField(), createRandomName() + "@gmail.com");
//    }
//
//    @Step
//    public void inputPassword(){
//        onType(passwordField(), password);
//    }
//
//    @Step
//    public void confirmPassword(){
//        onType(confirmPasswordField(), password);
//    }
//
//    @Step
//    public void clickRegisterButton(){
//        onClick(registerButton());
//    }
//
//    @Step
//    public String getSuccessMessage(){
//        return waitUntilVisible(successMessage()).getText();
//    }
//
//    public String createRandomName(){
//        Faker faker = new Faker();
//        return faker.name().firstName();
//    }
//}
