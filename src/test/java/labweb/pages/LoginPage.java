package labweb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.phptravels.net/login")
public class LoginPage extends PageObject {

    @FindBy(name="username")
    private WebElementFacade userInput;

    @FindBy(name="password")
    private WebElementFacade passwordInput;

    @FindBy(css=".loginbtn")
    private WebElementFacade loginButton;

    public void enter_username(String user) {
        userInput.type(user);
    }

    public void enter_password(String password) {
        passwordInput.type(password);
    }

    public void click_login() {
        loginButton.click();
    }

    public boolean is_logged_in() {
        // returns whether there is an error
        return !find(By.cssSelector(".alert")).getText().contains("Invalid");
    }

}