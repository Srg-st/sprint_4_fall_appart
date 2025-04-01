# Sprint_4
Конфигурация системы, в которой выполнен проект: 
Java 11, 
Maven 3.9.9
JUnit 4.13.2, 
Selenium 4.30.0,
WebdriverManager 6.0.0

В проекте реализован тестовый позитивный сценарий проведения заказа самоката

Так же осуществлена проверка содержания ответов в блоке "Вопросы о важном"


В проекте реализована WebDriverFactory для запуска тестов через браузеры Chrome и FireFox

Chrome браузер для запуска установлен по умолчанию.

Для запуска тестов можно использовать команды:

`mvn clean test`

`mvn test -Dbrowser=chrome`

`mvn test -Dbrowser=firefox`