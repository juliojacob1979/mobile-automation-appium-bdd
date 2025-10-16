Feature: Carrinho de compras

  Scenario: Adicionar item ao carrinho
    Given que estou logado
    When adiciono um produto ao carrinho
    Then o item deve aparecer no carrinho
