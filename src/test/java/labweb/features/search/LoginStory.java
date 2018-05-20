package labweb.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import labweb.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class LoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Test
    public void logging_in_unsuccessfully() {
        anna.is_the_login_page();
        anna.attempts_login("aaa", "aaa");
        anna.should_be_logged_in(false);
    }

    @Test
    public void logging_in_successfully() {
        anna.is_the_login_page();
        anna.attempts_login("user@phptravels.com", "demouser");
        anna.should_be_logged_in(true);
    }

} 