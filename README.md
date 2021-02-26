Tecnologias:
•	Linguagem Java.
•	Escrita no cenário BDD: Cucumber.
Projeto:
	 A construção foi automatizada na IDE Eclipese usando o projeto Maven, com criação de Packages e Class.  No folder src/teste/java, foram criados três packges; elemento, métodos e testes. Dentro de cada packages, foram criados três Class; Elem, Mtd e Stp. No folder src/teste/resources, foi gerado uma shoestok.feature que executa o projeto em escrita BDD.
	Na Class Elem foram feitas as inspeções dos elementos da pagina Shoestock.
	Na Class Mtd, foram criados os métodos para manipular os elementos.
	Na Class Stp, onde são construido a estrutura de execução, chamando os métodos e elementos dentro da escrita BDD Cucumber.
	Na execução só é aprovado ou validada através do JUNIT, que a grosso modo valida o valor esperado com o valor obtido.
