package starter.screen;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class FailRegisterScreen extends BasePageObject {
    public String name = createRandomName();

    public String password = "Qwerty123";

    private By failaccount(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By failregisterLink(){
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By failnameField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By failemailField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By failpasswordField(){
        return MobileBy.xpath("\t\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }


    private By failregisterButton(){
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Register\"]");
    }

//    private By FailMessage(){
//        return MobileBy.xpath("\t\n" +
//                "//android.view.View[@content-desc=\"Gagal :(\"]");
//    }

    @Step
    public void failclickAccount(){
        onClick(failaccount());
    }
    @Step
    public void failclickRegisterLink(){
        onClick(failregisterLink());
    }

    @Step
    public void failinputNameField(){
        onType(failnameField(), createRandomName());
    }

    public void failinputEmailField(){
        onType(failemailField(), createRandomName() );
    }

    @Step
    public void failinputPassword(){
        onType(failpasswordField(), password);
    }

    @Step
    public void failclickRegisterButton(){
        onClick(failregisterButton());
    }


    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
