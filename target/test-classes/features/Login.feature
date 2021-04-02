#language: pt


@Test
Funcionalidade: Realizar Login no site

@TesteCT01
Cenario: Realizar Login com usuario valido
	Dado que eu acesso a tela de login 
	Quando informo os dados corretos de login
	| 	usuario 		| 		senha 	|
	|	standard_user	|secret_sauce |
	Entao valido se o login e realizado com sucesso