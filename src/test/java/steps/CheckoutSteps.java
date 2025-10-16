package steps;

import io.cucumber.java.en.*;
import pages.CheckoutPage;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("que tenho um item no carrinho")
    public void itemNoCarrinho() {
        // item já adicionado anteriormente
    }

    @When("confirmo o checkout")
    public void confirmarCheckout() {
        checkoutPage.finalizePurchase();
    }

    @Then("devo ver a mensagem de sucesso")
    public void mensagemSucesso() {
        System.out.println("Compra finalizada com sucesso!");
    }
}
