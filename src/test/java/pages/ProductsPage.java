package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    @FindBy(accessibility = "test-ADD TO CART")
    private MobileElement addToCartButton;

    @FindBy(accessibility = "test-Cart")
    private MobileElement cartButton;

    public ProductsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void addItemToCart() {
        addToCartButton.click();
    }

    public void openCart() {
        cartButton.click();
    }
}
