package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

    @FindBy(accessibility = "test-CHECKOUT")
    private MobileElement checkoutButton;

    @FindBy(accessibility = "test-FINISH")
    private MobileElement finishButton;

    public CheckoutPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void finalizePurchase() {
        checkoutButton.click();
        finishButton.click();
    }
}
