$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Realizar Login no site",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "Realizar Login com usuario valido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@TesteCT01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesso a tela de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.que_eu_acesso_a_tela_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo os dados corretos de login",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ],
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.informo_os_dados_corretos_de_login(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o login e realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.valido_se_o_login_e_realizado_com_sucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});