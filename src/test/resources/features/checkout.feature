Feature: Finalizar compra

  Scenario: Finalização de compra com sucesso
    Given que tenho um item no carrinho
    When confirmo o checkout
    Then devo ver a mensagem de sucesso
