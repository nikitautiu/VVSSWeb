package labweb.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import labweb.steps.serenity.EndUserSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/blog-data.csv")
public class BlogExistStory {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Steps
    public EndUserSteps anna;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Test
    public void blog_page_exists() {
        anna.is_blog_page(this.getId());
        anna.should_exist(true);
    }
}