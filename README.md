# StarWars Api
O império continua sua luta incessante de dominar a galáxia, tentando ao máximo expandir seu território e
eliminar os rebeldes.
Você, como um soldado da resistência, foi designado para desenvolver um sistema para compartilhar
recursos entre os rebeldes.

## Pre requisites

Você irá desenvolver uma API REST (sim, nós levamos a arquitetura da aplicação a sério mesmo no meio
de uma guerra), ao qual irá armazenar informação sobre os rebeldes, bem como os recursos que eles
possuem.
• Adicionar rebeldes
Um rebelde deve ter um nome, idade, gênero, localização (latitude, longitude e nome, na galáxia, da base ao
qual faz parte).
Um rebelde também possui um inventário que deverá ser passado na requisição com os recursos em sua
posse.
• Atualizar localização do rebelde
Um rebelde deve possuir a capacidade de reportar sua última localização, armazenando a nova
latitude/longitude/nome (não é necessário rastrear as localizações, apenas sobrescrever a última é o
suficiente).
• Reportar o rebelde como um traidor
Eventualmente algum rebelde irá trair a resistência e se aliar ao império. Quando isso acontecer, nós
precisamos informar que o rebelde é um traidor.
Um traidor não pode negociar os recursos com os demais rebeldes, não pode manipular seu inventário, nem
ser exibido em relatórios.

## Technologies used

* [SpringBoot](https://spring.io/projects/spring-boot) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management
* [H2 Database](https://www.h2database.com/html/main.html) - DataBase

## Installing

This project requires Jdk 11 (or later) and Gradle 7 (or later) to run.

```

```

## Running the tests

The tests can be run using Gradle command:

```

```

## Author

* **Bruno Câmara** 


