package labweb.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.phptravels.net/blog/{1}")
public class BlogPage extends PageObject {

    public void open_page(String id) {
        this.open(withParameters(id));
    }

    public boolean exists() {
        // returns whether the title is not empty
        return !find(By.cssSelector(".RTL h3")).getText().isEmpty();
    }

}