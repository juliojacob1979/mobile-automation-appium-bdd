package steps;

import io.cucumber.java.en.*;
import pages.ProductsPage;

public class CartSteps {

    ProductsPage productsPage = new ProductsPage();

    @Given("que estou logado")
    public void estouLogado() throws Exception {
        // pressupõe login já feito nos steps anteriores
    }

    @When("adiciono um produto ao carrinho")
    public void adicionarProduto() {
        productsPage.addItemToCart();
    }

    @Then("o item deve aparecer no carrinho")
    public void itemNoCarrinho() {
        productsPage.openCart();
    }
}
