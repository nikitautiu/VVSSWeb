package labweb.steps.serenity;

import labweb.pages.BlogPage;
import labweb.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LoginPage loginPage;
    BlogPage blogPage;

//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }

    @Step
    public void is_the_login_page() {
        loginPage.open();
    }

    @Step
    public void enters_username(String username) {
        loginPage.enter_username(username);
    }

    @Step
    public void enters_password(String password) {
        loginPage.enter_password(password);
    }

    @Step
    public void clicks_login() {
        loginPage.click_login();
    }

    @Step
    public void attempts_login(String username, String password) {
        enters_username(username);
        enters_password(password);
        clicks_login();
    }

    @Step
    public void should_be_logged_in(Boolean logged) {
        if(logged)
            assertThat("the user should be logged in", loginPage.is_logged_in());
        else
            assertThat("the user should not be logged in", !loginPage.is_logged_in());

    }

    @Step
    public void is_blog_page(String id) {
        blogPage.open_page(id);
    }

    @Step
    public void should_exist(boolean should) {
        if(should)
            assertThat("page should exist", blogPage.exists());
        else
            assertThat("page should not exist", !blogPage.exists());
    }

}