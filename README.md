# Automação Mobile - Appium + Java + BDD

Projeto de automação mobile para testes funcionais no app `MyDemoAppRN` (Android).

## Tecnologias
- Java 17
- Maven
- Appium
- Cucumber (BDD)
- JUnit
- Selenium

## Device Utilizado
- Emulador: Pixel 6 (AVD)
- Android Version: 13.0
- App: `/apps/Android-MyDemoAppRN.apk`

## Execução dos Testes

1. Inicie o servidor Appium:
```bash
appium
```

2. Execute os testes via Maven:
```bash
mvn test
```

## Estrutura do Projeto
- `pages/`: Page Objects
- `steps/`: Steps BDD
- `features/`: Cenários de Teste

## Relatórios
Após execução, o relatório será gerado em:
`target/cucumber-reports.html`
