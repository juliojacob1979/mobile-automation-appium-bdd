Feature: Login e Logout

  Scenario: Login com sucesso
    Given que o app está aberto
    When realizo login com usuário válido
    Then devo ver a tela de produtos

  Scenario: Logout com sucesso
    Given que estou logado
    When realizo logout
    Then devo voltar para a tela de login
