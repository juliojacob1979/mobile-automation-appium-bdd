package steps;

import io.cucumber.java.en.*;
import pages.BasePage;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginSteps {

    @Given("que o app está aberto")
    public void abrirApp() throws Exception {
        BasePage.startDriver();
    }

    @When("realizo login com usuário válido")
    public void loginValido() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("devo ver a tela de produtos")
    public void verificarTelaProdutos() {
        new ProductsPage(); // apenas inicializa a tela
    }

    @When("realizo logout")
    public void logout() {
        BasePage.quitDriver();
    }
}
